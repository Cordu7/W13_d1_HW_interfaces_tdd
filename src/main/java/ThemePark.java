import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {

    private static ArrayList<IReviewed> items;


    public ThemePark(){
        this.items = new ArrayList<IReviewed>();

    }

    public int getSizeOfThemePark(){
        return this.items.size();
    }
    public void addItem(IReviewed item) {
        this.items.add(item);
    }




}


//1. `ThemePark` stores all `Attractions` and `Stalls` in it.
//2. `ThemePark` has a method `getAllReviewed()` which returns an ArrayList of `IReviewed` objects.
//3. Add an empty `visitedAttractions` ArrayList to `Visitor` which stores a list of `Attractions` and a method to add an attraction to the list.
//4. `ThemePark` has a method `visit(Visitor, Attraction)` calls for the attraction to  increment its `visitCount` by 1 and adds the attraction to the visitors `visitedAttractions` list.
