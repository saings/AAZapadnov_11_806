package ru.kpfu.itis;

import java.util.Comparator;

public class Main{
    public static String generateRandomString(){
        StringBuilder string = new StringBuilder();
        int size = 5;
        for(int i = 0; i < size; i++){
            if(Math.random() > 0.5){
                string.append(Character.toChars((int)(Math.random() * 25) + 65));
            } else{
                string.append(Character.toChars((int)(Math.random() * 25) + 97));
            }
        }
        return string.toString();
    }

    public static char generateSex(){
        return (Math.random() > 0.5) ? 'm' : 'f';
    }

    public static void main(String[] args){
        Group b = new Group(11);
        for(int i = 0; i < 20; i++){
            b.add(new Student(generateRandomString(), generateRandomString(), ((int)(Math.random() * 10)) + 17, b.getNumber(), generateSex()));
        }
        b.setComparator((o1, o2)->o1.getName().compareTo(o2.getName()));
        b.show();
        b.setComparator(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return o1.getSex() - o2.getSex();
            }
        });
        b.show();
        b.setComparator(new ByAgeStudentComparator());
        b.show();
    }
}
