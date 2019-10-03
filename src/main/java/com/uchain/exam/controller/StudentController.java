package com.uchain.exam.controller;

import com.uchain.exam.VO.ResultVO;
import com.uchain.exam.form.StudentForm;
import com.uchain.exam.entity.Student;
import com.uchain.exam.service.ExportWordService;
import com.uchain.exam.service.StudentService;
import com.uchain.exam.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author baobao
 */
@RequestMapping("/student")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private ExportWordService exportWordService;

    @GetMapping("/list")
    public ResultVO list(){
        return ResultVOUtil.success(studentService.findAll());
    }

    @PostMapping("/add")
    public  ResultVO add(@RequestBody StudentForm studentForm){
        Student student = new Student();
        BeanUtils.copyProperties(studentForm,student);
        studentService.add(student);
        return ResultVOUtil.success();
    }

    @PostMapping("/exportFront")
    public ResultVO exportFront() throws IOException {
        List<Student> studentList = studentService.findByDirection("前端");
        for (Student student : studentList){
            exportWordService.exportWord(student,"前端");
        }
        return ResultVOUtil.success();
    }


    @PostMapping("/exportBack")
    public ResultVO exportFrontBack() throws IOException {
        List<Student> studentList = studentService.findByDirection("后端");
        for (Student student : studentList){
            exportWordService.exportWord(student,"后端");
        }
        return ResultVOUtil.success();
    }

    @PostMapping("/export")
    public ResultVO export(List<Integer> integerList) throws IOException {
        List<Student> studentList = new ArrayList<>();
        Student student;
        for(Integer integer:integerList){
            student = studentService.findById(integer);
            studentList.add(student);
        }
        for (Student student1 : studentList){
            exportWordService.exportWord(student1,"前端");
        }
        return ResultVOUtil.success();
    }






}
