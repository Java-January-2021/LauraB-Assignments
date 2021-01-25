public class BankAccountTest {

	public static final String RESET = "\033[0m";  // Text Reset
	public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
	public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
	public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		System.out.println(CYAN_BOLD_BRIGHT + "\n------------DISPLAY BALANCES------------\n" + RESET);
		acc.depositMoney(5000, "savings");
		acc.depositMoney(1500, "checking");
		
		System.out.println(" AFTER DEPOSIT(S):");
		acc.displayAccountBalance();

		System.out.println("Balance for all accounts:  \t" + GREEN_BOLD_BRIGHT + "$" + BankAccount.allAccountBalances + RESET);
		acc.withdrawMoney(1200, "savings");
		acc.withdrawMoney(2000, "checking");
		
		System.out.println("\nAFTER WITHDRAWAL(S):");

		acc.displayAccountBalance();

		System.out.println("Balance for all accounts:   \t" + GREEN_BOLD_BRIGHT + "$" + BankAccount.allAccountBalances + RESET);
	}
}
