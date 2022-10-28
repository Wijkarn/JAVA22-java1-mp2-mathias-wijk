public class Discounted extends Wares{

	boolean discounted;
	double discountAmount;
	
	Discounted(int amount, int cost, double discountAmount){
		super(amount, cost);
		this.discountAmount = discountAmount;

	}
	void discounted() {
		cost = (int) (cost * ((100 - discountAmount)/100 ));		
	}
}