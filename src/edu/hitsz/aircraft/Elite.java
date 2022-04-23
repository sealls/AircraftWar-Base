package edu.hitsz.aircraft;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.strategy.Context;
import edu.hitsz.strategy.Scattering;
import edu.hitsz.strategy.Straight;

import java.util.LinkedList;
import java.util.List;
/**
 * @author 86139
 */
public class Elite extends AbstractEnemy {
    public Elite(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }
    @Override
    public void forward() {
        super.forward();
        // 判定 y 轴向下飞行出界
        if (locationY >= Main.WINDOW_HEIGHT ) {
            vanish();
        }
    }
    @Override
    public List<BaseBullet> shoot(AbstractAircraft Aircraft) {
        Context context = new Context(new Straight());
        return context.executeStrategy(Aircraft);
    }
}
