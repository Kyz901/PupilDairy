package com.schoolDairy.mainDairy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "lessons")
public class Lesson implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "name_of_lesson")
    private String nameOfLesson;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_teacher")
    private Teacher teacher;
    @Column(name = "day_of_weak")
    private String dayOfWeak;
    @Column(name = "num_of_lesson")
    private String numOfLesson;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_school_class")
    private SchoolClass schoolClass;

}
