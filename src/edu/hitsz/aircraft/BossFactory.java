package edu.hitsz.aircraft;

import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;

/**
 * @author 86139
 */
public class BossFactory extends AbstractEnemyFactory {


    @Override
    AbstractEnemy createEnemy() {
        AbstractEnemy enemy = new Boss(
                (int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_IMAGE.getWidth()))*1,
                30,
                5,
                0,
                300);
        return enemy;
    }
}
