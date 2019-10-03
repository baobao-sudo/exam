package com.uchain.exam.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;

    private String studentId;

    private String studentName;

    private String direction;

    private String question01;

    private String question02;

    private String question03;

    private String question04;

    private String question05;

    private String question06;

    private String question07;

    private String question08;

    private String question09;

    private String question10;

    private String question11;

    private String question12;

    private String question13;

    private String question14;

    private String question15;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public String getQuestion01() {
        return question01;
    }

    public void setQuestion01(String question01) {
        this.question01 = question01 == null ? null : question01.trim();
    }

    public String getQuestion02() {
        return question02;
    }

    public void setQuestion02(String question02) {
        this.question02 = question02 == null ? null : question02.trim();
    }

    public String getQuestion03() {
        return question03;
    }

    public void setQuestion03(String question03) {
        this.question03 = question03 == null ? null : question03.trim();
    }

    public String getQuestion04() {
        return question04;
    }

    public void setQuestion04(String question04) {
        this.question04 = question04 == null ? null : question04.trim();
    }

    public String getQuestion05() {
        return question05;
    }

    public void setQuestion05(String question05) {
        this.question05 = question05 == null ? null : question05.trim();
    }

    public String getQuestion06() {
        return question06;
    }

    public void setQuestion06(String question06) {
        this.question06 = question06 == null ? null : question06.trim();
    }

    public String getQuestion07() {
        return question07;
    }

    public void setQuestion07(String question07) {
        this.question07 = question07 == null ? null : question07.trim();
    }

    public String getQuestion08() {
        return question08;
    }

    public void setQuestion08(String question08) {
        this.question08 = question08 == null ? null : question08.trim();
    }

    public String getQuestion09() {
        return question09;
    }

    public void setQuestion09(String question09) {
        this.question09 = question09 == null ? null : question09.trim();
    }

    public String getQuestion10() {
        return question10;
    }

    public void setQuestion10(String question10) {
        this.question10 = question10 == null ? null : question10.trim();
    }

    public String getQuestion11() {
        return question11;
    }

    public void setQuestion11(String question11) {
        this.question11 = question11 == null ? null : question11.trim();
    }

    public String getQuestion12() {
        return question12;
    }

    public void setQuestion12(String question12) {
        this.question12 = question12 == null ? null : question12.trim();
    }

    public String getQuestion13() {
        return question13;
    }

    public void setQuestion13(String question13) {
        this.question13 = question13 == null ? null : question13.trim();
    }

    public String getQuestion14() {
        return question14;
    }

    public void setQuestion14(String question14) {
        this.question14 = question14 == null ? null : question14.trim();
    }

    public String getQuestion15() {
        return question15;
    }

    public void setQuestion15(String question15) {
        this.question15 = question15 == null ? null : question15.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", direction=").append(direction);
        sb.append(", question01=").append(question01);
        sb.append(", question02=").append(question02);
        sb.append(", question03=").append(question03);
        sb.append(", question04=").append(question04);
        sb.append(", question05=").append(question05);
        sb.append(", question06=").append(question06);
        sb.append(", question07=").append(question07);
        sb.append(", question08=").append(question08);
        sb.append(", question09=").append(question09);
        sb.append(", question10=").append(question10);
        sb.append(", question11=").append(question11);
        sb.append(", question12=").append(question12);
        sb.append(", question13=").append(question13);
        sb.append(", question14=").append(question14);
        sb.append(", question15=").append(question15);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}