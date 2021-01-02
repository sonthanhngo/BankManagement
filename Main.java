

import java.util.Date;

public class Main{
	public static void main(String[] args) {
		new indexGUI();
		 Account a = new Account("admin", "admin", "Ngo Thanh Son", "1111", new Date(2000, 11, 1), "admin@admin.com", "113");
 		Account s = new Account("admin1", "admin1", "Ngo Thanh Son", "1111", new Date(2000, 11, 1), "admin@admin.com", "113");
 		Database.accountList.add(a);
 		Database.accountList.add(s);
 		System.out.println("admin " + a.getAccountNumber());
 		System.out.println("admin1 " + s.getAccountNumber());
	}
}