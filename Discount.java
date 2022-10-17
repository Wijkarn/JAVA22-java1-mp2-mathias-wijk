
public class Discount extends Wares{
	
	boolean discounted;
	
	Discount(int amount, int cost, double discountAmount, boolean discounted){
		super(amount, cost, discountAmount);
		this.discounted = discounted;
	}
	
	void Discounted(boolean discounted) {
		cost = (int) (cost * discountAmount);
	}
}
