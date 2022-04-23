package edu.hitsz.strategy;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bullet.HeroBullet;

import java.util.LinkedList;
import java.util.List;

public class Straight implements Strategy{

    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        List<BaseBullet> res = new LinkedList<>();
        int x = aircraft.getLocationX();
        int y = aircraft.getLocationY() + 2;
        int speedX = 0;
        int speedY = aircraft.getSpeedY() + 5;
        BaseBullet abstractBullet;
        if(!(aircraft instanceof HeroAircraft)) {
            abstractBullet = new EnemyBullet(x , y, speedX, speedY,30);
            res.add(abstractBullet);
        }else{
            abstractBullet = new HeroBullet(x , y, speedX, -5,30);
            res.add(abstractBullet);
        }
        return res;
    }
}
