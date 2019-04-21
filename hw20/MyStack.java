import java.util.ArrayList;
import java.util.Arrays;

public class MyStack <T>{
    Node tail = null;
    private class Node <T>{
        private T value;
        private Node link = null;
        Node(T value){
            this.value = value;
        }
        Node pred(){
            return link;
        }
        void setPred(Node link){
            this.link = link;
        }
        T getT(){
            return value;
        }
    }

    public MyStack(){

    }

    void push(T arg){
        Node t = tail;
        tail = new Node(arg);
        tail.setPred(t);
    }

    T pop(){
        Node t = tail;
        tail = tail.pred();
        return (T)t.getT();
    }
    boolean isEmpty(){
        return tail == null;
    }
}
