package ThemePark.Stalls;

import ThemePark.Interfaces.IChargeable;
import ThemePark.Stall;

public class CandyFlossStall extends Stall implements IChargeable {

    public CandyFlossStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


}
