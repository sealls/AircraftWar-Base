package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class HeroAircraftTest {

    private HeroAircraft heroAircraft;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Test of EliteEnemy Class.");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("End of Test.");
    }

    @BeforeEach
    void setUp() {
        heroAircraft = HeroAircraft.getInstance();
    }

    @AfterEach
    void tearDown() {
        heroAircraft = null;
    }
    @Test
    void decreaseHp() {
        int beforeHp = heroAircraft.getHp();
        Random rand = new Random();
        int decrease = rand.nextInt(10);
        heroAircraft.decreaseHp(decrease);
        assertEquals(beforeHp-decrease,heroAircraft.getHp(),"DecreaseHp Test Fail");
    }

    @Test
    void shoot() {
        List<BaseBullet> heroBullets= new LinkedList<>();
        heroBullets.addAll(heroAircraft.shoot());
        heroBullets.addAll(heroAircraft.shoot());
        heroBullets.addAll(heroAircraft.shoot());
        assertEquals(3,heroBullets.size(),"Shoot Test Fail");

    }


}