

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JCheckBox;


public class CreateAccountGUI extends JFrame  {
	public JFrame createAccountFrame;
	public JLabel userInformationLabel,accountLabel,fullNameLabel,dobLabel,SSNLabel,phoneLabel,addressLabel,usernameLabel,passwordLabel,emailLabel,bankLogo;
	public JTextField fullnameField,SSNField,phoneField,addressField,usernameField,emailField;    // Your class name
	public JPasswordField passwordField;
	public Choice dateChoice,monthChoice,yearChoice;
	public JButton createAccountButton;
	
	
	
	public CreateAccountGUI(){
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

      //new frame
		
      createAccountFrame = new JFrame("Deutsche Bundesbank");
      createAccountFrame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
      createAccountFrame.getContentPane().setForeground(new Color(255, 204, 0));
      createAccountFrame.getContentPane().setBackground(new Color(0, 51, 102));
      createAccountFrame .setSize(screenSize.width,screenSize.height);
      createAccountFrame .setLocation(0,0);
      createAccountFrame .setDefaultCloseOperation(EXIT_ON_CLOSE);
      createAccountFrame.getContentPane().setLayout(null);
      
      bankLogo = new JLabel("");
      bankLogo.setIcon(new ImageIcon("E:\\Download\\bundesbank.png"));
      bankLogo.setBounds(407, 10, 780, 200);
     createAccountFrame.getContentPane().add(bankLogo);
      
      // user info and account label
         
      userInformationLabel = new JLabel("User information");
      userInformationLabel.setFont(new Font("Tahoma", Font.PLAIN, 38));
      userInformationLabel.setForeground(new Color(255, 204, 0));
      userInformationLabel.setBounds(236, 244, 343, 42);
      createAccountFrame.getContentPane().add(userInformationLabel);
      
      accountLabel = new JLabel("Account");
      accountLabel.setForeground(new Color(255, 204, 0));
      accountLabel.setFont(new Font("Tahoma", Font.PLAIN, 38));
      accountLabel.setBounds(1043, 237, 198, 57);
      createAccountFrame.getContentPane().add(accountLabel);
      
      //user info field
      
      fullNameLabel = new JLabel("Full name");
      fullNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
      fullNameLabel.setForeground(new Color(255, 204, 0));
      fullNameLabel.setBounds(181, 336, 145, 34);
      createAccountFrame.getContentPane().add(fullNameLabel);
      
      fullnameField = new JTextField();
      fullnameField.setForeground(new Color(255, 204, 0));
      fullnameField.setFont(new Font("Tahoma", Font.PLAIN, 25));
      fullnameField.setBackground(new Color(0, 51, 102));
      fullnameField.setBounds(379, 336, 233, 31);
      fullnameField.setBorder(null);
      createAccountFrame.getContentPane().add(fullnameField);
     
      
      dobLabel = new JLabel("Date of birth");
      dobLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
      dobLabel.setForeground(new Color(255, 204, 0));
      dobLabel.setBounds(181, 403, 175, 37);
      createAccountFrame.getContentPane().add(dobLabel);
      
      dateChoice = new Choice();
      dateChoice.setFont(new Font("Tahoma", Font.PLAIN, 25));
      dateChoice.setBackground(new Color(0, 51, 102));
      dateChoice.setForeground(new Color(255, 204, 0));
      dateChoice.setBounds(379, 404, 53, 36);
//      dateChoice.
      createAccountFrame.getContentPane().add(dateChoice);
      for(int i =1;i<=31;i++) {
    	  dateChoice.add(Integer.toString(i));
      }
      
      monthChoice = new Choice();
      monthChoice.setFont(new Font("Tahoma", Font.PLAIN, 25));
      monthChoice.setForeground(new Color(255, 204, 0));
      monthChoice.setBackground(new Color(0, 51, 102));
      monthChoice.setBounds(459, 404, 53, 36);
      createAccountFrame.getContentPane().add(monthChoice);
      for(int i =1;i<= 12;i++) {
    	  monthChoice.add(Integer.toString(i));
      }
      
      yearChoice = new Choice();
      yearChoice.setFont(new Font("Tahoma", Font.PLAIN, 25));
      yearChoice.setBackground(new Color(0, 51, 102));
      yearChoice.setForeground(new Color(255, 204, 0));
      yearChoice.setBounds(546, 404, 91, 36);
      createAccountFrame.getContentPane().add(yearChoice);
      for(int i =1938;i<=2002;i++) {
    	  yearChoice.add(Integer.toString(i));
      }
      
      SSNLabel = new JLabel("SSN");
      SSNLabel.setForeground(new Color(255, 204, 0));
      SSNLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
      SSNLabel.setBounds(181, 471, 145, 42);
      createAccountFrame.getContentPane().add(SSNLabel);
      
      SSNField = new JTextField();
      SSNField.setFont(new Font("Tahoma", Font.PLAIN, 25));
      SSNField.setForeground(new Color(255, 204, 0));
      SSNField.setBackground(new Color(0, 51, 102));
      SSNField.setBounds(379, 477, 233, 31);
      SSNField.setBorder(null);
      createAccountFrame.getContentPane().add(SSNField);
      
      phoneLabel = new JLabel("Phone number");
      phoneLabel.setForeground(new Color(255, 204, 0));
      phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
      phoneLabel.setBounds(181, 541, 181, 42);
      createAccountFrame.getContentPane().add(phoneLabel);
      
      phoneField = new JTextField();
      phoneField.setFont(new Font("Tahoma", Font.PLAIN, 25));
      phoneField.setForeground(new Color(255, 204, 0));
      phoneField.setBackground(new Color(0, 51, 102));
      phoneField.setBounds(379, 547, 233, 31);
      phoneField.setBorder(null);
      createAccountFrame.getContentPane().add(phoneField);
      
      addressLabel = new JLabel("Address");
      addressLabel.setForeground(new Color(255, 204, 0));
      addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
      addressLabel.setBackground(new Color(255, 204, 0));
      addressLabel.setBounds(181, 613, 146, 42);
      createAccountFrame.getContentPane().add(addressLabel);
      
      addressField = new JTextField();
      addressField.setFont(new Font("Tahoma", Font.PLAIN, 25));
      addressField.setForeground(new Color(255, 204, 0));
      addressField.setBackground(new Color(0, 51, 102));
      addressField.setBounds(379, 619, 233, 31);
      addressField.setBorder(null);
      createAccountFrame.getContentPane().add(addressField);
      
      usernameLabel = new JLabel("Username");
      usernameLabel.setForeground(new Color(255, 204, 0));
      usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
      usernameLabel.setBounds(915, 400, 118, 42);
      createAccountFrame.getContentPane().add(usernameLabel);
      
      usernameField = new JTextField();
      usernameField.setFont(new Font("Tahoma", Font.PLAIN, 25));
      usernameField.setForeground(new Color(255, 204, 0));
      usernameField.setBackground(new Color(0, 51, 102));
      usernameField.setBounds(1098, 343, 233, 34);
      usernameField.setBorder(null);
      createAccountFrame.getContentPane().add(usernameField);
      
      passwordLabel = new JLabel("Password");
      passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
      passwordLabel.setForeground(new Color(255, 204, 0));
      passwordLabel.setBounds(915, 337, 118, 40);
      createAccountFrame.getContentPane().add(passwordLabel);
      
      passwordField = new JPasswordField();
      passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
      passwordField.setForeground(new Color(255, 204, 0));
      passwordField.setBackground(new Color(0, 51, 102));
      passwordField.setBounds(1098, 404, 233, 34);
      passwordField.setBorder(null);
      createAccountFrame.getContentPane().add(passwordField);
      
      emailLabel = new JLabel("Email");
      emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
      emailLabel.setForeground(new Color(255, 204, 0));
      emailLabel.setBounds(181, 688, 118, 37);
      createAccountFrame.getContentPane().add(emailLabel);
      
      emailField = new JTextField();
      emailField.setFont(new Font("Tahoma", Font.PLAIN, 25));
      emailField.setForeground(new Color(255, 204, 0));
      emailField.setBackground(new Color(0, 51, 102));
      emailField.setBounds(377, 691, 340, 31);
      emailField.setBorder(null);
      createAccountFrame.getContentPane().add(emailField);
      
      createAccountButton = new JButton("Create account");
      createAccountButton.setFont(new Font("Tahoma", Font.PLAIN, 38));
      createAccountButton.setBackground(new Color(0, 51, 102));
      createAccountButton.setForeground(new Color(255, 204, 0));
      createAccountButton.setBounds(915, 569, 416, 57);
      createAccountButton.setOpaque(false);
	  createAccountButton.setContentAreaFilled(false);
	  createAccountButton.setBorder(null);
	  createAccountButton.setFocusPainted(false);
      createAccountFrame.getContentPane().add(createAccountButton);
      createAccountButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			String fullName = fullnameField.getText();
			String SSN = SSNField.getText();
			String phoneNumber = phoneField.getText();
			String address = addressField.getText();
			String email = emailField.getText();
			String username = usernameField.getText();
			String password = String.valueOf(passwordField.getPassword());
			@SuppressWarnings("deprecation")
			Date dateOfBirth = new Date(Integer.parseInt(yearChoice.getSelectedItem()), Integer.parseInt(monthChoice.getSelectedItem()), Integer.parseInt(dateChoice.getSelectedItem()));
			String dob = dateChoice.getSelectedItem() +"/"+ monthChoice.getSelectedItem() +"/" + yearChoice.getSelectedItem();
			Account a = new Account(username, password, fullName, SSN, dateOfBirth, email, phoneNumber);
			Database.accountList.add(a);
			System.out.println(a.getUsername() + " " +a.getAccountNumber());
			createAccountFrame.dispose();
			new indexGUI();
		}
	});
      createAccountFrame.setVisible(true);
      
     
	}
	
//	public static void main(String[] args) {
//		new CreateAccountGUI();
//	}
}

