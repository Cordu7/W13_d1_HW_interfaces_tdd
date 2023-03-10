package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    private Visitor underageVisitor;
    private Visitor adultVisitor;
    private Visitor giantVisitor;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        underageVisitor = new Visitor(15, 135.50, 40.90);
        adultVisitor = new Visitor(18, 145.00, 1500.50);
        giantVisitor = new Visitor(18, 200.00, 1500.50);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void allowsHeightOver145(){
        assertEquals(true, rollerCoaster.isAllowedTo(adultVisitor));
    }
    @Test
    public void refuseHeightUnder145(){
        assertEquals(false, rollerCoaster.isAllowedTo(underageVisitor));
    }

    @Test
    public void chargeDoubleFeeIfHeightOver200(){
        assertEquals(16.80, rollerCoaster.calculateTicket(giantVisitor), 0.00);
    }
    @Test
    public void chargesStandardFeeIfUnder200(){
        assertEquals(8.40, rollerCoaster.calculateTicket(underageVisitor), 0.00);
    }
}
