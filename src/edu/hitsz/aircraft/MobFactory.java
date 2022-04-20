package edu.hitsz.aircraft;

import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;

/**
 * @author 86139
 */
public class MobFactory extends AbstractEnemyFactory {

    @Override
    public AbstractEnemy createEnemy() {
        AbstractEnemy enemy = new MobEnemy(
            (int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_IMAGE.getWidth()))*1,
            (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2)*1,
            0,
            10,
            30);
        return enemy;
    }
}
