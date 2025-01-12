package com.studentandteacher.service;

import com.studentandteacher.entity.Teacher;
import com.studentandteacher.entity.Student;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAll();

    List<Student> getByName(String name);

    void create(Student student);

    Student getById(Long id);

    void delete(Long id);

    void update(Long id, Student student);

    List<Student> getByExperience(Integer experience);

    List<Student> getBySalary(Double salary);

}
