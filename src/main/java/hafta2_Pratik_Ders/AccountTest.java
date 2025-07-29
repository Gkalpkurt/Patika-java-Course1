package hafta2_Pratik_Ders;

public class AccountTest {
    public static void main(String[] args) {
        // Account account = new Account(); // Abstract sınıf, nesne oluşturulamaz

        SavingAccount savingAccount = new SavingAccount(5000, 20.00);
        // savingAccount.setInterestRate(20.00);

        InvestingAccount investingAccount = new InvestingAccount(5000);
    }
}
