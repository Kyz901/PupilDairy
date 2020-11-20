package com.schoolDairy.mainDairy.service.impl;

import com.schoolDairy.mainDairy.model.Lesson;
import com.schoolDairy.mainDairy.model.Teacher;
import com.schoolDairy.mainDairy.repository.LessonRepository;
import com.schoolDairy.mainDairy.repository.PupilRepository;
import com.schoolDairy.mainDairy.repository.SchoolClassRepository;
import com.schoolDairy.mainDairy.repository.TeacherRepository;
import com.schoolDairy.mainDairy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final PupilRepository pupilRepository;
    private final TeacherRepository teacherRepository;
    private final LessonRepository lessonRepository;
    private final SchoolClassRepository schoolClassRepository;

    @Override
    public List<Teacher> getAllTeacher() {

        return teacherRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public List<Lesson> getAllLessonForPn() {
        return lessonRepository.findAll().stream().filter(u -> u.getDayOfWeak().equals("ПН")).collect(Collectors.toList());
    }

    @Override
    public String getFullNameOfTeacher(Long id){
        Teacher teacher = teacherRepository.getOne(id);
        String fullName = teacher.getLastName() + " " + teacher.getFirstName() + " " + teacher.getFatherName();
        return fullName;
    }


}
