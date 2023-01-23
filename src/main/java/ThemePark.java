import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

public class ThemePark {
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;

    public ThemePark(Dodgems dodgems, Park park, Playground playground, RollerCoaster rollerCoaster,
                     CandyflossStall candyflossStall, IceCreamStall iceCreamStall, TobaccoStall tobaccoStall){
        this.dodgems = dodgems;
        this.park = park;
        this.playground = playground;
        this.rollerCoaster = rollerCoaster;
        this.candyflossStall = candyflossStall;
        this.iceCreamStall = iceCreamStall;
        this.tobaccoStall = tobaccoStall;

    }

}


//1. `ThemePark` stores all `Attractions` and `Stalls` in it.
//2. `ThemePark` has a method `getAllReviewed()` which returns an ArrayList of `IReviewed` objects.
//3. Add an empty `visitedAttractions` ArrayList to `Visitor` which stores a list of `Attractions` and a method to add an attraction to the list.
//4. `ThemePark` has a method `visit(Visitor, Attraction)` calls for the attraction to  increment its `visitCount` by 1 and adds the attraction to the visitors `visitedAttractions` list.
