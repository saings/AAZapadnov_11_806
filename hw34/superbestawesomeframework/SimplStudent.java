package com.company.superbestawesomeframework;

public class SimplStudent {
    int age;
    String name;

    public SimplStudent(){
    }

    public SimplStudent(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
