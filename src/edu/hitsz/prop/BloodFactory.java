package edu.hitsz.prop;

public class BloodFactory extends PropFactory{
    @Override
    public Prop createProp(){
        Prop prop = new Prop_Blood(
                getLocationX(),
                getLocationY(),
                3,
                10,
                30
                );
        return prop;
    }
}
