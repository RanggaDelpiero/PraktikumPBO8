package exceptionHandling;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Inisialisasi
        String nama;
        int input = 0;
        Character[] character = new Character[4];
        character[0] = new Magician(10, 60, 100);
        character[1] = new Healer(10, 10, 70);
        character[2] = new Warrrior(30, 25, 80);
        character[3] = new Titan(0, 45, 200);
        Scanner userInput = new Scanner(System.in);
        boolean repeat;

        //Game Menu
        System.out.println("Selamat datang di game Defend FILKOM");
        System.out.print("Silahkan masukan nama player : ");
        nama = userInput.nextLine();
        do {
            try {
                System.out.println("Silahkan pilih karakter yang anda inginkan : ");
                System.out.println("1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                input = userInput.nextInt();
                repeat = false;
            } catch (InputMismatchException ex) {
                System.out.println("Tolong masukan angka !");
                repeat = true;
                userInput.nextLine();
            }
        } while (repeat);

        System.out.printf("Selamat datang, %s !\n", nama);
        switch (input) {
            case 1:
                character[0].info();
                break;
            case 2:
                character[1].info();
                break;
            case 3:
                character[2].info();
                break;
            default:
                System.out.println("Character tidak tersedia");
        }

        int turn = 1;
        while((character[3].getHP() != 0) && (character[input-1].getHP()!= 0)) {

            System.out.printf("============ TURN %d ============\n", turn);
            if (turn % 2 != 0) {
                if (character[input-1].attack()) {
                    character[3].receiveDamage(character[input-1].getAttack());
                }
                turn++;
            } else {
                if (character[3].attack()) {
                    character[input-1].receiveDamage(character[3].getAttack());
                }
                if (character[input - 1] instanceof Healer) {
                    ((Healer) character[input - 1]).heal();
                }
                turn++;
            }
            System.out.printf("Enemy's HP   : %d\n", character[3].getHP());
            System.out.printf("%s's HP  : %d\n", nama, character[input-1].getHP());
        }
        System.out.println("=================================");
        if (character[3].getHP() == 0) {
            System.out.println(nama + " menang\n");
        } else {
            System.out.println("Musuh menang\n");
        }

        System.out.println("============= PLAYER =============");
        character[input-1].info();
        System.out.println("============== MUSUH =============");
        character[3].info();
    }
}
