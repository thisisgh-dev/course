package entities;

import exceptions.DomainException;

public class NewAccount {

	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;

	public NewAccount(Integer number, String holder, double balance, double withdrawLimit) {

		// super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		this.balance += amount;

	}

	public void withdraw(double amount) {
		if (amount > this.withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");

		}

		if (amount > this.balance) {
			throw new DomainException("Not enough balance");
		}

		this.balance -= amount;

	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	/*
	 * public void setBalance(double balance) { this.balance = balance; }
	 */

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	@Override
	public String toString() {
		return "";

	}

}
