package edu.hitsz.aircraft;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.strategy.Context;
import edu.hitsz.strategy.Scattering;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 86139
 */
public class Boss extends AbstractEnemy {

    public Boss(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        Context context = new Context(new Scattering());
        return context.executeStrategy(aircraft);
    }
    @Override
    public  void forward(){
        super.forward();
        if (locationY >= Main.WINDOW_HEIGHT ) {
            vanish();
        }
    }

}
