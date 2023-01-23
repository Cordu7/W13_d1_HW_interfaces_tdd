package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor underageVisitor;
    Visitor adultVisitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        underageVisitor = new Visitor(12, 165.50, 40.90);
        adultVisitor = new Visitor(18, 200.00, 1500.50);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void refusesToSaleToUnder18(){
        assertEquals(false, tobaccoStall.isAllowedTo(underageVisitor));
    }
    @Test
    public void sellToAdult(){
        assertEquals(true, tobaccoStall.isAllowedTo(adultVisitor));
    }
}
