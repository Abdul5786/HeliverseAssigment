package HeliverseAssigment.Abdul.entites;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "quiztable")
@NoArgsConstructor
public class Quiz
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;

    @Column( name = "Questions",nullable = false,length = 200)
     private String question;
    @Column( name = "Options",nullable = false,length = 200)
     private  String[] options;
    @Column( name = "RightAnswers",nullable = false,length = 200)
     private int rightanswer;
    @Column( name = "StartDateTime",nullable = false,length = 200)
     private LocalDateTime startDate;
    @Column( name = "EndDateTime",nullable = false,length = 200)
     private LocalDateTime endDate;
    @Column( name = "Status",nullable = false,length = 200)
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
