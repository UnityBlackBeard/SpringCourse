package ru.maxima.spring.player;

import org.springframework.stereotype.Component;

@Component
public class RockMusic  implements Music{
    @Override
    public String getSong(){
        return "highway to hell";
    }
}
