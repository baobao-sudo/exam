package com.uchain.exam.service;


import com.uchain.exam.entity.Student;

import java.util.List;

/**
 * @author baobao
 * @date 2019-9-20
 */
public interface StudentService {

    /**
     * 通过id查找
     * @param id
     * @return
     */
    Student findById(Integer id);
    /**
     * 查询所有
     * @return
     */
    List<Student> findAll();

    /**
     * 增加学生
     * @param student
     * @return
     */
    int add(Student student);


    /**
     * 通过学号查找
     * @param id
     * @return
     */
    List<Student> findById(String id);

    /**
     * 通过方向查找
     * @param direction
     * @return
     */
    List<Student> findByDirection(String direction);
}
