package HW_6;

public class Fighter {

    String name;
    int firstAttack;
    int secondAttack;
    int health;

    Fighter(String name, int firstAttack, int secondAttack) {
        if (firstAttack + secondAttack >= 21) {
            System.out.println("to much strong");
        } else if (firstAttack <= 0 || secondAttack <= 0) {
            System.out.println("too weak");
        } else {
            this.name = name;
            this.firstAttack = firstAttack;
            this.secondAttack = secondAttack;
            this.health = 21 - (firstAttack + secondAttack);
        }
    }

}