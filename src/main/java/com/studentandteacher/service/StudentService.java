package com.studentandteacher.service;

import com.studentandteacher.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    List<Student> getByName(String name);

    void create(Student student);

    Student getById(Long id);

    void delete(Long id);

    void update(Long id, Student student);

    List<Student> getByYear(Integer year);

    List<Student> getByGpo(Integer gpo);

}
