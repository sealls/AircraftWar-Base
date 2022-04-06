package edu.hitsz.prop;

public abstract class PropFactory {
    private static int locationX;
    private static int locationY;
    public Prop summonProp(int locationX,int locationY){
        PropFactory.locationX = locationX;
        PropFactory.locationY = locationY;
        Prop prop;
        prop = createProp();
        return prop;
    }
    public int getLocationX(){
        return locationX;
    }
    public int getLocationY(){
        return locationY;
    }


    abstract Prop createProp();//工厂方法
}
