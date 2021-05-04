package exceptionHandling;

public class Warrrior extends Character{

    public Warrrior(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    public boolean attack() {
        int serang = getRandomNumber(0,100);
        if (serang <= 60) {
            return true;
        } else {
            return false;
        }
    }
}
