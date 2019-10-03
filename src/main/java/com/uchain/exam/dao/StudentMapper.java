package com.uchain.exam.dao;

import com.uchain.exam.entity.Student;
import java.util.List;

/**
 * @author baobao
 */
public interface StudentMapper {
    /**
     * 通过id删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一条新的信息
     * @param record
     * @return
     */
    int insert(Student record);

    /**
     * 通过id查找
     * @param id
     * @return
     */
    Student selectByPrimaryKey(Integer id);

    /**
     * 查找所有
     * @return
     */
    List<Student> selectAll();

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Student record);

    /**
     * 通过学号查找
     * @param studentId
     * @return
     */
    List<Student> selectByStudentId(String studentId);

    /**
     * 通过方向查找
     * @param direction
     * @return
     */
    List<Student> selectByDirection(String direction);
}