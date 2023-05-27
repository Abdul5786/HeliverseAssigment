package HeliverseAssigment.Abdul.repositories;

import HeliverseAssigment.Abdul.entites.Quiz;
import HeliverseAssigment.Abdul.entites.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface QuizRepo extends JpaRepository<Quiz,Integer>
{
    List<Quiz> findAllByStatus(Status status);
    List<Quiz> findAllByStartTimeBeforeAndEndTimeAfter(LocalDateTime startTime, LocalDateTime endTime);
    // Add any additional query methods if needed
}
