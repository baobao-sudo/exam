package com.uchain.exam.VO;

import com.deepoove.poi.config.Name;
import com.deepoove.poi.data.DocxRenderData;
import lombok.Data;

import java.util.List;

/**
 * @author baobao
 */
@Data
public class StudentVO {

    private String studentId;

    private String studentName;

    private String direction;
    @Name("question")
    private DocxRenderData questionVOList;

}
