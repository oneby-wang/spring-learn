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
    private Computer computer;

    public Student() {

    }

    public Student(Integer stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public Student(Integer stuId, String stuName, Computer computer) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.computer = computer;
    }

    public Integer getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", computer=" + computer +
                '}';
    }

}
