package edu.hitsz.prop;

public class Prop_Bomb extends Prop{

    public Prop_Bomb(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);

    }

    @Override
    public  int getHp(){
        return 0;
    }

    @Override
    public int getType() {
        return 2;
    }

}
