package edu.hitsz.aircraft;

import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;

public class MobFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        Enemy enemy = new MobEnemy(
            (int) ( Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_IMAGE.getWidth()))*1,
            (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2)*1,
            0,
            10,
            30);
        return enemy;
    }
}
