package ru.maxima.spring.player;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic  implements Music{
    @Override
    public String getSong(){
        return "Moon Sonata";
    }
    }
