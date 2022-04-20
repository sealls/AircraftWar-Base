package edu.hitsz.aircraft;

import edu.hitsz.basic.AbstractFlyingObject;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EliteTest {
    private AbstractFlyingObject elite;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Test of elite Class.");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("End of Test.");
    }

    @BeforeEach
    void setUp() {
        elite = new Elite(0,0,10,10,30);
    }

    @AfterEach
    void tearDown() {
        elite = null;
    }

    @Test
    void forward() {
        int locationX = elite.getLocationX();
        int locationY = elite.getLocationY();
        int speedX = elite.getSpeedX();
        int speedY = elite.getSpeedY();
        elite.forward();
        assertAll("Location",
                () -> assertEquals(locationX + speedX, elite.getLocationX()),
                () -> assertEquals(locationY + speedY, elite.getLocationY()));

    }

    @Test
    void vanish() {
        elite.vanish();
        assertEquals(true,elite.notValid());
    }
}