
import java.io.Serializable;
import java.util.Date;
import java.util.Random;

public class Account implements Serializable {
	private String accountNumber;
	private String username;
	private String password;
	private String fullName;
	private String SSN;
	private Date dateOfBirth;
	private String email;
	private String phoneNumber;
	private long balance;
	
	public Account(String username, String password, String fullName,String SSN, Date dateOfBirth, String email,
			String phoneNumber,long balance) {
		Random r = new Random();
		this.accountNumber = (Integer.toString(r.nextInt(99998) + 100001));
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.SSN = SSN;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Account(String username, String password, String fullName,String SSN, Date dateOfBirth, String email,
			String phoneNumber) {
		this(username,password,fullName,SSN,dateOfBirth,email,phoneNumber,0);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", username=" + username + ", password=" + password
				+ ", fullName=" + fullName + ", SSN=" + SSN + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", balance=" + balance + "]";
	}
	
	
	
	
	
		
	
	
	
	
	

}
