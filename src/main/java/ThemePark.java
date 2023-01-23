import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

public class ThemePark {
    private static Dodgems dodgems;
    private static Park park;
    private static Playground playground;
    private static RollerCoaster rollerCoaster;
    private static CandyflossStall candyflossStall;
    private static IceCreamStall iceCreamStall;
    private static TobaccoStall tobaccoStall;

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

    public static Dodgems getDodgems() {
        return dodgems;
    }

    public static Park getPark() {
        return park;
    }

    public static Playground getPlayground() {
        return playground;
    }

    public static RollerCoaster getRollerCoaster() {
        return rollerCoaster;
    }

    public static CandyflossStall getCandyflossStall() {
        return candyflossStall;
    }

    public static IceCreamStall getIceCreamStall() {
        return iceCreamStall;
    }

    public static TobaccoStall getTobaccoStall() {
        return tobaccoStall;
    }
}


//1. `ThemePark` stores all `Attractions` and `Stalls` in it.
//2. `ThemePark` has a method `getAllReviewed()` which returns an ArrayList of `IReviewed` objects.
//3. Add an empty `visitedAttractions` ArrayList to `Visitor` which stores a list of `Attractions` and a method to add an attraction to the list.
//4. `ThemePark` has a method `visit(Visitor, Attraction)` calls for the attraction to  increment its `visitCount` by 1 and adds the attraction to the visitors `visitedAttractions` list.
