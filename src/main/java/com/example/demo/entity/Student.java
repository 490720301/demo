package com.example.demo.entity;

import java.sql.Date;

/**
 * 学生实体
 */
public class Student {
    private Integer stuId;//id

    private String stuName;//姓名

    private boolean stuSex;//性别

    private Date stuBirthday;//生日

    private String stuTell;//电话

    private String stuAddress;//地址

    private String stuHobby;//爱好

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public boolean isStuSex() {
        return stuSex;
    }

    public void setStuSex(boolean stuSex) {
        this.stuSex = stuSex;
    }

    public Date getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public String getStuTell() {
        return stuTell;
    }

    public void setStuTell(String stuTell) {
        this.stuTell = stuTell;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuHobby() {
        return stuHobby;
    }

    public void setStuHobby(String stuHobby) {
        this.stuHobby = stuHobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex=" + stuSex +
                ", stuBirthday=" + stuBirthday +
                ", stuTell='" + stuTell + '\'' +
                ", stuAddress='" + stuAddress + '\'' +
                ", stuHobby='" + stuHobby + '\'' +
                '}';
    }
}
