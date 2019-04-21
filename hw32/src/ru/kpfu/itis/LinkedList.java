package ru.kpfu.itis;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LinkedList<T>{

    public T getByIndex(int index){
        Node<T> current = head;
        if(index < 0 || index >= count)
            throw new IndexOutOfBoundsException(index + "");
        for(int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current.getValue();
    }

    private class Node<T>{
        private T value;
        private Node<T> next;

        Node(T value){
            this.value = value;
        }

        public T getValue(){
            return value;
        }

        public void setNext(Node<T> next){
            this.next = next;
        }

        public Node<T> getNext(){
            return this.next;
        }
    }

    private Node<T> head = null;

    public Node<T> getHead(){
        return head;
    }

    private int count = 0;

    public int size(){
        return count;
    }

    public void add(T value){
        Node<T> newNode = new Node<>(value);
        newNode.setNext(null);
        if(head == null){
            head = newNode;
            this.count++;
        } else{
            Node<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            this.count++;
            current.setNext(newNode);
        }
    }

    public void addAll(LinkedList<T> a){
        Node<T> current = this.head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(a.getHead());
        this.count += a.count;
    }

    public void addAll(LinkedList<T> a, int index){
        Node<T> current = head;
        if(index < 0 || index >= count)
            throw new IndexOutOfBoundsException(index + "");
        for(int i = 0; i < index; i++){
            current = current.getNext();
        }
        a.getLast().setNext(current.getNext());
        current.setNext(a.getHead());
        this.count += a.count;
    }

    public Node<T> getLast(){
        Node<T> current = this.head;
        while(current.getNext() != null)
            current = current.getNext();
        return current;
    }

    public void remove(int index){
        if(index == 0){
            head = head.getNext();
        } else{
            Node<T> current = head;
            if(index < 0 || index >= count)
                throw new IndexOutOfBoundsException(index + "");
            for(int i = 0; i < index--; i++){
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        this.count--;
    }

    public ArrayList<T> toArrayList(){
        ArrayList<T> ans = new ArrayList<>();
        Node<T> current = this.head;
        for(int i = 0; current != null; i++){
            ans.add(current.value);
            current = current.getNext();
        }
        return ans;
    }

    public Stream<T> stream(){
        return new MyStream();
    }

    public class MyStream implements Stream{
        private ArrayList<T> a = toArrayList();

        @Override
        public Stream filter(Predicate predicate){
            ArrayList<T> temp = new ArrayList<>();
            for(T t: a){
                if(predicate.test(t)) temp.add(t);
            }
            a = temp;
            return this;
        }

        @Override
        public void forEach(Consumer action){
            for(T t: a){
                action.accept(t);
            }
        }

        @Override
        public Stream map(Function mapper){
            ArrayList<T> temp = new ArrayList<>();
            for(T t: a){
                temp.add((T)mapper.apply(t));
            }
            a = temp;
            return this;
        }

        @Override
        public Object collect(Collector collector){
            return null;
        }

        @Override
        public IntStream mapToInt(ToIntFunction mapper){
            return null;
        }

        @Override
        public LongStream mapToLong(ToLongFunction mapper){
            return null;
        }

        @Override
        public DoubleStream mapToDouble(ToDoubleFunction mapper){
            return null;
        }

        @Override
        public Stream distinct(){
            return null;
        }

        @Override
        public Stream sorted(){
            return null;
        }

        @Override
        public Stream sorted(Comparator comparator){
            return null;
        }

        @Override
        public Stream peek(Consumer action){
            return null;
        }

        @Override
        public Stream limit(long maxSize){
            return null;
        }

        @Override
        public Stream skip(long n){
            return null;
        }

        @Override
        public void forEachOrdered(Consumer action){

        }

        @Override
        public Object[] toArray(){
            return new Object[0];
        }

        @Override
        public Object reduce(Object identity, BinaryOperator accumulator){
            return null;
        }

        @Override
        public Optional reduce(BinaryOperator accumulator){
            return Optional.empty();
        }

        @Override
        public Optional min(Comparator comparator){
            return Optional.empty();
        }

        @Override
        public Optional max(Comparator comparator){
            return Optional.empty();
        }

        @Override
        public long count(){
            return 0;
        }

        @Override
        public boolean anyMatch(Predicate predicate){
            return false;
        }

        @Override
        public boolean allMatch(Predicate predicate){
            return false;
        }

        @Override
        public boolean noneMatch(Predicate predicate){
            return false;
        }

        @Override
        public Optional findFirst(){
            return Optional.empty();
        }

        @Override
        public Optional findAny(){
            return Optional.empty();
        }

        @Override
        public Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner){
            return null;
        }

        @Override
        public Object reduce(Object identity, BiFunction accumulator, BinaryOperator combiner){
            return null;
        }

        @Override
        public Object[] toArray(IntFunction generator){
            return new Object[0];
        }

        @Override
        public DoubleStream flatMapToDouble(Function mapper){
            return null;
        }

        @Override
        public LongStream flatMapToLong(Function mapper){
            return null;
        }

        @Override
        public IntStream flatMapToInt(Function mapper){
            return null;
        }

        @Override
        public Stream flatMap(Function mapper){
            return null;
        }

        @Override
        public Iterator iterator(){
            return null;
        }

        @Override
        public Spliterator spliterator(){
            return null;
        }

        @Override
        public boolean isParallel(){
            return false;
        }

        @Override
        public BaseStream sequential(){
            return null;
        }

        @Override
        public BaseStream parallel(){
            return null;
        }

        @Override
        public BaseStream unordered(){
            return null;
        }

        @Override
        public BaseStream onClose(Runnable closeHandler){
            return null;
        }

        @Override
        public void close(){

        }
    }
}