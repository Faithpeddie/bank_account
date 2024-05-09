public class BankAccount {

    // properties
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String accountNumber;
    private double balance;

    // the accountNumber is a string to ensure we do not lose any 0s at the beginning of the account number
    // the balance is a double as it will likely contain decimals

    // constructor
    public BankAccount(String firstName, String lastName, String dateOfBirth, String accountNumber, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 20.00;
    }

    // behaviours
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdrawal(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void interest(double interestRate, int years){
        double interestAmount = balance * (interestRate / 100) * years;
        balance += interestAmount;
    }

    // getter
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return Math.round(balance * 100.00) / 100.00;
    }

    // setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

}
