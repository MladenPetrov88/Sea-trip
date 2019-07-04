import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyForFood = Double.parseDouble(scanner.nextLine());
        double moneyForSouvenirs = Double.parseDouble(scanner.nextLine());
        double moneyForHotel = Double.parseDouble(scanner.nextLine());

        double neededFuel = 420 * 0.07 * 1.85;
        double cost = 3 * moneyForFood + 3 * moneyForSouvenirs;

        double firstDayAtHotel = moneyForHotel * 0.90;
        double secontDayAtHotel = moneyForHotel * 0.85;
        double thirdDayAtHotel = moneyForHotel * 0.80;

        double totayMoneyForHotel = firstDayAtHotel + secontDayAtHotel + thirdDayAtHotel;

        double totalCost = neededFuel + cost + totayMoneyForHotel;
        System.out.printf("Money needed: %.2f",totalCost);
    }
}
