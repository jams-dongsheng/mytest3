package com.itheima.demo;
/*第一题：有一个student.properties文件(已经提供)，按照固定格式(学生i=学号，姓名，年龄，成绩)存放学生信息；（40'）
 需求：新建student类，包含属性（sno-》int，sname-》String，sage-》int，score -》int),对取出来的学生信息进行去重，
 并按照成绩的从大到小输出信息到控制台；*/
public class Student {
    private int sno;
    private String name;
    private int sage;
    private int score;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", sage=" + sage +
                ", score=" + score +
                '}';
    }
}

