package com.labs.studentmanagemnetsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.labs.studentmanagemnetsystem.service.StudnetService;

/**
 * @author GImhan Pabasara <gimhanpabasara4@gmail.com> (www.gimhanpabasara.tk)
 * @since 12/7/2022
 */

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }
//58:56
//    handler method
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAllAttributes("students", studentService.getAllStudents());
        return "students";
    }
}
