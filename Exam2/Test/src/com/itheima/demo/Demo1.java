package com.itheima.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o2.getScore() - o1.getScore();
                return i;
            }
        });

        try {
            InputStream ras= Demo1.class.getClassLoader().getResourceAsStream("student.properties");
            prop.load(ras);
            Set<String> keys = prop.stringPropertyNames();
            for (String key : keys) {
                String values = prop.getProperty(key);
                Student s = new Student();
                String[] splitArry = values.split(",");
                s.setSno(Integer.parseInt(splitArry[0]));
                s.setName(splitArry[1]);
                s.setSage(Integer.parseInt(splitArry[2]));
                s.setScore(Integer.parseInt(splitArry[3]));
                ts.add(s);
            }
            for (Student t : ts) {
                System.out.println(t);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
