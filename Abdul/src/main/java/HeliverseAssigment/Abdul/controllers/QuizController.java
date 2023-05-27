package HeliverseAssigment.Abdul.controllers;

import HeliverseAssigment.Abdul.entites.Quiz;
import HeliverseAssigment.Abdul.payloads.QuizDto;
import HeliverseAssigment.Abdul.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController
{
    @Autowired
    QuizService quizService;

    @PostMapping
    public ResponseEntity<QuizDto> createQuiz(@RequestBody QuizDto quizDto)
    {
        QuizDto quiz = quizService.createQuiz(quizDto);
        return new ResponseEntity<>(quiz,HttpStatus.CREATED);
    }
    @GetMapping(value = "/active")
    public ResponseEntity<List<QuizDto>> getAllActiveQuiz()
    {
        List<QuizDto> activeQuiz = quizService.getActiveQuiz();
        return new ResponseEntity<>(activeQuiz,HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<QuizDto>> getAllQuizz()
    {
        List<QuizDto> allQuiz = quizService.getAllQuiz();
        return new ResponseEntity<>(allQuiz,HttpStatus.OK);
    }

   @GetMapping(value = "{Id}")
    public ResponseEntity<QuizDto> getQuizById(@PathVariable Integer Id)
   {
       QuizDto quizResult = quizService.getQuizResult(Id);
       return new ResponseEntity<>(quizResult,HttpStatus.OK);
   }


}
