/**
 * @author Simran 
 * @date 03.28.2022
 */

package com.fdmgroup.bankDesignProject;

/*
 * UML Class Diagram: 
 * Account<———SavingsAccount
 * 
 * Direct Association with Account
 * Implements Account class constructor for all methods
 */

public class SavingsAccount extends Account{
	private double interestRate;
	
	//constructor
	SavingsAccount(){
		super();
	}
	
	//adds interest on balance and deposits it to the account
	public void addInterest() {
		double calculatedInterest = getBalance() * interestRate / 100;
		deposit(calculatedInterest);
	}

	//returns interest rate
	public double getInterestRate() {
		return interestRate;
	}
	
	//sets interest rate
	public void setInterestRate(double rate) {
		interestRate = rate;
	}	

	//overrides Account class's withdraw method & doesn't allow overdraw
	@Override
	public double withdraw(double amount) {
		if(amount <= balance) {
			balance = balance-amount;
			return amount;
		}
		else
		return 0;
	}
}


