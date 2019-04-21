package ru.kpfu.itis;

import java.util.Arrays;
import java.util.Comparator;

public class Group{
    private Student[] students;
    private static final int defaultCapacity = 10;
    private int number;
    private int size = 0;

    public int getNumber(){
        return number;
    }

    public int size(){
        return this.size;
    }

    private Comparator<Student> comparator = (o1, o2)->o1.getName().compareTo(o2.getName());

    Group(int number){
        this.number = number;
        students = new Student[defaultCapacity];
    }

    Group(int number, Comparator<Student> comparator){
        this.number = number;
        students = new Student[defaultCapacity];
        this.comparator = comparator;
    }

    public Student getByIndex(int i){
        return students[i];
    }

    /**
     * Set new {@link Group#comparator} and sort {@link Group#students}
     */
    public void setComparator(Comparator<Student> comparator){
        this.comparator = comparator;
        this.sort(this.comparator);
    }

    private void sort(Comparator<Student> comparator){
        Arrays.sort(students, comparator);
    }
    public void show(){
        for(int i = 0; i < this.size(); i++){
            System.out.println(this.getByIndex(i));
        }
        System.out.println("********************************************");
    }

    /**
     * add new {@link Student} to {@link Group} keeping order with rule declared in {@link Group#comparator}
     */
    public void add(Student student){
        if(this.size == this.students.length)
            this.students = Arrays.copyOf(this.students, this.students.length * 2);
        int i = 0;
        while((this.students[i] != null) && (this.comparator.compare(student, students[i]) >= 0)){
            i++;
        }
        for(int j = this.size - 1; j >= i; j--){
            this.students[j + 1] = this.students[j];
        }
        this.students[i] = student;
        this.size++;
    }

}
