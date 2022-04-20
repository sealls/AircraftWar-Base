package edu.hitsz.prop;
/**
 * @author 86139
 */
public class BulletFactory extends AbstractPropFactory {

    @Override
    AbstractProp createProp() {
        AbstractProp prop = new Prop_Fire(
                getLocationX(),
                getLocationY(),
                3,
                10
        );
        return prop;
    }
}
