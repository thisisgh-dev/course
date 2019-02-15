package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends NewProduct {
	private Date manufactureDate;
	private static final SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
		super();

	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + date.format(manufactureDate) + ")";
	}

}
