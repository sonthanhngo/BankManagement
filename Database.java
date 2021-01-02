
import java.util.ArrayList;
import java.util.Date;

public class Database {
//	static Date adminDate = new Date(0, 0, 0);
//	static Account admin = new Account("admin", "admin", "admin", "admin",adminDate, "admin@admin.com", "0");
	static ArrayList<Account> accountList = new ArrayList<Account>();
	static ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
	
	public static void addAccount(Account a) {
		accountList.add(a);
	}
	public static void addTransaction(Transaction t) {
		transactionList.add(t);
	}
	
	public static void deleteAccount(Account a) {
		accountList.remove(a);
	
	}
//	public static void deleteAccount(Account a) {
//		for (Account acc: accountList) {
//			if (acc.getUsername() == a.get) {
//				accountList.remove(acc);
//			}
//		}
//	}
	
	public void changeAccountUsername(Account a) { 
	}
	public void changeAccountPassword(Account a) {
	}
	public void changeAccountEmail(Account a) {
	}
	public void changeAccountPhone(Account a) {
	}
	public static void checkAccountInfo(String username,String password) {
		for (Account acc: accountList) {
			if (acc.getUsername() == username && acc.getPassword() == password) {
				System.out.println("Login successfully");
//				for(int i =0;i< 50;i++) {
//					System.out.println();
//				}
			}
		}
	}
	
	public static void print() {
		for(Account acc: accountList) {
			System.out.println(acc.toString());
		}
	}

}
