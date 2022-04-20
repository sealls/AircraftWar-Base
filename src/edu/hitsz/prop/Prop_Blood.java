package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;

public class Prop_Blood extends AbstractProp {

    /**
     * @author 86139
     */
    /**
     * 生命值
     */

    public Prop_Blood(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);

    }

    @Override
    public void work(HeroAircraft heroAircraft){
        if(heroAircraft.getHp()<70) {
            heroAircraft.increaseHp(30);
        }else{
            heroAircraft.increaseHp(100-heroAircraft.getHp());
        }
        System.out.println("Blood supply active!");

    }


}
