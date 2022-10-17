
public class Customer {
	
	int totalAmount;
	int totalSum;
	
	Customer(int totalAmount, int totalSum){
		this.totalAmount = totalAmount;
		this.totalSum = totalSum;
	}
	
	void sek(int cost) {
		totalSum = totalSum + cost;
	}
	
	void amount(){
		totalAmount++;
	}
}
