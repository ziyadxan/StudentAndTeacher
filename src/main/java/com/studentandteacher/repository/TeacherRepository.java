package com.studentandteacher.repository;

import com.studentandteacher.entity.Student;
import com.studentandteacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Student> findByName(String name);

    List<Student> getByExperience(Integer experience);

    List<Student> getBySalary(Double salary);
}
