package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double Tax() {
		
		//double result = 0;
		if (getAnualIncome() < 20000.00) {
			//result = (getAnualIncome() * 25 / 100) - (healthExpenditures * 50 / 100);
			return (getAnualIncome() * 15 / 100) - (healthExpenditures * 50 / 100);
		} else {
			return (getAnualIncome() * 25 / 100) - (healthExpenditures * 50 / 100);
		}
		

	}

}
