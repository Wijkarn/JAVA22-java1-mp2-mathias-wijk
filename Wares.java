
public class Wares {
	int amount;
	int cost;
	
	Wares(int amount, int cost){
		this.amount = amount;
		this.cost = cost;
	}
	
	void bought() {
		amount--;
	}
	
}
