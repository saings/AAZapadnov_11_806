package ru.kpfu.itis;

public class AudioTrack implements Comparable<AudioTrack>{
    int duration;
    String title;
    String author;
    AudioTrack(int duration){
        this.duration = duration;
    }
    @Override
    public int compareTo(AudioTrack o){
        return this.duration - o.duration;
    }
}
