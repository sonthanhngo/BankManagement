




import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;


public class indexGUI extends JFrame  {
	public JFrame indexFrame;
	public JTextField textField,usernameField;
	public JButton loginButton,resetButton,createButton,quitButton,letsgoButton;
	public JLabel usernameLabel,passwordLabel,ecbLabel,backgroundImg,bankLogo;
	public JPasswordField passwordField;
	
	
	public indexGUI(){
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    //frame
		indexFrame = new JFrame("Deutsche Bundesbank");
	    indexFrame.getContentPane().setBackground(new Color(0, 0, 102));
	    indexFrame.setSize(screenSize.width,screenSize.height);
	    indexFrame.setLocation(0,0);
	    indexFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    indexFrame.getContentPane().setLayout(null);
      
	    backgroundImg = new JLabel("") ;
	    backgroundImg.setFont(new Font("Tahoma", Font.PLAIN, 25));
        backgroundImg.setForeground(new Color(0, 0, 128));
        backgroundImg.setIcon(new ImageIcon(new ImageIcon("C:\\\\Users\\\\admin\\\\Desktop\\\\PIC.jpg").getImage().getScaledInstance(1522, 827, Image.SCALE_DEFAULT)));
        backgroundImg.setBounds(0, 10, 1522, 827);
        indexFrame.getContentPane().add(backgroundImg);
      
        bankLogo = new JLabel("");
        bankLogo.setIcon(new ImageIcon("E:\\Download\\bundesbank.png"));
        bankLogo.setBounds(130, 30, 780, 200);
        backgroundImg.add(bankLogo);
     
      

	    loginButton = new JButton("");
	    loginButton.setFont(new Font("Tahoma", Font.PLAIN, 38));
	    loginButton.setForeground(Color.BLACK);
	    loginButton.setBounds(85, 90, 277, 100);
	    loginButton.setBorder(null);
	    loginButton.setFocusPainted(false);
	    loginButton.setOpaque(false);
	    loginButton.setContentAreaFilled(false);
	    backgroundImg.add(loginButton);
	    loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				usernameField = new JTextField();
			      usernameField.setFont(new Font("Tahoma", Font.PLAIN, 25));
			      usernameField.setBounds(150, 298, 150, 55);
			      usernameField.setOpaque(false);
			      usernameField.setBorder(null);
			      usernameField.setForeground(new Color(255, 204, 0));
			      backgroundImg.add(usernameField);
//			      backgroundImg.add(usernameField);
			      usernameField.setColumns(10);
			      
			     

//			      backgroundImg.add(letsgoButton);
			      
			      passwordField = new JPasswordField();
			      passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
			      backgroundImg.add(passwordField);
			      passwordField.setColumns(10);
			      passwordField.setBorder(null);
			      passwordField.setOpaque(false);
			      passwordField.setForeground(new Color(255, 204, 0));
			      passwordField.setBounds(150, 374, 150, 55);
			     
			      usernameLabel = new JLabel("Username");
			      backgroundImg.add(usernameLabel);	
			      usernameLabel.setForeground(Color.BLACK);
			      usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			      usernameLabel.setBounds(0, 298, 142, 55);
			      
			      passwordLabel = new JLabel("Password");
			      backgroundImg.add(passwordLabel);
			      passwordLabel.setForeground(Color.BLACK);
			      passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			      passwordLabel.setBounds(0, 374, 150, 55);
			                              
			                              
			      letsgoButton = new JButton("Proceed");
			      letsgoButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
			      letsgoButton.setForeground(Color.BLACK);
			      letsgoButton.setFocusPainted(false);
			      letsgoButton.setBorder(null);
			      letsgoButton.setBackground(new Color(255, 204, 102));
				  letsgoButton.setOpaque(false);
				  letsgoButton.setContentAreaFilled(false);
			      letsgoButton.setBounds(350, 327, 194, 62);
			      backgroundImg.add(letsgoButton);
			      indexFrame.getContentPane().repaint();

			      letsgoButton.addActionListener(new ActionListener() {
					
					private boolean found;

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String username = usernameField.getText();
						String password = String.valueOf(passwordField.getPassword());
						
						for(Account a: Database.accountList) {
							if (a.getUsername().equals(username) && a.getPassword().equals(password)) {
							    indexFrame.dispose();
								found = true;    
							    new homeGUI(a);
							}
						}
						
						if(found != true) {
							System.out.println("Not found account");
						}
						
					}
				});
			      
				
			}
		});
	      
	      
	                                    
	   
      createButton = new JButton("");
      backgroundImg.add(createButton);
      createButton.setFont(new Font("Tahoma", Font.PLAIN, 38));
      createButton.setIcon(new ImageIcon("E:\\Download\\imageedit_1_9004837837.png"));
      createButton.setBackground(new Color(255, 204, 102));
      createButton.setForeground(new Color(0, 0, 0));
      createButton.setBounds(1117, 60, 236, 110);
      createButton.setBorder(null);
      createButton.setOpaque(false);
      createButton.setContentAreaFilled(false);
      createButton.setFocusPainted(false);
      createButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			indexFrame.dispose();
			new CreateAccountGUI();
			
		}
	});
      quitButton = new JButton("");
      backgroundImg.add(quitButton);
      quitButton.setFont(new Font("Tahoma", Font.PLAIN, 38));
      quitButton.setIcon(null);
      quitButton.setForeground(Color.BLACK);
      quitButton.setBorder(null);
      quitButton.setOpaque(false);
      quitButton.setBackground(new Color(255, 204, 102));
      quitButton.setBounds(1390, 700, 152, 100);
      quitButton.setFocusPainted(false);
      quitButton.setContentAreaFilled(false);
      quitButton.addActionListener(new ActionListener() {
  		
@Override
		public void actionPerformed(ActionEvent arg0) {
			indexFrame.dispose();
			
		}
		});

	indexFrame.setVisible(true);
	}
  
   
}

