package com.schoolDairy.mainDairy.controller;



import com.schoolDairy.mainDairy.dto.LessonDto;
import com.schoolDairy.mainDairy.dto.TeacherDto;
import com.schoolDairy.mainDairy.model.Lesson;
import com.schoolDairy.mainDairy.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/api/dairy")
@RequiredArgsConstructor
public class DairyController {

    private final UserService userService;

    @GetMapping("/teacher")
    public String getUserFullNameOfTeacher(@RequestParam Long id){

        return userService.getFullNameOfTeacher(id);

    }
    @GetMapping("/lesson/pn")
    public List<LessonDto> getAllLessonsForPn(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory.getMapperFacade().mapAsList(userService.getAllLessonForPn(),LessonDto.class);

    }
    @GetMapping("/teacher/all")
    public List<TeacherDto> getAllTeachers(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory.getMapperFacade().mapAsList(userService.getAllTeacher(),TeacherDto.class);
    }

}