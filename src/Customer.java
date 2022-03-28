/**
 * @author Simran 
 * @date 03.28.2022
 */



import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
	private final long CUSTOMER_ID;
	private static long nextCustomerId = 2000000;
	private String name, address;
	
	//Costumer constructor
	public Customer(String name, String address){
		super();
		CUSTOMER_ID = nextCustomerId;
		nextCustomerId = CUSTOMER_ID + 7;
		this.name = name;
		this.address = address;
	}
	
	//returns a unique Customer ID
	public long getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	
	//amount passed in the method is charged for all Accounts
	public abstract void chargeAllAccounts(double amount);
	
	//creates Account class array list called accounts
	private List<Account> accounts = new ArrayList<Account>();
	
	//returns an array list of Account class
	public List<Account> getAccounts(){
		return accounts;
	}
		
	//adds an Account to the Customer profile 
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	//removes an Account from the Customer profile
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	//returns Customer name
	public String getName() {
		return name;
	}
	
	//sets the Customer name
	public void setName(String name) {
		this.name = name;
	}
	
	//gets Customer address
	public String getAddress() {
		return address;
	}
	
	//sets Customer address
	public void setAddress(String address) {
		this.address = address;
		}
}
