package edu.hitsz.prop;

import edu.hitsz.application.Main;
import edu.hitsz.basic.AbstractFlyingObject;

/**
 * 所有种类道具的抽象父类:
 * 血包，炸弹，子弹夹
 *
 * @author 86139
 */
public abstract class Prop extends AbstractFlyingObject {

     public Prop(int locationX, int locationY, int speedX, int speedY){
        super(locationX, locationY, speedX, speedY);
    }
    public abstract int getHp();


    /**
     * 道具种类；
     * 1；血包
     * 2；炸弹
     * 3；子弹夹
     */
    public abstract int getType();

    @Override
    public void forward(){
        super.forward();
        // 判定 y 轴向下飞行出界
        if (locationY >= Main.WINDOW_HEIGHT ) {
            vanish();
        }
    }
}
