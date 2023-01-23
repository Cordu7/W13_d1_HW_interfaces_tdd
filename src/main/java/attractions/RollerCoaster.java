package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getHeight() >= 145.00){
            return true;
        } else {
            return false;
        }
    }
}
