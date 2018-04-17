package ThemePark.Attractions;

import ThemePark.Interfaces.IChargeable;
import ThemePark.Interfaces.IRestrictable;
import ThemePark.People.Visitor;

public class Rollercoaster extends Attraction implements IRestrictable, IChargeable {
    int price;

    public Rollercoaster(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getHeightcm()>= 145) && (visitor.getAge()>= 12);
    }

    @Override
    public double priceFor(Visitor visitor) {
        boolean halfPrice = visitor.getAge()<= 12;
       return halfPrice ? (this.price / 2.0) : this.price ;
    }
}
