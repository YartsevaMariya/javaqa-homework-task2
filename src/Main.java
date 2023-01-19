public class Main {
    public static void main(String[] args) {
        int balance = 10;
        int refill = 1356;

        int gift = refill/100;

        if (refill > 1000) {
            System.out.println("Сумма бонусов равна " + gift + ", остаток на счете "+(balance+refill+gift) );
        } else {
            System.out.println("Сумма бонусов равна 0 " + "Остаток на счете " + (balance+refill) );
        }
    }
}