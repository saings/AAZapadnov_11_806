package ru.kpfu.itis;

public class Student{
    private String name;
    private String surname;
    private int age;
    private int group;
    private char sex;

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGroup(int group){
        this.group = group;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public Student(String name, String surname, int age, char sex){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString(){
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + ", group=" + group + ", sex=" + sex + '}';
    }

    public Student(String name, String surname, int age, int group, char sex){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public int getGroup(){
        return group;
    }

    public char getSex(){
        return sex;
    }

    @Override
    public int hashCode(){
        int result = 1;
        result = result * 31 + age;
        result = result * 31 + sex;
        result = result * 31 + group;
        result = result * 31 + name.hashCode();
        result = result * 31 + surname.hashCode();

        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Student))
            return false;
        if(this == obj)
            return true;
        return this.group == (((Student)obj).getGroup()) && this.sex == (((Student)obj).getSex()) && this.surname.equals(((Student)obj).getSurname()) && this.name.equals(((Student)obj).getName()) && this.age == ((Student)obj).getAge();
    }

}
