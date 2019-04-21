package com.company.superbestawesomeframework;

import com.company.Student;

import java.util.List;

import static com.company.superbestawesomeframework.SuperBestAwesomeFramework.*;

public class Main {
    public static void main(String[] args) {
        List<SimplStudent> l =
                getMany(SimplStudent.class, 100);
        System.out.println(l);
        List<SimplStudent> sbs =
                getManyWithCons(SimplStudent.class, 10, 10, "asdasd");
        System.out.println(sbs);
    }
}
