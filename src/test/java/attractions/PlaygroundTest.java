package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    private Visitor underageVisitor;
    private Visitor adultVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        underageVisitor = new Visitor(15, 165.50, 40.90);
        adultVisitor = new Visitor(18, 200.00, 1500.50);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void allowsToPlay15YearOld(){
        assertEquals(true, playground.isAllowedTo(underageVisitor));
    }
    @Test
    public void refuse16YearOld(){
        assertEquals(false, playground.isAllowedTo(adultVisitor));
    }
}
