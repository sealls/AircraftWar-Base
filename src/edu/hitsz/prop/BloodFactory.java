package edu.hitsz.prop;

/**
 * @author 86139
 */
public class BloodFactory extends AbstractPropFactory {
    @Override
    public AbstractProp createProp(){
        AbstractProp prop = new Prop_Blood(
                getLocationX(),
                getLocationY(),
                3,
                10
                );
        return prop;
    }
}
