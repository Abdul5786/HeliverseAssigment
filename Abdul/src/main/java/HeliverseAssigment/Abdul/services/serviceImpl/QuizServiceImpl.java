package HeliverseAssigment.Abdul.services.serviceImpl;

import HeliverseAssigment.Abdul.entites.Quiz;
import HeliverseAssigment.Abdul.entites.Status;
import HeliverseAssigment.Abdul.payloads.QuizDto;
import HeliverseAssigment.Abdul.repositories.QuizRepo;
import HeliverseAssigment.Abdul.services.QuizService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    QuizRepo quizRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public QuizDto createQuiz(QuizDto quizDto) {
        Quiz savequiz = this.quizDtoToQuiz(quizDto);
        savequiz.setStatus(Status.INACTIVE);
        Quiz save = quizRepo.save(savequiz);
        return this.quizToQuizDto(save);
//        Quiz quiz = new Quiz();
//        quiz.setStatus(Status.INACTIVE);
//        quiz.setQuestion(quizDto.getQuestion());
//        quiz.setEndDate(quizDto.getEndDate());
//        quiz.setStartDate(quizDto.getStartDate());
//        quiz.setOptions(quizDto.getOptions());
//        quiz.setRightanswer(quizDto.getRightanswer());
//        Quiz savequiz = quizRepo.save(quiz);
//        return  this.quizToQuizDto(savequiz);
    }

    @Override
    public List<QuizDto> getActiveQuiz() {
        LocalDateTime now = LocalDateTime.now();
        List<Quiz> activeQuizzes = quizRepo.findAllByStatus(Status.ACTIVE);
        if (activeQuizzes != null) {
            return activeQuizzes.stream().map(e -> this.quizToQuizDto(e)).collect(Collectors.toList());
        }
return null;
    }


    @Override
    public List<QuizDto> getAllQuiz()
    {
        List<Quiz> quizdtolist = quizRepo.findAll();
        return quizdtolist.stream().map(q->(this.quizToQuizDto(q))).collect(Collectors.toList());
    }

    @Override
    public  QuizDto getQuizResult(Integer id)
    {
        Optional<Quiz> byId = quizRepo.findById(id);
        Quiz quiz = byId.get();
        return this.quizToQuizDto(quiz);
    }


    public Quiz quizDtoToQuiz(QuizDto quizDto)
    {
        return this.modelMapper.map(quizDto, Quiz.class);
    }

    public  QuizDto quizToQuizDto ( Quiz quiz)
    {
        return this.modelMapper.map(quiz,QuizDto.class);
    }
}