package ru.maxima.spring.player;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    //private Music music;
    private List<Music>musicList = new ArrayList<>();



//    public MusicPlayer(Music music){
//        this.music=music;
//    }
    public MusicPlayer(List<Music> mList){
        mList.forEach(elem -> this.musicList.add(elem));
    }
    public void play(){

       // System.out.println("Now playing "+music.getSong());

        for (Music s:musicList) {
            System.out.println("Now playing "+s.getSong());

        }

    }



}
