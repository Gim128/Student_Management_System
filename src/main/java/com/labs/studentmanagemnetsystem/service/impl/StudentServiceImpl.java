package com.labs.studentmanagemnetsystem.service.impl;

import com.labs.studentmanagemnetsystem.entity.Student;
import com.labs.studentmanagemnetsystem.repository.StudentRepositary;
import com.labs.studentmanagemnetsystem.service.StudnetService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GImhan Pabasara <gimhanpabasara4@gmail.com> (www.gimhanpabasara.tk)
 * @since 12/7/2022
 */


@Service
public class StudentServiceImpl implements StudnetService {

    private StudentRepositary studentRepositary;

    public StudentServiceImpl(StudentRepositary studentRepositary) {
        super();
        this.studentRepositary = studentRepositary;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepositary.findAll();
    }
}
