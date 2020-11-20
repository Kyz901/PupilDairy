package com.schoolDairy.mainDairy.dto;

import com.schoolDairy.mainDairy.model.Teacher;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class SchoolClassDto {
    private Long Id;
    private String nameOfClass;
    private Teacher teacher;
}
