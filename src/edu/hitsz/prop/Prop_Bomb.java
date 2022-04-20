package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;

public class Prop_Bomb extends AbstractProp {

    public Prop_Bomb(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);

    }

    @Override
    public void work(HeroAircraft heroAircraft){
        System.out.println("Bomb supply active!");
    }

}
