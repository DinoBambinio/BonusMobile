public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;
        int bonus = 0;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }

        int newBalance = balance + replenishment + bonus;

        System.out.println("баланс: " + newBalance + " рублей");
        System.out.println("бонус соствил: "+ bonus + " рублей");



    }
}