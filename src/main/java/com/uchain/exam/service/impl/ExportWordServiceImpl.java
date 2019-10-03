package com.uchain.exam.service.impl;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.DocxRenderData;
import com.uchain.exam.VO.QuestionVO;
import com.uchain.exam.VO.StudentVO;
import com.uchain.exam.entity.Student;
import com.uchain.exam.service.ExportWordService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author baobao
 */
@Service
public class ExportWordServiceImpl implements ExportWordService {


    @Override
    public void exportWord(Student student,String direction) throws IOException {
        StudentVO studentVO = new StudentVO();
        BeanUtils.copyProperties(student, studentVO);
        List<QuestionVO> questionVOList = new ArrayList<>();
        QuestionVO questionVO01 = new QuestionVO();
        questionVO01.setTitle("第1题:");
        questionVO01.setContent(student.getQuestion01());
        questionVOList.add(questionVO01);
        QuestionVO questionVO02 = new QuestionVO();
        questionVO02.setTitle("第2题:");
        questionVO02.setContent(student.getQuestion02());
        questionVOList.add(questionVO02);
        QuestionVO questionVO03 = new QuestionVO();
        questionVO03.setTitle("第3题:");
        questionVO03.setContent(student.getQuestion03());
        questionVOList.add(questionVO03);
        QuestionVO questionVO04 = new QuestionVO();
        questionVO04.setTitle("第4题:");
        questionVO04.setContent(student.getQuestion04());
        questionVOList.add(questionVO04);
        QuestionVO questionVO05 = new QuestionVO();
        questionVO05.setTitle("第5题:");
        questionVO05.setContent(student.getQuestion05());
        questionVOList.add(questionVO05);
        QuestionVO questionVO06 = new QuestionVO();
        questionVO06.setTitle("第6题:");
        questionVO06.setContent(student.getQuestion06());
        questionVOList.add(questionVO06);
        QuestionVO questionVO07 = new QuestionVO();
        questionVO07.setTitle("第7题:");
        questionVO07.setContent(student.getQuestion07());
        questionVOList.add(questionVO07);
        QuestionVO questionVO08 = new QuestionVO();
        questionVO08.setTitle("第8题:");
        questionVO08.setContent(student.getQuestion08());
        questionVOList.add(questionVO08);
        QuestionVO questionVO09 = new QuestionVO();
        questionVO09.setTitle("第9题:");
        questionVO09.setContent(student.getQuestion09());
        questionVOList.add(questionVO09);
        QuestionVO questionVO10 = new QuestionVO();
        questionVO10.setTitle("第10题:");
        questionVO10.setContent(student.getQuestion10());
        questionVOList.add(questionVO10);
        QuestionVO questionVO11 = new QuestionVO();
        questionVO11.setTitle("第11题:");
        questionVO11.setContent(student.getQuestion11());
        questionVOList.add(questionVO11);
        QuestionVO questionVO12 = new QuestionVO();
        questionVO12.setTitle("第12题:");
        questionVO12.setContent(student.getQuestion12());
        questionVOList.add(questionVO12);
        QuestionVO questionVO13 = new QuestionVO();
        questionVO13.setTitle("第13题:");
        questionVO13.setContent(student.getQuestion13());
        questionVOList.add(questionVO13);
        QuestionVO questionVO14 = new QuestionVO();
        questionVO14.setTitle("第14题:");
        questionVO14.setContent(student.getQuestion14());
        questionVOList.add(questionVO14);
        QuestionVO questionVO15 = new QuestionVO();
        questionVO15.setTitle("第15题:");
        questionVO15.setContent(student.getQuestion15());
        questionVOList.add(questionVO15);
        DocxRenderData docxRenderData = new DocxRenderData(new File("/home/admin/export/question.docx"),questionVOList);
        studentVO.setQuestionVOList(docxRenderData);
        XWPFTemplate xwpfTemplate = XWPFTemplate.compile("/home/admin/export/template.docx").render(studentVO);
        FileOutputStream fileOutputStream = new FileOutputStream("/home/admin/export/"+direction +"/" + student.getStudentName()+"-"+ student.getDirection() + "-" +student.getStudentId() +"-"+System.currentTimeMillis() + ".docx");
        xwpfTemplate.write(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        xwpfTemplate.close();
    }
}
