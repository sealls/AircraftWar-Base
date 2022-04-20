package edu.hitsz.prop;

public abstract class AbstractPropFactory {
    private static int locationX;
    private static int locationY;
    public AbstractProp summonProp(int locationX, int locationY){
        AbstractPropFactory.locationX = locationX;
        AbstractPropFactory.locationY = locationY;
        AbstractProp prop;
        prop = createProp();
        return prop;
    }
    public int getLocationX(){
        return locationX;
    }
    public int getLocationY(){
        return locationY;
    }


    abstract AbstractProp createProp();//工厂方法
}
