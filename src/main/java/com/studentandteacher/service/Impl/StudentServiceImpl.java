package com.studentandteacher.service.Impl;

import com.studentandteacher.entity.Student;
import com.studentandteacher.repository.StudentRepository;
import com.studentandteacher.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> getByYear(Integer year) {
        return repository.getByYear(year);
    }

    @Override
    public List<Student> getByGpo(Integer gpo) {
        return repository.getByGpo(gpo);
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Student> getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void create(Student student) {
        repository.save(student);
    }

    @Override
    public Student getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, Student student) {
        Student student1 = repository.findById(id).orElseThrow();
        student1.setName(student.getName());
        student1.setSurname(student.getSurname());
        student1.setAddress(student.getAddress());
        student1.setPhone(student.getPhone());
        student1.setAge(student.getAge());
        student1.setGpo(student.getGpo());
        student1.setYear(student.getYear());
        repository.save(student1);
    }
}
