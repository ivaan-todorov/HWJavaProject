package HW_6;

public class Main_Fight {



    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5,4);


        int healthAfter1Attack = fighter2.health;
        int healthAfter2Attack = fighter1.health;
        while (healthAfter1Attack > 0 && healthAfter2Attack > 0) {
            healthAfter1Attack -= fighter1.firstAttack;
            if (healthAfter1Attack <= 0) {
                System.out.println(fighter1.name + " is winner");
                break;
            }
            healthAfter2Attack -= fighter2.firstAttack;
            if (healthAfter2Attack <= 0) {
                System.out.println(fighter2.name + " is winner");
                break;
            }

            healthAfter1Attack -= fighter1.secondAttack;
            if (healthAfter1Attack <= 0) {
                System.out.println(fighter1.name + " is winner");
                break;
            }

            healthAfter2Attack -= fighter2.secondAttack;
            if (healthAfter2Attack <= 0) {
                System.out.println(fighter2.name + " is winner");
                break;
            }
        }
    }
}
