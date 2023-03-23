# Bank Design Project

A Bank Design Project implementing standard OOD practice

## UML Diagram
![image](https://github.com/simranfarrukh/Bank-Design-Project/blob/main/bank_design_uml.png?raw=true)

## Class Implementation
#### AcountController 
 * Generalization and Multiple Inheritance with AccountController class as a parent and Customer class and Account class as children
 * AccountController class as a General Class (parent)
 * Customer & Account classes as Subclasses (children)

#### Account 
 * Generalization with AccountController as General class (parent)
 * Generalization with Customer as General class (parent) 
 * Direct Association with CheckingAccount and SavingsAccount class
 * SavingsAccount & CheckingAccount classes extend the Account class (base)

CheckingAccount 
 * Direct Association with Account
 * Implements Account class constructor for all methods

Company
 * Direct Association with Customer
 * Implements Customer class constructor for all methods

Customer
 * Generalization with AccountController as General class (parent)
 * Generalization with Customer as General class (parent) for Account class
 * Direct Association with Person and Company class
 * Person & Company classes extend the Customer class (base)

Person
 * Direct Association with Customer
 * Implements Customer class constructor for all methods

SavingsAccount
 * Direct Association with Account
 * Implements Account class constructor for all methods

## Project Constraints

#### Account
* Each account has a constant, unique id. Id numbers start from 1000 and
increment by 5. The ACCOUNT_ID attribute is initialised when the account object is created. The id is generated internally within the class, it is passed in as
an argument

* The deposit method increases the balance by the value passed in as an argument. 

* The withdraw method reduces the balance by the value passed in as an argument. It returns the value of the argument

* The account is able to go overdrawn 

* The correctBalance method changes the balance to match the value passed in as an argument

#### Customer
* Each customer has a constant, unique id. Id numbers start from 2000000 and increment by 7. The CUSTOMER_ID attribute is initialised when the account object is created. The id is generated internally within the class, it is not be passed in as an argument

* The customer’s name and address are set when the customer object is created

* The addAccount() method takes an account object as an argument and adds it to the list of accounts stored within the customer

* The removeAccount() method takes an account object as an argument and removes it from the list of accounts stored within the customer

#### SavingsAccount
* It is not be possible for the savings account to go overdrawn. In the case that an amount larger than the balance is passed into the withdraw method, nothing is subtracted from the balance and zero is returned

* The addInterest() method calculates the interest due on the account and adds it to the
balance. The formula to calculate the interest due is balance * interest rate / 100

#### CheckingAccount
* The getNextCheckNumber() method returns the value of the nextCheckNumber variable. The first check has number 1. Each subsequent check number counts
up by one

#### Person
* The chargeAllAccounts method is implemented so that the amount passed in is subtracted from the balance of each of the person’s accounts.

#### Company
* The chargeAllAccounts method is implemented so that the amount passed in is
subtracted from the balance of all of the company’s checking accounts

* The amount
subtracted from the balance of all of the company’s savings accounts is double the
amount passed in

#### AccountController
* The createCustomer method takes a name, address and customer type as arguments

  * If the type is “person”, createCustomer creates a Person object with the correct
name and address. It adds the Person object to the account controller’s list of
Person objects and returns the Person object

  * If the type is “company”, createCustomer creates a Company object with the correct name and address. It adds the Company object to the account
controller’s list of Company objects and returns the Company object

* The createAccount method takes a Customer object and an account type as arguments

  * If the type is “checking”, createAccount creates a CheckingAccount object, adds
the object to accountController’s list of accounts and to the customer’s list of accounts, then return the CheckingAccount object

  * If the type is “savings”, createAccount creates a SavingsAccount object, adds the
object to accountController’s list of accounts and to the customer’s list of accounts, then returns the SavingsAccount object

* The removeAccount method takes an Account object as an argument
 
  * It removes the account from the account controller’s list of accounts

  * It removes the account from the customer’s list of accounts

* The removeCustomer method takes a Customer object as an argument

  * It removes the customer from the account controller’s list of customers

  * It removes all of the customer’s accounts from the account controller’s list of
accounts

## Contributing
For pull requests, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
All rights reserve and exclusive to Simran Farrukh. Do not copy or share this code.
