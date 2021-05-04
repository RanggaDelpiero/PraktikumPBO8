package exceptionHandling;

public class Magician extends  Character{

    public Magician(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    public boolean attack() {
        int serang = getRandomNumber(0, 100);
        if (serang <= 35) {
            return true;
        } else {
            return false;
        }
    }
}
