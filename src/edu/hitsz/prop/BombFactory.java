package edu.hitsz.prop;

public class BombFactory extends PropFactory{

    @Override
    Prop createProp() {
        Prop prop = new Prop_Bomb(
                getLocationX(),
                getLocationY(),
                3,
                10
        );
        return prop;
    }
}
