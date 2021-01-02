



import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class homeGUI extends JFrame   {
	public JTextField textField_1;
	public JFrame homeFrame;
	public JButton btnDeposit,transactButton,depositButton,withdrawButton,performTransactButton;
	public JLabel hello,transactCompleteLabel,transactHistoryLabel,transactAccNoLabel,transactAmountLabel,transactMesLabel,withdrawAmountLabel,depositAmountLabel,bankLogo;
	public JTextField transactAccNo,transactAccAmount,withdrawAmount,depositAmount;
	public JTextArea transactHistory;
	private JLabel errorTransactBalanceLabel;
	private JLabel errorTransactNumberLabel;
	private JLabel withdrawCompleteLabel;
	private JButton performWithdrawButton;
	private JLabel depositCompleteLabel;
	private JButton performDepositButton;
	private long tempBalance;
	private JButton loggoutButton;
	private JLabel errorTransactAmountNeg;
	private JLabel balance;
	private boolean found;
		
	public homeGUI(Account a){
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	homeFrame = new JFrame("Deutsche Bundesbank");
    homeFrame.getContentPane().setBackground(new Color(0, 51, 102));
    homeFrame.setSize(screenSize.width,screenSize.height);
    homeFrame.setLocation(0,0);
    homeFrame.getContentPane().setLayout(null);
    
    bankLogo = new JLabel("");
    bankLogo.setIcon(new ImageIcon("E:\\Download\\bundesbank.png"));
    bankLogo.setBounds(358, 10, 780, 200);
    homeFrame.getContentPane().add(bankLogo);
	  
    transactCompleteLabel = new JLabel("Transaction complete");
    transactCompleteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    transactCompleteLabel.setForeground(new Color(255, 204, 0));
    transactCompleteLabel.setBounds(88, 570, 193, 25);
	  homeFrame.getContentPane().add(transactCompleteLabel);
	  transactCompleteLabel.setVisible(false);
	  
	  errorTransactNumberLabel = new JLabel("Error!Account number not found");
	  errorTransactNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
	  errorTransactNumberLabel.setForeground(new Color(255, 222, 0));
	  errorTransactNumberLabel.setBounds(88, 570, 193, 25);
	  homeFrame.getContentPane().add(errorTransactNumberLabel);
	  errorTransactNumberLabel.setVisible(false);
	  
	  errorTransactAmountNeg = new JLabel("Error! Negative amount");
	  errorTransactAmountNeg.setFont(new Font("Tahoma", Font.PLAIN, 15));
	  errorTransactAmountNeg.setForeground(new Color(255, 222, 0));
	  errorTransactAmountNeg.setBounds(82, 570, 193, 25);
	  homeFrame.getContentPane().add(errorTransactAmountNeg);
	  errorTransactAmountNeg.setVisible(false);
	  
	  errorTransactBalanceLabel = new JLabel("Error!Out of balance");
	  errorTransactBalanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
	  errorTransactBalanceLabel.setForeground(new Color(255, 204, 0));
	  errorTransactBalanceLabel.setBounds(88, 570, 222, 25);
	  homeFrame.getContentPane().add(errorTransactBalanceLabel);
	  errorTransactBalanceLabel.setVisible(false);
		
    transactButton = new JButton("Transaction");
    transactButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
    transactButton.setForeground(new Color(255, 204, 0));
    transactButton.setBackground(new Color(0, 51, 102));
    transactButton.setBounds(82, 417, 152, 38);
    transactButton.setBorder(null);
    transactButton.setFocusPainted(false);
    transactButton.setContentAreaFilled(false);
    homeFrame.getContentPane().add(transactButton);
    transactButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		  homeFrame.getContentPane().remove(transactCompleteLabel);
      		  homeFrame.getContentPane().remove(errorTransactAmountNeg);
      		  homeFrame.getContentPane().remove(errorTransactBalanceLabel);
      		  homeFrame.getContentPane().remove(errorTransactNumberLabel);

//      		  homeFrame.getContentPane().remove(errorTransactBalanceLabel);
//      		  homeFrame.getContentPane().remove(errorTransactNumberLabel);

      		  
      		  transactButton.setEnabled(false);
      		  
      		transactAccNoLabel = new JLabel("Enter account number");
            transactAccNoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
            transactAccNoLabel.setForeground(new Color(255, 204, 0));
            transactAccNoLabel.setBounds(85, 492, 171, 25);
            homeFrame.getContentPane().add(transactAccNoLabel);
            
            transactAccNo = new JTextField();
            transactAccNo.setText("");
            transactAccNo.setColumns(10);
            transactAccNo.setBorder(null);
		    transactAccNo.setOpaque(false);
		    transactAccNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    transactAccNo.setForeground(new Color(255, 204, 0));
            transactAccNo.setBounds(82, 527, 152, 25);
            transactAccNo.setHorizontalAlignment(SwingConstants.CENTER);
            homeFrame.getContentPane().add(transactAccNo);
            
            transactAmountLabel= new JLabel("Enter amount");
            transactAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
            transactAmountLabel.setForeground(new Color(255, 204, 0));
            transactAmountLabel.setBounds(105, 605, 96, 25);
            homeFrame.getContentPane().add(transactAmountLabel);
        
            transactAccAmount = new JTextField();
            transactAccAmount.setText("");
            transactAccAmount.setColumns(10);
            transactAccAmount.setBorder(null);
            transactAccAmount.setOpaque(false);
            transactAccAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
            transactAccAmount.setForeground(new Color(255, 204, 0));
            transactAccAmount.setBounds(82, 641, 152, 25);
            transactAccAmount.setHorizontalAlignment(SwingConstants.CENTER);
            homeFrame.getContentPane().add(transactAccAmount);
           
            performTransactButton = new JButton("");
            performTransactButton.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\ok.png"));
            performTransactButton.setForeground(Color.BLACK);
            performTransactButton.setBorder(null);
            performTransactButton.setFocusPainted(false);
            performTransactButton.setContentAreaFilled(false);
            performTransactButton.setBackground(new Color(255, 204, 102));
            performTransactButton.setBounds(118, 695, 83, 83);
            homeFrame.getContentPane().add(performTransactButton);
      	      homeFrame.getContentPane().repaint();
      	      
      	      performTransactButton.addActionListener(new ActionListener() {
        	      	public void actionPerformed(ActionEvent arg0) {
        	      		performTransactButton.setEnabled(false);
        	      		if(Long.parseLong(transactAccAmount.getText()) >= 0) {
        	      			if(a.getBalance() >= Long.parseLong(transactAccAmount.getText())) {
        	      				for(int i = 0;i< Database.accountList.size();i++) {
        	      						if(Database.accountList.get(i).getAccountNumber().equals(transactAccNo.getText())){
			        	      				Database.accountList.get(i).setBalance(Database.accountList.get(i).getBalance() + Long.parseLong(transactAccAmount.getText()));
			        	      				Transaction t = new Transaction("Transact", a,Database.accountList.get(i) ,Long.parseLong(transactAccAmount.getText()), a.getBalance() - Long.parseLong(transactAccAmount.getText()));
			        	      				Database.accountList.remove(a);
			        	      				a.setBalance(a.getBalance() - Long.parseLong(transactAccAmount.getText()));

			        	      				Database.accountList.add(a);
			        	      				Database.transactionList.add(t);
			        	      				transactHistory.append(t.toString() + "\n");	
			        	      				transactCompleteLabel = new JLabel("Transaction complete");
			        		          	    transactCompleteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        		          	    transactCompleteLabel.setForeground(new Color(255, 204, 0));
			        		          	    transactCompleteLabel.setBounds(82, 570, 193, 25);
			        		          	    homeFrame.getContentPane().add(transactCompleteLabel);
			        		          	    found = true;
		        		          	    // editing the code to add label
        	      						}
        	      				}
        	      				if(found != true) {
		        	      				errorTransactNumberLabel = new JLabel("Error!Account number not found");
		        	      			    errorTransactNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		        	      			    errorTransactNumberLabel.setForeground(new Color(255, 222, 0));
		        	      			    errorTransactNumberLabel.setBounds(82, 570, 193, 25);
		        	      			    homeFrame.getContentPane().add(errorTransactNumberLabel);
        	      				}
        	      			}else{
		        	      			errorTransactBalanceLabel = new JLabel("Error!Out of balance");
			        	      		errorTransactBalanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			        	      		errorTransactBalanceLabel.setForeground(new Color(255, 204, 0));
			        	      		errorTransactBalanceLabel.setBounds(82, 570, 222, 25);
			        	      		homeFrame.getContentPane().add(errorTransactBalanceLabel);	
        	      			}
        	      		}else {
        	      			  errorTransactAmountNeg = new JLabel("Error! Negative amount");
        	      			  errorTransactAmountNeg.setFont(new Font("Tahoma", Font.PLAIN, 15));
        	      			  errorTransactAmountNeg.setForeground(new Color(255, 222, 0));
        	      			  errorTransactAmountNeg.setBounds(82, 570, 193, 25);
        	      			  homeFrame.getContentPane().add(errorTransactAmountNeg);
        	      		}
        	      	
        	      		homeFrame.getContentPane().remove(transactAccNoLabel);
	          	      	homeFrame.getContentPane().remove(transactAccNo);
	          	      	homeFrame.getContentPane().remove(transactAmountLabel);
	          	      	homeFrame.getContentPane().remove(transactAccAmount);
		        
	          	      	transactButton.setEnabled(true);
	          	      	
	          	      	homeFrame.getContentPane().remove(performTransactButton);
	          	      	
	          			balance.setText(Long.toString(a.getBalance()));

	          	      	homeFrame.getContentPane().repaint();

        	      	}
        	      });  
      	}
      });
    
    
    
   
	  
    withdrawCompleteLabel = new JLabel("Transaction complete");
    withdrawCompleteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    withdrawCompleteLabel.setForeground(new Color(255, 204, 0));
    withdrawCompleteLabel.setBounds(405, 570, 193, 25);
	homeFrame.getContentPane().add(withdrawCompleteLabel);
	withdrawCompleteLabel.setVisible(false);
	  

		
    withdrawButton = new JButton("Withdraw");
    withdrawButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
    withdrawButton.setForeground(new Color(255, 204, 0));
    withdrawButton.setBackground(new Color(0, 51, 102));
    withdrawButton.setBounds(399, 417, 152, 38);   
    withdrawButton.setBorder(null);
    withdrawButton.setFocusPainted(false);
    withdrawButton.setContentAreaFilled(false);
    homeFrame.getContentPane().add(withdrawButton);
    
    withdrawButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		  homeFrame.getContentPane().remove(withdrawCompleteLabel);
