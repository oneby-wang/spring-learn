package com.oneby.entity;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/13 20:27
 * @Version 1.0
 */
public class Student {

    private Integer stuId;
    private String stuName;

    public Student() {

    }

    public Student(Integer stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public Integer getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                '}';
    }

}
