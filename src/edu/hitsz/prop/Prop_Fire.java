package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;

public class Prop_Fire extends AbstractProp {

    /**
     * @author 86139
     */
    public Prop_Fire(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
;
    }

    @Override
    public void work(HeroAircraft heroAircraft){
        System.out.println("Fire supply active!" );
    }

}
