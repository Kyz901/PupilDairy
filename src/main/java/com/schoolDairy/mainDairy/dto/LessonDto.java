package com.schoolDairy.mainDairy.dto;

import com.schoolDairy.mainDairy.model.SchoolClass;
import com.schoolDairy.mainDairy.model.Teacher;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class LessonDto {

    private Long Id;
    private String nameOfLesson;
    private Teacher teacher;
    private String dayOfWeak;
    private String numOfLesson;
    private SchoolClass schoolClass;
}
