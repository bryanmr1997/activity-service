package com.learnar.activityService.models;


import javax.persistence.*;

@Entity
public class Activity_Question {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "activity_id",referencedColumnName = "id")
    private  Activities activities;

    @ManyToOne
    @JoinColumn(name = "question_id",referencedColumnName = "id")
    private Questions questions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Activities getActivities() {
        return activities;
    }

    public void setActivities(Activities activities) {
        this.activities = activities;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }


    public Activity_Question() {
    }

    public Activity_Question(Activities activities, Questions questions) {
        this.activities = activities;
        this.questions = questions;
    }



}