//      		  homeFrame.getContentPane().remove(errorTransactBalanceLabel);
//      		  homeFrame.getContentPane().remove(errorTransactNumberLabel);

      		  
      		  withdrawButton.setEnabled(false);
      		  
      		 withdrawAmountLabel= new JLabel("Enter amount");
      	      withdrawAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
      	      withdrawAmountLabel.setForeground(new Color(255, 204, 0));
      	      withdrawAmountLabel.setBounds(428, 492, 152, 25);
      	      homeFrame.getContentPane().add(withdrawAmountLabel);
      	  
      	      withdrawAmount = new JTextField();
      	      withdrawAmount.setText("");
      	      withdrawAmount.setColumns(10);
      	      withdrawAmount.setBounds(399, 527, 152, 15);
      	    withdrawAmount.setBorder(null);
            withdrawAmount.setOpaque(false);
            withdrawAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
            withdrawAmount.setForeground(new Color(255, 204, 0));
            withdrawAmount.setHorizontalAlignment(SwingConstants.CENTER);
      	      homeFrame.getContentPane().add(withdrawAmount);
      	     
      	      performWithdrawButton = new JButton("");
      	      performWithdrawButton.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\ok.png"));
      	      performWithdrawButton.setForeground(Color.BLACK);
      	 	  performWithdrawButton.setBorder(null);
      	      performWithdrawButton.setBackground(new Color(255, 204, 102));
      	      performWithdrawButton.setBounds(428, 695, 83, 83);
      	      performWithdrawButton.setFocusPainted(false);
      	      performWithdrawButton.setContentAreaFilled(false);
      	      homeFrame.getContentPane().add(performWithdrawButton);
      	      homeFrame.getContentPane().repaint();
      	      
      	      performWithdrawButton.addActionListener(new ActionListener() {
        	      	public void actionPerformed(ActionEvent arg0) {
        	      		performWithdrawButton.setEnabled(false);
       
        	      			if(a.getBalance() >= Long.parseLong(withdrawAmount.getText())) {
        	      				Database.accountList.remove(a);
        	      				a.setBalance(a.getBalance() - Long.parseLong(withdrawAmount.getText()));
        	      				Database.accountList.add(a);
        	      				Transaction t = new Transaction("Withdraw", a,Long.parseLong(withdrawAmount.getText()) , a.getBalance());
        	      				Database.transactionList.add(t);
        	      				transactHistory.append(t.toString() +"\n");
        	      			}
        	      	
    	          	      	homeFrame.getContentPane().remove(withdrawAmountLabel);
    	          	      	homeFrame.getContentPane().remove(withdrawAmount);
    		          	    withdrawCompleteLabel = new JLabel("Transaction complete");
    		          	  withdrawCompleteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    		          	withdrawCompleteLabel.setForeground(new Color(255, 204, 0));
    		            withdrawCompleteLabel.setBounds(405, 570, 193, 25);

    		          	    homeFrame.getContentPane().add(withdrawCompleteLabel);

    	          	      	withdrawButton.setEnabled(true);
    	          	      	
    	          	      	homeFrame.getContentPane().remove(performWithdrawButton);
    	          	      	
    	          			balance.setText(Long.toString(a.getBalance()));

    	          	      	homeFrame.getContentPane().repaint();
        	      		

        	      	}
        	      });  
      	}
      });
    
   
    
   
	  
    depositCompleteLabel = new JLabel("Transaction complete");
    depositCompleteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    depositCompleteLabel.setForeground(new Color(255, 204, 0));
    depositCompleteLabel.setBounds(708, 570, 193, 25);
	  homeFrame.getContentPane().add(depositCompleteLabel);
	  depositCompleteLabel.setVisible(false);
	
		
    depositButton = new JButton("Deposit");
    depositButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
    depositButton.setForeground(new Color(255, 204, 0));
    depositButton.setBackground(new Color(0, 51, 102));
    depositButton.setBounds(698, 417, 152, 38);
    depositButton.setBorder(null);
    depositButton.setFocusPainted(false);
    depositButton.setContentAreaFilled(false);
    homeFrame.getContentPane().add(depositButton);
    depositButton.addActionListener(new ActionListener() {
      

		public void actionPerformed(ActionEvent arg0) {
      		  homeFrame.getContentPane().remove(depositCompleteLabel);

      		  
      		  depositButton.setEnabled(false);
      		depositAmountLabel= new JLabel("Enter amount");
    	    depositAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
    	  depositAmountLabel.setForeground(new Color(255, 204, 0));
    	depositAmountLabel.setBounds(733, 492, 96, 25);
    	      homeFrame.getContentPane().add(depositAmountLabel);
    	  
    	    depositAmount= new JTextField();
    	  depositAmount.setText("");
    	depositAmount.setColumns(10);
    	depositAmount.setBounds(698, 527, 152, 25);
    	depositAmount.setBorder(null);
        depositAmount.setOpaque(false);
        depositAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
        depositAmount.setForeground(new Color(255, 204, 0));
        depositAmount.setHorizontalAlignment(SwingConstants.CENTER);
    	      homeFrame.getContentPane().add(depositAmount);
    	     
    	      performDepositButton = new JButton("");
    	    performDepositButton.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\ok.png"));
    	  performDepositButton.setForeground(Color.BLACK);
    	performDepositButton.setBorder(null);
    	performDepositButton.setBackground(new Color(255, 204, 102));
    	performDepositButton.setBounds(733, 695, 83, 83);
    	performDepositButton.setFocusPainted(false);
        performDepositButton.setContentAreaFilled(false);
    	      homeFrame.getContentPane().add(performDepositButton);
      		  
      	      
      	      
      	      homeFrame.getContentPane().repaint();
      	      
      	    performDepositButton.addActionListener(new ActionListener() {
        	      	public void actionPerformed(ActionEvent arg0) {
                	      		performDepositButton.setEnabled(false);
               
                	      			
                	      				Database.accountList.remove(a);
                	      				a.setBalance(a.getBalance() + Long.parseLong(depositAmount.getText()));
                	      				Database.accountList.add(a);
                	      				Transaction t = new Transaction("Deposit", a,Long.parseLong(depositAmount.getText()) , a.getBalance());
                	      				Database.transactionList.add(t);
                	      				transactHistory.append(t.toString() +"\n");
                	      			
                	      	
            	          	      	homeFrame.getContentPane().remove(depositAmountLabel);
            	          	      	homeFrame.getContentPane().remove(depositAmount);
            		          	    depositCompleteLabel = new JLabel("Transaction complete");
            		          	    depositCompleteLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
            		          	    depositCompleteLabel.setForeground(new Color(255, 204, 0));
            		          	    depositCompleteLabel.setBounds(709, 570, 193, 25);

            		          	    homeFrame.getContentPane().add(depositCompleteLabel);

            	          	      	depositButton.setEnabled(true);
            	          	      	
            	          	      	homeFrame.getContentPane().remove(performDepositButton);
            	          	      	
            	          			balance.setText(Long.toString(a.getBalance()));

            	          	      	homeFrame.getContentPane().repaint();
                	      		

                	      	}
                	      });    
      	}
      });	
    transactHistoryLabel = new JLabel("Transaction history");
    transactHistoryLabel.setForeground(new Color(255, 204, 0));
    transactHistoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
    transactHistoryLabel.setBounds(1144, 269, 227, 45);
    homeFrame.getContentPane().add(transactHistoryLabel);
    
    transactHistory = new JTextArea();
    transactHistory.setForeground(new Color(255, 204, 0));
    transactHistory.setFont(new Font("Tahoma", Font.PLAIN, 20));
    transactHistory.setBackground(new Color(0, 51, 102));
    transactHistory.setBounds(982, 309, 517, 518);
    transactHistory.setEditable(false);
    homeFrame.getContentPane().add(transactHistory);
    transactHistory.append("\n");
    tempBalance = 0;
    for(int i =0;i<Database.transactionList.size();i++) {
  	  if(Database.transactionList.get(i).getSentAccount().equals(a)) {
  		 transactHistory.append(Database.transactionList.get(i).toString() + "\n");
         tempBalance = Database.transactionList.get(i).getCurrentBalance();
  	  }else if (Database.transactionList.get(i).getReceiveAccount() != null && Database.transactionList.get(i).getReceiveAccount().equals(a) ) {
		  tempBalance += Database.transactionList.get(i).getAmount();
		  transactHistory.append("+"+ Database.transactionList.get(i).getAmount()+"EUR, balance " + tempBalance+ " EUR,transact from " + Database.transactionList.get(i).getSentAccount().getAccountNumber() + "\n");

  	  }
    }
    
    loggoutButton = new JButton("");
    loggoutButton.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\304-3041534_png-file-svg-log-out-logo-png-transparent.png"));
    loggoutButton.setBounds(1429, 10, 83, 100);
    homeFrame.getContentPane().add(loggoutButton);
    loggoutButton.setBorder(null);
    loggoutButton.setFocusPainted(false);
    loggoutButton.setOpaque(false);
    loggoutButton.setContentAreaFilled(false);
    loggoutButton.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent arg0) {
			homeFrame.dispose();
			new indexGUI();
		}
	});
    
    balance = new JLabel(Long.toString(a.getBalance()));
    balance.setFont(new Font("Tahoma", Font.PLAIN, 25));
    balance.setForeground(new Color(255, 204, 0));
    balance.setBounds(88, 276, 146, 38);
    homeFrame.getContentPane().add(balance);
    
    
    
    homeFrame.setVisible(true);

	}
	
	

}
