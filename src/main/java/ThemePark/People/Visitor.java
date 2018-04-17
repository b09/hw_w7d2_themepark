package ThemePark.People;

public class Visitor {
    int age;
    int heightcm;
    int money;

    public Visitor(int age, int heightcm, int money) {
        this.age = age;
        this.heightcm = heightcm;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeightcm() {
        return heightcm;
    }

    public int getMoney() {
        return money;
    }
}
