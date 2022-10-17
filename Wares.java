
public class Wares {
	int amount;
	int cost;
	double discountAmount;
	
	Wares(int amount, int cost, double discountAmount){
		this.amount = amount;
		this.cost = cost;
		this.discountAmount = discountAmount;
	}
	
	void bought() {
		amount--;
	}
}
