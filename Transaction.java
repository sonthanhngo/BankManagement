
import java.io.Serializable;

public class Transaction implements Serializable{
	private Account sentAccount;
	private Account receiveAccount;
	private long amount;
	private String type;
	private long currentBalance;
	
	public Transaction(String type,Account sentAccount, Account receiveAccount, long amount, long currentBalance) {
		super();
		this.sentAccount = sentAccount;
		this.receiveAccount = receiveAccount;
		this.amount = amount;
		this.type = type;
		this.currentBalance = currentBalance;
	}
	
	public Transaction(String type,Account sentAccount, long amount, long currentBalance) {
		super();
		this.sentAccount = sentAccount;
		this.amount = amount;
		this.type = type;
		this.currentBalance = currentBalance;
	}

	public Account getSentAccount() {
		return sentAccount;
	}

	public void setSentAccount(Account sentAccount) {
		this.sentAccount = sentAccount;
	}

	public Account getReceiveAccount() {
		return receiveAccount;
	}

	public void setReceiveAccount(Account receiveAccount) {
		this.receiveAccount = receiveAccount;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	

	public long getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(long currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		if (type.equals("Withdraw")){
			return  "- "+ amount+"EUR, balance " + currentBalance + " EUR,withdraw" ; 
		}else if(type.equals("Deposit")){
			return  "+"+ amount+"EUR, balance " + currentBalance + " EUR,deposit" ; 
		}else {
			return  "- "+ amount+"EUR, balance " + currentBalance + " EUR,transact to " + receiveAccount.getAccountNumber() ; 
		}
	}
	
	

	

	
	
}
