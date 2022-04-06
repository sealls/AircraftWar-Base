package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;

import java.util.List;

/**
 * @author 86139
 */
public abstract class Enemy extends AbstractAircraft  {


    public Enemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    @Override
    public abstract List<BaseBullet> shoot();
}
