package com.schoolDairy.mainDairy.service;

import com.schoolDairy.mainDairy.model.Lesson;
import com.schoolDairy.mainDairy.model.Teacher;

import java.util.List;

public interface UserService {
    public String getFullNameOfTeacher(Long id);
    public List<Teacher> getAllTeacher();
    public List<Lesson> getAllLessonForPn();

}