package exceptionHandling;

import java.util.Random;

public abstract class Character {

    private int defense;
    private int attack;
    private int HP;;

    public abstract boolean attack();

    public Character(int defense, int attack, int HP) {
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    public void receiveDamage(int damage) {
        if ((damage-defense) <= getHP()) {
            setHP(getHP()-(damage-defense));
        } else if ((damage-defense > getHP())) {
            setHP(0);
        }
    }

    public void info(){
        System.out.println("------------- STATUS -------------");
        System.out.printf("Role     : %s\n", this.getClass().getSimpleName());;
        System.out.printf("HP       : %d\n", getHP());
        System.out.printf("Attack   : %d\n", getAttack());
        System.out.printf("Defense  : %d\n", getDefense());
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min) + min;
    }
}
