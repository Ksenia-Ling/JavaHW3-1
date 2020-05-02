public class Main {
    public static void main(String[] args) {
        int ticketcost = 3518;
        int condinrub = 20;
        int bonus = 1;
        int totalbonus = (ticketcost / condinrub) * bonus;

        System.out.println(totalbonus);
    }
}