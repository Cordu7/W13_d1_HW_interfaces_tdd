import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;



    @Before
    public void before(){
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", 3,"Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", 4,"Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", 4,"Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasDodgems() {
        assertEquals(dodgems, ThemePark.getDodgems());}

    @Test
    public void hasPark() {
        assertEquals(park, ThemePark.getPark());}

    @Test
    public void hasPlayground() {
        assertEquals(playground, ThemePark.getPlayground());}

    @Test
    public void hasRollerCoaster() {
        assertEquals(rollerCoaster, ThemePark.getRollerCoaster());}

    @Test
    public void hasCandyFlossStall() {
        assertEquals(candyflossStall, ThemePark.getCandyflossStall());}

    @Test
    public void hasIceCreamStall() {
        assertEquals(iceCreamStall, ThemePark.getIceCreamStall());}

    @Test
    public void hasTobaccoStall() {
        assertEquals(tobaccoStall, ThemePark.getTobaccoStall());}

}
