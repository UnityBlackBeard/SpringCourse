package ru.maxima.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.spring.player.ClassicalMusic;
import ru.maxima.spring.player.Music;
import ru.maxima.spring.player.MusicPlayer;
import ru.maxima.spring.player.RockMusic;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        TestBean testBean=context.getBean("testBean",TestBean.class);
//        System.out.println(testBean.getName());

       // Music music= context.getBean("music", ClassicalMusic.class);


        MusicPlayer musicList= new MusicPlayer(context.getBean("musicList", ArrayList.class));
        //MusicPlayer musicPlayer=new MusicPlayer(music);
        //MusicPlayer musicPlayer=new MusicPlayer(musicList);
        musicList.play();

        context.close();
    }
}
