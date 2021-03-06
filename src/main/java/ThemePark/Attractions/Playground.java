package ThemePark.Attractions;

import ThemePark.Interfaces.IRestrictable;
import ThemePark.People.Visitor;

public class Playground extends Attraction implements IRestrictable {

    public Playground(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() <= 15);
    }
}
