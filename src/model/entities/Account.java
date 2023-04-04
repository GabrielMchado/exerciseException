package model.entities;

import model.exception.WhitdrawException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account() {
		super();
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
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

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void whitdraw(Double amount) throws WhitdrawException {
		if(amount > withdrawLimit) {
			throw new WhitdrawException("Withdraw error: The amount exceeds withdraw limit");
		}else if(amount > balance) {
			throw new WhitdrawException("Withdraw error: Not enough balance");
		}else {
			balance -= amount;
		}
	}
	

}
