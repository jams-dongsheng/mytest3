package com.itheima.demo;

import java.io.File;
import java.util.Scanner;

/*第二题：键盘录入文件夹名，然后利用递归的方法求出当前文件夹的大小并输出到控制台；（20'）*/
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹名称:");
        String line = sc.nextLine();
        File f = new File(line);
        long getlength = getlength(f);
        System.out.println(getlength);
    }
    public static long getlength(File srcFile){
        long sum =0;
        if(srcFile.exists()&&srcFile.isDirectory()){
            File[] files = srcFile.listFiles();
            for (File file : files) {
                sum+=getlength(file);
            }

        }else{
            return srcFile.length();
        }
        return sum;
    }
}
