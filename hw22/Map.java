package ru.kpfu.itis;

import java.util.Arrays;

public class Map <Key, Value>{
    private class Entry <Key, Value>{
        private Key key;
        private Value value;

        Entry(Key key, Value value){
            this.key = key;
            this.value = value;
        }

        public Value value(){
            return this.value;
        }

        public Key key(){
            return this.key;
        }
    }
    private Entry[] entries = new Entry[10];
    private int size = 0;
    public String toString(){
        StringBuffer s = new StringBuffer();
        for(int i = 0; i < size; i++) s.append(entries[i].key.toString() + " " + entries[i].value.toString() + "\n");
        return s.toString();
    }
    public void put(Key key, Value value){
        if(size == entries.length){
            entries = Arrays.copyOf(this.entries, entries.length * 2);
        }
        for(int i = 0; i < size; i++){
            if(entries[i].key().equals(key)){
                entries[i] = new Entry(key, value);
                return;
            }
        }
        entries[size++] = new Entry(key, value);
    }

    public Value get(Key key){
        for(int i = 0; i < size; i++){
            if(entries[i].key().equals(key)){
                return (Value) entries[i].value();
            }
        }
        return null;
    }
}
