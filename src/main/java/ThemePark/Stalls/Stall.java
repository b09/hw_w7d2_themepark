package ThemePark.Stalls;

public abstract class Stall {
    String name;
    String ownerName;
    int parkingSpot;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setParkingSpot(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
