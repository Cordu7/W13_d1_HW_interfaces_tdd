package behaviours;

import people.Visitor;

public interface ITicketed {
    public double defaultPrice();
    public double priceFor(Visitor visitor);

}
//double defaultPrice()` and `double priceFor(Visitor)
