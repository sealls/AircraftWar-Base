package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Prop_BloodTest {
    private HeroAircraft heroAircraft;
    private Prop_Blood prop_blood;



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
        heroAircraft.decreaseHp(70);
        prop_blood = new Prop_Blood(Main.WINDOW_WIDTH / 2,
                Main.WINDOW_HEIGHT - ImageManager.HERO_IMAGE.getHeight() ,
                0, 0);

    }

    @AfterEach
    void tearDown() {
        prop_blood = null;
        heroAircraft = null;
    }
    @DisplayName("Crash Test")
    @Test
    void crash() {
        assertEquals(true,heroAircraft.crash(prop_blood),"Crash Test Fail");
    }

    @Test
    void work() {

        prop_blood.work(heroAircraft);
        assertEquals(60,heroAircraft.getHp(),"Work Test Fail");

    }
}