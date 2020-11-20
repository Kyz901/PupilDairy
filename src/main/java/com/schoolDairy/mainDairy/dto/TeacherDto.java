package com.schoolDairy.mainDairy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@ToString
public class TeacherDto {

    private Long Id;
    private String firstName;
    private String lastName;
    private String fatherName;

}
