/**
 * @author Simran 
 * @date 03.28.2022
 */



public class Person extends Customer {

	//constructor
	public Person(String name,String address) {
		super(name, address);
	}

	//overrides Customer class's chargeAllAccounts method & charges particular accounts only
	@Override
	public void chargeAllAccounts(double amount) {
		for(Account account : getAccounts()) {
			account.balance -= amount;
		}
	}
}
