package com.learnar.activityService.models;


import javax.persistence.*;

@Entity
public class Experiences {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    private String description;


    private String state;

    @ManyToOne
    private Courses coursesId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Courses getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(Courses coursesId) {
        this.coursesId = coursesId;
    }

    public Experiences(String name, String description,  Courses coursesId,String state) {
        this.name = name;
        this.description = description;

        this.coursesId = coursesId;
        this.state = state;
    }

    public Experiences() {
    }
}
