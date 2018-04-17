package ThemePark.Interfaces;

import ThemePark.People.Visitor;

public interface IRestrictable {
    public boolean isAllowedTo(Visitor visitor);
}
