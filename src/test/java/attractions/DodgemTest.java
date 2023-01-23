package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    private Visitor underageVisitor;
    private Visitor adultVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        underageVisitor = new Visitor(12, 135.50, 40.90);
        adultVisitor = new Visitor(18, 145.00, 1500.50);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void chargeLowerFeeIfAgeUnder12(){
        assertEquals(2.25, dodgems.calculateTicket(underageVisitor), 0.00);
    }
    @Test
    public void chargesStandardFeeIfOver12(){
        assertEquals(4.50, dodgems.calculateTicket(adultVisitor), 0.00);
    }
}
