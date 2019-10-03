package com.uchain.exam.service.impl;

import com.uchain.exam.dao.StudentMapper;
import com.uchain.exam.entity.Student;
import com.uchain.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author baobao
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int add(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public List<Student> findById(String id) {
        return studentMapper.selectByStudentId(id);
    }

    @Override
    public List<Student> findByDirection(String direction) {
        return studentMapper.selectByDirection(direction);
    }
}
