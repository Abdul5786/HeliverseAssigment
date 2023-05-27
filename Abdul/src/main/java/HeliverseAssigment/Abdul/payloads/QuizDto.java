package HeliverseAssigment.Abdul.payloads;

import HeliverseAssigment.Abdul.entites.Status;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class QuizDto
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String question;
    private  String[] options;
    private int rightanswer;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getRightanswer() {
        return rightanswer;
    }

    public void setRightanswer(int rightanswer) {
        this.rightanswer = rightanswer;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
