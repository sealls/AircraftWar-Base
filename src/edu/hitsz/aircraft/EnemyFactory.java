package edu.hitsz.aircraft;

public abstract class EnemyFactory {
    public Enemy summonEnemy(){
        Enemy enemy;
        enemy = createEnemy();
        return enemy;
    }

     abstract Enemy createEnemy();//工厂方法
}
