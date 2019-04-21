package ru.kpfu.itis;

import java.util.Arrays;

public class SortedPlayList{
    private AudioTrack[] list = new AudioTrack[10];
    public int size = 0;

    public int getI(int i){
        return this.list[i].duration;
    }

    public void add(AudioTrack track){
        if(this.size == this.list.length) this.list = Arrays.copyOf(this.list, this.list.length * 2);
        int i = 0;
        while((this.list[i] != null) &&
                this.list[i].compareTo(track) <= 0) i++;
        AudioTrack z = this.list[i];
        for(int j = 1; j < this.size - i + 1; j++){
            AudioTrack p = this.list[i + j];
            this.list[i + j] = z;
            z = p;
        }
        this.list[i] = track;
        this.size++;
    }
}
