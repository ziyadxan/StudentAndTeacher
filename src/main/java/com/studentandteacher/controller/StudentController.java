package com.studentandteacher.controller;

import com.studentandteacher.entity.Student;
import com.studentandteacher.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {


    private final StudentService service;


    @GetMapping("/all")
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/name")
    public List<Student> getByName(@PathVariable String name) {
        return service.getByName(name);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        service.create(student);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody Student obj) {
        service.update(id, obj);
    }

}