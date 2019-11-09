package com.crankysparrow.studentdata.api;

import com.crankysparrow.studentdata.model.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/students")
public class Studentcontroller {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(new Student("Tommi", "Lehtisaari"),
                new Student("Kalle", "Kustaa"));

    }

}
