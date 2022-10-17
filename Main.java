import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int input = 0;

		int fishAmount = 10;
		int fishCost = 30;

		int melonAmount = 5;
		int melonCost = 50;

		int milkAmount = 20;
		int milkCost = 7;

		double discountAmount = 0.5; // 50%

		Wares fish = new Wares(fishAmount, fishCost, discountAmount);
		Wares melon = new Wares(melonAmount, melonCost, discountAmount);
		Wares milk = new Wares(milkAmount, milkCost, discountAmount);

		Customer customer = new Customer(-1, 0);

		Scanner myScanner = new Scanner(System.in);

		while (!(input == 4)) {

			System.out.println("!!! NEW (UN)LIMITED SALE ON MELONS 50% OFF!!!");
			System.out.println("1. Buy fish, " + fish.cost + " SEK, " + fish.amount + " left!");
			System.out.println("2. Buy Melon, " + melon.cost + " SEK, " + melon.amount + " left!");
			System.out.println("3. Buy Milk, " + milk.cost + " SEK, " + milk.amount + " left!");
			System.out.println("4. Quit");

			input = myScanner.nextInt();

			// fish
			if (input == 1 && fish.amount > 0) {
				fish.bought();
				customer.sek(fishCost);
			}
			// melon
			else if (input == 2 && melon.amount > 0) {
				melon.bought();
				customer.sek(melonCost);
				
			}
			// milk
			else if (input == 3 & milk.amount > 0) {
				milk.bought();
				customer.sek(milkCost);
			}
			customer.amount();
		}

		myScanner.close();
		System.out.println("You purchased a total of " + customer.totalAmount + " items. The total cost was "
				+ customer.totalSum + " SEK.");

	}

}
