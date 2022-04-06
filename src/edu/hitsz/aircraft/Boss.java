package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;

import java.util.LinkedList;
import java.util.List;

public class Boss extends Enemy{

    public Boss(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    @Override
    public List<BaseBullet> shoot() {
        return new LinkedList<>();
    }
    @Override
    public  void forward(){};

}
