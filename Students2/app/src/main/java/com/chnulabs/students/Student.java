package com.chnulabs.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;

    public Student(String name, String groupNumber){
        this.name=name;
        this.groupNumber=groupNumber;
    }
    public String getName(){
        return name;
    }
    public String getGroupNumber(){
        return groupNumber;
    }
    private final static ArrayList<Student> students=new ArrayList<Student>(Arrays.asList(
            new Student("Іванов Роман", "301"),
            new Student("Петров Федір", "301"),
            new Student("Осадча Оксана", "302"),
            new Student("Максимов Руслан", "302"),
            new Student("Осадча Оксана", "ІПЗ19-2"),
            new Student("Петров Федір", "ІПЗ19-2"),
            new Student("Іванов Роман", "ІПЗ19-2"),
            new Student("Максимов Руслан", "ІПЗ19-2"),
            new Student("Потапова Марія", "ІПЗ19-2"),
            new Student("Гонський Іван", "ІПЗ19-2"),
            new Student("Васильєв Максим", "ІПЗ19-2"),
            new Student("Васильєв Кирило", "ІПЗ19-2"),
            new Student("Потапова Оксана", "ІПЗ19-2"),
            new Student("Гонський Максим", "ІПЗ19-2"),
            new Student("Потапова Марія", "309"),
            new Student("Гонський Іван", "309"),
            new Student("Васильєв Максим", "309"),
            new Student("Васильєв Кирило", "501м")

    ));
    public static ArrayList<Student> getStudents(String groupNumber){
        ArrayList<Student> stList=new ArrayList<>();
        for(Student s: students){
            if(s.getGroupNumber().equals(groupNumber)){
                stList.add(s);
            }
        }
        return stList;
    }
}
