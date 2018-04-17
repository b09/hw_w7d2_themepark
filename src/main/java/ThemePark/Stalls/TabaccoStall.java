package ThemePark.Stalls;

import ThemePark.Interfaces.IRestrictable;
import ThemePark.People.Visitor;

public class TabaccoStall extends ThemePark.Stalls.Stall implements IRestrictable {

    public TabaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 18);
    }
}
