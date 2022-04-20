package edu.hitsz.aircraft;
/**
 * @author 86139
 */
public abstract class AbstractEnemyFactory {
    public AbstractEnemy summonEnemy(){
        AbstractEnemy enemy;
        enemy = createEnemy();
        return enemy;
    }

     abstract AbstractEnemy createEnemy();//工厂方法
}
