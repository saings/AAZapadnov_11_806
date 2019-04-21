package ru.kpfu.itis;

public class Main{

    public static void main(String[] args){
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("aaddsa");
        stringLinkedList.add("adsd sagkleqas ");
        stringLinkedList.add("adwqe qewsdd");
        stringLinkedList.add("qgdqeqwewqe");
        stringLinkedList.add("adasdadsasd");

        stringLinkedList.stream().filter(s -> !s.contains(" ")).map(String::length).forEach(System.out::println);

    }
}
