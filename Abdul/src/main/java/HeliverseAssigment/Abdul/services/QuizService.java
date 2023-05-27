package HeliverseAssigment.Abdul.services;

import HeliverseAssigment.Abdul.entites.Quiz;
import HeliverseAssigment.Abdul.payloads.QuizDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuizService
{
    QuizDto createQuiz(QuizDto quizDto);
    List<QuizDto> getActiveQuiz();

    List<QuizDto> getAllQuiz();
    QuizDto  getQuizResult(Integer id);


}
