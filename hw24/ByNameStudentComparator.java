package ru.kpfu.itis;

import java.util.Comparator;

public class ByNameStudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return o1.getName().compareTo(o2.getName());
    }
}
//Камилла
//Камила
//Даниил
//Данила
//Камилл?а|Дани(ил|ла)