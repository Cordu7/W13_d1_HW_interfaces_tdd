package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 4.50;}

    public double priceFor(Visitor visitor) {
        return 2.25;}

    public double calculateTicket(Visitor visitor){
        if (visitor.getAge() <=12){
            return priceFor(visitor);
        } else {
            return defaultPrice();
        }
    }
}
