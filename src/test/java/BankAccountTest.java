import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount myBankAccount;

    @BeforeEach
    public void setUp(){
        myBankAccount = new BankAccount("Faith", "Peddie", "15021999", "123456",20.00);
    }

    @Test
    public void canReturnFirstName(){
        String result = myBankAccount.getFirstName();
        assertThat(result).isEqualTo("Faith");
    }

    @Test
    public void canSetFirstName(){
        this.myBankAccount.setFirstName("John");
        assertThat(myBankAccount.getFirstName()).isEqualTo("John");
    }

    @Test
    public void canReturnLastName(){
        String result = myBankAccount.getLastName();
        assertThat(result).isEqualTo("Peddie");
    }

    @Test
    public void canSetLastName(){
        this.myBankAccount.setLastName("Doe");
        assertThat(myBankAccount.getLastName()).isEqualTo("Doe");
    }

    @Test
    public void canReturnDateOfBirth(){
        String result = myBankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("15021999");
    }

    @Test
    public void canSetDateOfBirth(){
        this.myBankAccount.setDateOfBirth("10052024");
        assertThat(myBankAccount.getDateOfBirth()).isEqualTo("10052024");
    }

    @Test
    public void canReturnAccountNumber(){
        String result = myBankAccount.getAccountNumber();
        assertThat(result).isEqualTo("123456");
    }

    @Test
    public void canSetAccountNumber(){
        this.myBankAccount.setAccountNumber("987654");
        assertThat(myBankAccount.getAccountNumber()).isEqualTo("987654");
    }

    @Test
    public void canReturnBalance(){
        double result = myBankAccount.getBalance();
        assertThat(result).isEqualTo(20.00);
    }

    @Test
    public void canSetBankBalance(){
        this.myBankAccount.setBalance(40.00);
        assertThat(myBankAccount.getBalance()).isEqualTo(40.00);
    }

    @Test
    // deposit
    public void canDeposit(){
        myBankAccount.deposit(10.00);
        assertThat(myBankAccount.getBalance()).isEqualTo(30.00);
    }

    // withdrawal
    @Test
    public void canWithdraw(){
        myBankAccount.withdrawal(05.00);
        assertThat(myBankAccount.getBalance()).isEqualTo(15.00);
    }

    @Test
    public void addInterest(){
        myBankAccount.interest(1.51, 2);
        // 0.0150 as a 1.51% interest rate is a percentage so convert it to a decimal
        assertThat(myBankAccount.getBalance()).isEqualTo(20.60);
    }
}
