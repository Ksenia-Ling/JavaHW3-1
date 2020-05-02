public class Main {
    public static void main(String[] args) {
        int ticketCost = 3518;
        int condInRub = 20;
        int bonus = 1;
        int totalBonus = (ticketCost / condInRub) * bonus;

        System.out.println(totalBonus);
    }
}