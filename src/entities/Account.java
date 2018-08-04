package entities;

public class Account {
	
	private int number;
	private String holder;
	private double value;
	private final double TAX = 5.00;
	
	public Account(int number, String holder, double value) {
		this.number = number;
		this.holder = holder;
		this.value = value;
	}
	
	public Account(int number, String holder /*double value*/) {
		this.number = number;
		this.holder = holder;
		//this.value = value;
		
	}

	public void AccountCashIn(double value) {
		this.value += value;
		
	}
	
	public void AccountCashOut(double value) {
		this.value -= (value + TAX);
	}
	
	public String toString() {
		return "Account data: \n" 
		+ "Account: " 
		+ number
		+ ", "
		+ holder
		+", "
		+ String.format("Balance: $%.2f", value)
		+ "\n";
	}
		
	
	public double getNumber() {
		return number;
	}

	/*public void setNumber(double number) {
		this.number = number;
	}*/

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getValue() {
		return value;
	}

	/*public void setValue(double value) {
		this.value = value;
	}*/
	
	

}
