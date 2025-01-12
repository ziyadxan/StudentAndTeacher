package com.studentandteacher.service.Impl;

import com.studentandteacher.entity.Student;
import com.studentandteacher.entity.Teacher;
import com.studentandteacher.repository.StudentRepository;
import com.studentandteacher.repository.TeacherRepository;
import com.studentandteacher.service.TeacherService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository repository;

    public TeacherServiceImpl(TeacherRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Teacher> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Student> getByName(String name) {
        return List.of();
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, Student student) {

    }

    @Override
    public List<Student> getByExperience(Integer experience) {
        return List.of();
    }

    @Override
    public List<Student> getBySalary(Double salary) {
        return List.of();
    }
}
