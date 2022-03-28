/**
 * @author Simran 
 * @date 03.28.2022
 */


public class Company extends Customer{

	//constructor
	public Company(String name, String address) {
		super(name, address);
	}
	
	//overrides Customer class's chargeAllAccounts method & charges particular accounts only
	//if subtracted from savings account charge amount is doubled
	@Override
	public void chargeAllAccounts(double amount) {
		for(Account account : getAccounts()) {
			if(account instanceof CheckingAccount) {
				account.balance = account.balance-amount;
			}
			else if(account instanceof SavingsAccount) {
				account.balance = account.balance-amount*2;
			}
		}		
	}	
}
