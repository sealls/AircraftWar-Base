package edu.hitsz.prop;

public class BulletFactory extends PropFactory {

    @Override
    Prop createProp() {
        Prop prop = new Prop_Fire(
                getLocationX(),
                getLocationY(),
                3,
                10
        );
        return prop;
    }
}
