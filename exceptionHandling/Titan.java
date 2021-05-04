package exceptionHandling;

public class Titan extends Character{



    public Titan (int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    public boolean attack() {
        int serang = getRandomNumber(0,100);
        if (serang <= 40) {
            return true;
        } else {
            return false;
        }
    }
}
