package com.company.prirmitives;

public class IterMain {
    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(41);
        list.add(43);
        list.add(45);
        list.add(47);

        System.out.println(list.contains(54));
list.remove(3);
//        IntList list2 = new IntArrayList();
//        list2.add(67);
//        list2.add(69);
//        list2.add(68);
//        list.addAll(list2,2);
//        System.out.println(list);


        Iterator i = list.iterator();
        while (i.hasNext()) {
            int e = i.next();
            System.out.println(e);
        }
    }
}
