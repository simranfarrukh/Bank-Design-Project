/**
 * @author Simran 
 * @date 03.28.2022
 */



/*
 * UML Class Diagram: 
 * AccountController<>———Account
 * Customer<>———Account
 * Account<———[SavingsAccount, CheckingAccount]
 * 
 * Generalization with AccountController as General class (parent)
 * Generalization with Customer as General class (parent) 
 * Direct Association with CheckingAccount and SavingsAccount class
 * SavingsAccount & CheckingAccount classes extend the Account class (base)
 */

public abstract class Account {
	private final long ACCOUNT_ID; 
	private static long nextAccountId = 1000;
	protected double balance;
	
	//constructor that makes sure Account ID remains unique
	public Account() {
		super();
		ACCOUNT_ID = nextAccountId;
		nextAccountId = nextAccountId + 5;
	}
	
	//returns the unique Account ID
	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	
	//withdraw method that allows overdraw
	public double withdraw(double amount) {
		balance = balance - amount;
		return amount;
	}
	
	//deposit method
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	//returns the correct balance which is equal to the balance
	public void correctBalance(double amount) {
		balance = amount;
	}
	
	//returns balance
	public double getBalance() {
		return balance;
	}
	
}