package edu.hitsz.prop;
/**
 * @author 86139
 */
public class BombFactory extends AbstractPropFactory {

    @Override
    AbstractProp createProp() {
        AbstractProp prop = new Prop_Bomb(
                getLocationX(),
                getLocationY(),
                3,
                10
        );
        return prop;
    }
}
