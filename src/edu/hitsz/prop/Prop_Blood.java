package edu.hitsz.prop;

import edu.hitsz.application.Main;

public class Prop_Blood extends Prop {

    /**
     * 生命值
     */
    protected int hp;
    protected int maxHp;
    public Prop_Blood(int locationX, int locationY, int speedX, int speedY,int hp) {
        super(locationX, locationY, speedX, speedY);
        this.maxHp = maxHp;
        this.hp = hp;
    }

    @Override
    public int  getHp() {
       return hp;
    }

    @Override
    public int getType() {
        return 1;
    }


}
