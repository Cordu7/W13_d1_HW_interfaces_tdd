import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    ThemePark themePark;
    ThemePark fullThemePark;


    @Before
    public void before(){

        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", 3,"Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", 4,"Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", 4,"Jack Jarvis", ParkingSpot.B1);
        themePark = new ThemePark();

        fullThemePark = new ThemePark();
        fullThemePark.addItem(dodgems);
        fullThemePark.addItem(park);
        fullThemePark.addItem(playground);
        fullThemePark.addItem(rollerCoaster);
        fullThemePark.addItem(candyflossStall);
        fullThemePark.addItem(iceCreamStall);
        fullThemePark.addItem(tobaccoStall);
    }

    @Test
    public void canGetAllReviewedAsList(){
        assertEquals([dodgems, park, playground, rollerCoaster,candyflossStall, iceCreamStall, tobaccoStall], themePark.getAllReviewed();)
    }



    @Test
    public void canAddEverythingToThemePark() {
        assertEquals(7, fullThemePark.getSizeOfThemePark());}

//    @Test
//    public void canAddOneItem() {
//        themePark.addItem(dodgems);
//        assertEquals(1, themePark.getSizeOfThemePark());}


}
