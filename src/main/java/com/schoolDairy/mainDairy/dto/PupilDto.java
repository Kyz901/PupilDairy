package com.schoolDairy.mainDairy.dto;

import com.schoolDairy.mainDairy.model.SchoolClass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class PupilDto {
    private Long Id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String birthday;
    private SchoolClass schoolClass;
    private String startYearEducation;
    private Boolean isDeleted;
    private Boolean isGraduated;
}
