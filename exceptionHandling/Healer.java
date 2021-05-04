package exceptionHandling;

public class Healer extends Character{

    public Healer(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }

    public boolean attack(){
        int serang = getRandomNumber(0,100);
        if (serang <= 85) {
            return true;
        } else {
            return false;
        }
    }

    public void heal() {
        System.out.println("Menggunakan skill heal");
        setHP(getHP() + 25);
    }
}
