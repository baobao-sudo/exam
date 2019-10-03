package com.uchain.exam.service;

import com.uchain.exam.entity.Student;

import java.io.IOException;

/**
 * @author baobao
 */
public interface ExportWordService {
    /**
     * 导出一个学生信息到docx文档
     * @param student
     * @param direction
     * @throws IOException
     */
    void exportWord(Student student,String direction) throws IOException;
}
