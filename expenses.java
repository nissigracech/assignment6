import java.util.Scanner;

public class Expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items : ");
        int n = scanner.nextInt();

        double totalCost = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Item Type " + i + ":");
            System.out.print("Enter the amount of quantity purchased: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter the price per item: ");
            double priceOfItem = scanner.nextDouble();

            double costPerItem = quantity * priceOfItem;
            double discount = 0;

            if (quantity > 50) {
                discount = costPerItem * 0.10;
            } else if (quantity >= 25 && quantity <= 50) {
                discount = costPerItem * 0.05;
            }

            totalCost += costPerItem - discount;
        }

        System.out.println("Total expenses: Rs. " + totalCost);

        scanner.close();
    }
}
