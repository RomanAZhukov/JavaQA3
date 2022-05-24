public class Main {
    public static void main(String[] args) {
        int score = 100;
        int pay = 1001;
        int bonus = pay / 100;

        if (pay < 1000) {

            System.out.println("Счет:" + (score + pay));
        } else {
            System.out.println("Бонус:" + bonus);
            System.out.println("Счет:" + (score + pay + bonus));
        }
    }
}