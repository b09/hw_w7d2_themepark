package ThemePark.Attractions;

import ThemePark.Interfaces.IChargeable;
import ThemePark.People.Visitor;

public class Dodgem extends Attraction implements IChargeable {
    int price;

    public Dodgem(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        boolean halfPrice = visitor.getAge()<= 12;
        return halfPrice ? (this.price / 2.0) : this.price ;
    }
}
