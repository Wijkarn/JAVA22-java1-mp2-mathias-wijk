public class Discounted extends Wares{

	boolean discounted;
	
	Discounted(int amount, int cost, double discountAmount, boolean discounted){
		super(amount, cost, discountAmount);
		this.discounted = discounted;
	}
	void discounted(boolean discounted) {
		cost = (int) (cost * discountAmount);
		
	}
}