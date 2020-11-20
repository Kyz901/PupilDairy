package com.schoolDairy.mainDairy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "pupils")
public class Pupil implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "father_name")
    private String fatherName;
    private String birthday;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "id_of_class")
    private SchoolClass schoolClass;
    @Column(name = "start_year_education")
    private String startYearEducation;
    private Boolean isDeleted;
    private Boolean isGraduated;


}
