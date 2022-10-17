
public class Customer {
	
	int totalAmount;
	int totalSum;
	
	Customer(int totalAmount, int totalSum){
		this.totalAmount = totalAmount;
		this.totalSum = totalSum;
	}
	
	void sekAndAmount(int cost) {
		totalSum = totalSum + cost;
		totalAmount++;
	}
	
	void amount(){
		totalAmount++;
	}
}
