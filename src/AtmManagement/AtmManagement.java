package AtmManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AtmManagement {
	     static int pinnumber = 1234;
         static long balanceamount = 10000;
         static long withdetawamount = 0 ;
	     static long creditamount = 0;
	     static long creditAmountTotal = 0;
	     static long debitAmountTotal = 0;
	     
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1350, 750);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
		JLabel welcomelabel = new JLabel("Welcome To Mini ATM");
		welcomelabel.setBounds(580, 10, 200, 30);
		panel.add(welcomelabel);
		
		JTextField number = new JTextField();
		number.setBounds(520, 50, 250, 40);
		number.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c))) {
                    e.consume(); 
                }
            }
        });
		panel.add(number);
		
	    JButton b1 = new JButton("1");
        b1.setBounds(310, 155, 80, 40);
        panel.add(b1);
		
	    JButton b2 = new JButton("2");
        b2.setBounds(310, 215, 80, 40);
        panel.add(b2);
        
        JButton b3 = new JButton("3");
        b3.setBounds(310, 275, 80, 40);
        panel.add(b3);
       
	    JButton b4 = new JButton("4");
        b4.setBounds(910, 155, 80, 40);
        panel.add(b4);
		
	    JButton b5 = new JButton("5");
        b5.setBounds(910, 215, 80, 40);
        panel.add(b5);
        
        JButton b6 = new JButton("6");
        b6.setBounds(910, 275, 80, 40);
        panel.add(b6);
	    
        JPanel pinenterpanel = new JPanel(null);
        pinenterpanel.setBorder(BorderFactory.createEmptyBorder(50, 200, 50, 200));
        pinenterpanel.setBackground(Color.BLUE);
        pinenterpanel.setBounds(400, 120, 500, 230);
	    panel.add(pinenterpanel);
	   
		JButton pinvalue = new JButton("Enter Your Pin Number");
		pinvalue.setBounds(140, 80, 200, 50);
		pinenterpanel.add(pinvalue);
		
        
		JPanel buttonpanel = new JPanel(null);
	    buttonpanel.setBorder(BorderFactory.createEmptyBorder(50, 200, 50, 200));
	    buttonpanel.setBackground(Color.BLUE);
	    buttonpanel.setBounds(400, 120, 500, 230);
	    panel.add(buttonpanel);
	   
		JButton withdraw = new JButton("Withdraw");
		withdraw.setBounds(10, 30, 200, 50);
		buttonpanel.add(withdraw);
		
		JButton credit = new JButton("Credit");
		credit.setBounds(10, 90, 200, 50);
		buttonpanel.add(credit);
		

		JButton pin = new JButton("Change Pin");
		pin.setBounds(10, 150, 200, 50);
		buttonpanel.add(pin);
		
		JButton balance = new JButton("Balance Enquiary");
		balance.setBounds(280, 30, 200, 50);
		buttonpanel.add(balance);
		
		JButton receipt = new JButton("Mini Statement");
		receipt.setBounds(280, 90, 200, 50);
		buttonpanel.add(receipt);
		
		
		JButton exit = new JButton("Exit");
		exit.setBounds(280 , 150, 200, 50);
		buttonpanel.add(exit);
		
		JPanel pinpanel = new JPanel(null);
		pinpanel.setBorder(BorderFactory.createEmptyBorder(50, 200, 50, 200));
		pinpanel.setBackground(Color.DARK_GRAY);
		pinpanel.setBounds(480, 370, 330, 250);
	    panel.add(pinpanel);
	    
	    JButton p1 = new JButton("1");
	    p1.setBounds(10, 10, 50, 50);
	    pinpanel.add(p1);
	    
	    JButton p2 = new JButton("2");
	    p2.setBounds(70, 10, 50, 50);
	    pinpanel.add(p2);
	    
	    JButton p3 = new JButton("3");
	    p3.setBounds(130, 10, 50, 50);
	    pinpanel.add(p3);
	    
	    JButton cancel = new JButton("CANCEL");
	    cancel.setBounds(190, 10, 130, 50);
	    Color lightRed = new Color(255 ,51 , 51);
	    cancel.setBackground(lightRed);
	    pinpanel.add(cancel);
	    
	    JButton p4 = new JButton("4");
	    p4.setBounds(10, 70, 50, 50);
	    pinpanel.add(p4);
	    
	    JButton p5 = new JButton("5");
	    p5.setBounds(70, 70, 50, 50);
	    pinpanel.add(p5);
	    
	    JButton p6 = new JButton("6");
	    p6.setBounds(130, 70, 50, 50);
	    pinpanel.add(p6);
	    
	    JButton clear = new JButton("CLEAR");
	    clear.setBounds(190, 70, 130, 50);
	    clear.setBackground(Color.YELLOW);
	    pinpanel.add(clear);
	    
	    JButton p7 = new JButton("7");
	    p7.setBounds(10, 130, 50, 50);
	    pinpanel.add(p7);
	    
	    
	    JButton p8 = new JButton("8");
	    p8.setBounds(70, 130, 50, 50);
	    pinpanel.add(p8);
	    
	    JButton p9 = new JButton("9");
	    p9.setBounds(130, 130, 50, 50);
	    pinpanel.add(p9);
	    
	    JButton enter = new JButton("Enter");
	    enter.setBounds(190, 130, 130, 50);
	    enter.setBackground(Color.GREEN);
	    pinpanel.add(enter);
	    
	    JButton p = new JButton("*");
	    p.setBounds(10, 190, 50, 50);
	    pinpanel.add(p);
	    
	    JButton p0 = new JButton("0");
	    p0.setBounds(70, 190, 50, 50);
	    pinpanel.add(p0);
	    
	    JButton p10 = new JButton("#");
	    p10.setBounds(130, 190, 50, 50);
	    pinpanel.add(p10);
		
	    JButton c = new JButton("");
	    c.setBounds(190, 190, 130, 50);
	    pinpanel.add(c);
	   
        JButton pinbutton [] = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p0};
        number.setHorizontalAlignment(JTextField.CENTER);
        for (JButton pinButtons : pinbutton) {
            pinButtons.addActionListener(e -> {
                JButton button = (JButton) e.getSource();
                String buttonText = button.getText();
                number.setText(number.getText() + buttonText);
                number.requestFocusInWindow();
            });
        }
        
        clear.addActionListener(action -> number.setText(""));
        
        cancel.addActionListener(action -> {
            String currentText = number.getText();
            if (!currentText.isEmpty()) {
                String updatedText = currentText.substring(0, currentText.length() - 1);
                number.setText(updatedText);
            }
        });
        
        
        JPanel processpanel = new JPanel(null);
        processpanel.setBorder(BorderFactory.createEmptyBorder(50, 200, 50, 200));
        processpanel.setBackground(Color.BLUE);
        processpanel.setBounds(400, 120, 500, 230);
	    panel.add(processpanel);
	    
        b1.addActionListener(action -> {
        	  processpanel.removeAll(); 
        	if(!pinenterpanel.isVisible()) {
        		JLabel withdrawlabel = new JLabel("How Much Amount You Want To Withdraw");
        		withdrawlabel.setBounds(90, 20, 400, 50);
        		withdrawlabel.setForeground(Color.WHITE);
        		withdrawlabel.setFont(new Font("Arial", Font.BOLD, 16));
                processpanel.add(withdrawlabel);
                JTextField withdetawamount = new JTextField();
                withdetawamount.setBounds(120, 80, 250, 50);
                withdetawamount.setHorizontalAlignment(withdetawamount.CENTER);
                withdetawamount.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent action) {
                        char c = action.getKeyChar();
                        if (!(Character.isDigit(c))) {
                        	action.consume(); 
                        }
                    }
                });
                processpanel.add(withdetawamount);
                JButton withdrawbutton = new JButton("Submit");
                withdrawbutton.setBounds(150, 150, 200, 50);
                processpanel.add(withdrawbutton);
                processpanel.setVisible(true);
                pinenterpanel.setVisible(false);
                buttonpanel.setVisible(false);
                processpanel.revalidate(); 
                processpanel.repaint();  
                

                withdrawbutton.addActionListener(actions -> {
                	String withdrawal = withdetawamount.getText();
                	processpanel.removeAll(); 
                	 if (!withdrawal.isEmpty()) {
                		 int withdrawalAmount = Integer.parseInt(withdrawal);
                		 if (withdrawalAmount <= balanceamount) {
                			   balanceamount -= withdrawalAmount;
                			   debitAmountTotal += withdrawalAmount;
                			   JLabel balanceLabel = new JLabel("Withdraw Successfully  " + withdrawal);
                               balanceLabel.setBounds(30, 80, 400, 50);
                               balanceLabel.setForeground(Color.WHITE);
                               balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
                               balanceLabel.setVerticalAlignment(SwingConstants.CENTER);
                               balanceLabel.setFont(new Font("Arial", Font.BOLD, 16));
                               processpanel.add(balanceLabel);
                               processpanel.setVisible(true);
                               processpanel.revalidate(); 
                               processpanel.repaint();  
                		 }
                		 else {
                			 processpanel.removeAll(); 
                			 JLabel balanceLabel = new JLabel("Insuffient Balance. Enter Your Available Balance");
                             balanceLabel.setBounds(40, 80, 400, 50);
                             balanceLabel.setForeground(Color.WHITE);
                             balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
                             balanceLabel.setVerticalAlignment(SwingConstants.CENTER);
                             balanceLabel.setFont(new Font("Arial", Font.BOLD, 16));
                             processpanel.add(balanceLabel);
                             JButton back = new JButton("Back");
                             back.setBounds(350, 170, 100, 40);
                             processpanel.add(back);
                             processpanel.setVisible(true);
                             processpanel.revalidate(); 
                             processpanel.repaint();  
                             
                             back.addActionListener(backAction -> {
                            	    processpanel.removeAll();
                            	    b1.doClick();
                            	});
                		 }
                	 }
                	 else {
                		    JOptionPane.showMessageDialog(frame, "Please enter a withdrawal amount.");
                	 }
                  
                });
        	}
        	else {
        		  JOptionPane.showMessageDialog(frame, "Please enter the PIN first.");
        	}
        });
        
        b2.addActionListener(action -> {
        	  processpanel.removeAll(); 
        	if(!pinenterpanel.isVisible()) {
        		JLabel creditlabel = new JLabel("How Much Amount You Want To Credit");
        		creditlabel.setBounds(90, 20, 400, 50);
        		creditlabel.setForeground(Color.WHITE);
        		creditlabel.setFont(new Font("Arial", Font.BOLD, 16));
                processpanel.add(creditlabel);
                JTextField creditamount = new JTextField();
                creditamount.setBounds(120, 80, 250, 50);
                creditamount.setHorizontalAlignment(creditamount.CENTER);
                creditamount.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent action) {
                        char c = action.getKeyChar();
                        if (!(Character.isDigit(c))) {
                        	action.consume(); 
                        }
                    }
                });
                processpanel.add(creditamount);
                JButton creditbutton = new JButton("Submit");
                creditbutton.setBounds(150, 150, 200, 50);
                processpanel.add(creditbutton);
                processpanel.setVisible(true);
                pinenterpanel.setVisible(false);
                buttonpanel.setVisible(false);
                processpanel.revalidate(); 
                processpanel.repaint(); 
                
                creditbutton.addActionListener(actions -> {
                	processpanel.removeAll(); 
                	String credited = creditamount.getText();
                	 if (!credited.isEmpty()) {
                         int creditedAmount = Integer.parseInt(credited);
                         balanceamount += creditedAmount;
                         creditAmountTotal += creditedAmount;
                    JLabel creditamountlabel = new JLabel("Successfully Credited  " + credited);
                    creditamountlabel.setBounds(30, 80, 400, 50);
                    creditamountlabel.setForeground(Color.WHITE);
                    creditamountlabel.setHorizontalAlignment(SwingConstants.CENTER);
                    creditamountlabel.setVerticalAlignment(SwingConstants.CENTER);
                    creditamountlabel.setFont(new Font("Arial", Font.BOLD, 16));
                    processpanel.add(creditamountlabel);
                    processpanel.setVisible(true);
                    processpanel.revalidate(); 
                    processpanel.repaint();  
                	 }
                });
        	}
        	 else {
                 JOptionPane.showMessageDialog(frame, "Please enter the PIN first.");
             }
        });
        
        
        b3.addActionListener(action -> {
        	  processpanel.removeAll(); 
        	if(!pinenterpanel.isVisible()) {
        		JLabel pinlabel1 = new JLabel("Enter Your Old Pin");
        		pinlabel1.setBounds(160, 5, 400, 50);
        		pinlabel1.setForeground(Color.WHITE);
        		pinlabel1.setFont(new Font("Arial", Font.BOLD, 16));
                processpanel.add(pinlabel1);
                JTextField pintext1 = new JTextField();
                pintext1.setBounds(120, 45, 250, 40);
                pintext1.setHorizontalAlignment(pintext1.CENTER);
                pintext1.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent action) {
                        char c = action.getKeyChar();
                        if (!(Character.isDigit(c))) {
                        	action.consume(); 
                        }
                    }
                });
                processpanel.add(pintext1);
        		JLabel pinlabel2 = new JLabel("Enter Your New Pin");
        		pinlabel2.setBounds(160, 75, 400, 50);
        		pinlabel2.setForeground(Color.WHITE);
        		pinlabel2.setFont(new Font("Arial", Font.BOLD, 16));
                processpanel.add(pinlabel2);
                JTextField pintext2 = new JTextField();
                pintext2.setBounds(120, 120, 250, 40);
                pintext2.setHorizontalAlignment(pintext2.CENTER);
                pintext2.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent action) {
                        char c = action.getKeyChar();
                        if (!(Character.isDigit(c))) {
                        	action.consume(); 
                        }
                    }
                });
                processpanel.add(pintext2);
                JButton Pinbutton = new JButton("Submit");
                Pinbutton.setBounds(150, 170, 200, 50);
                processpanel.add(Pinbutton);
                processpanel.setVisible(true);
                pinenterpanel.setVisible(false);
                buttonpanel.setVisible(false);
                processpanel.revalidate(); 
                processpanel.repaint(); 
                
                Pinbutton.addActionListener(actions -> {
                    String oldpin = pintext1.getText();
                    String newpin = pintext2.getText();
                    processpanel.removeAll();
                    if (!oldpin.isEmpty() && !newpin.isEmpty()) {
                        if (oldpin.equals(String.valueOf(pinnumber))) {
                            if (!newpin.equals(String.valueOf(pinnumber))) {
                            	 pinnumber = Integer.parseInt(newpin);
                                JLabel pinlabel = new JLabel("Pin Changed Successfully " + newpin);
                                pinlabel.setBounds(30, 80, 400, 50);
                                pinlabel.setForeground(Color.WHITE);
                                pinlabel.setHorizontalAlignment(SwingConstants.CENTER);
                                pinlabel.setVerticalAlignment(SwingConstants.CENTER);
                                pinlabel.setFont(new Font("Arial", Font.BOLD, 16));
                                processpanel.add(pinlabel);
                                processpanel.setVisible(true); 
                                processpanel.revalidate();
                                processpanel.repaint();
                            } else {
                                JOptionPane.showMessageDialog(frame, "Already Exists. Enter a Valid Pin Number");
                                processpanel.setVisible(false); 
                                buttonpanel.setVisible(true);
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "Enter The Correct Pin Number");
                            processpanel.setVisible(false); 
                            buttonpanel.setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please Enter Both Old and New PINs");
                        processpanel.setVisible(false); 
                        buttonpanel.setVisible(true);
                    }
                });
        	}
        	 else {
                 JOptionPane.showMessageDialog(frame, "Please enter the PIN first.");
                 
             }
        });

        b4.addActionListener(action -> {
        	processpanel.removeAll();
            if (!pinenterpanel.isVisible()) { 
            	long totalbalance = balanceamount + creditamount - withdetawamount; 
                JLabel balanceLabel = new JLabel("Balance Amount : " + totalbalance);
                balanceLabel.setBounds(50, 80, 400, 50);
                balanceLabel.setForeground(Color.WHITE);
                balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
                balanceLabel.setVerticalAlignment(SwingConstants.CENTER);
                balanceLabel.setFont(new Font("Arial", Font.BOLD, 16));
                processpanel.add(balanceLabel);
                processpanel.setVisible(true);
                pinenterpanel.setVisible(false);
                buttonpanel.setVisible(false);
                processpanel.revalidate(); 
                processpanel.repaint(); 
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter the PIN first.");
            }
        });

        b5.addActionListener(action -> {
        	  processpanel.removeAll(); 
        	if(!pinenterpanel.isVisible()) {
        		long totalBalance = balanceamount + creditamount;
        		JLabel statementlabel1 = new JLabel("Your Current Balance is : " + totalBalance);
        		statementlabel1.setBounds(20, 40, 400, 40);
        		statementlabel1.setForeground(Color.WHITE);
        		statementlabel1.setFont(new Font("Arial", Font.BOLD, 16));
        		statementlabel1.setHorizontalAlignment(SwingConstants.CENTER);
        		statementlabel1.setVerticalAlignment(SwingConstants.CENTER);
        		processpanel.add(statementlabel1);
        		JLabel statementlabel2 = new JLabel("Your Credit Amount is : "  + creditAmountTotal);
        		statementlabel2.setBounds(20, 90, 400, 40);
        		statementlabel2.setForeground(Color.WHITE);
        		statementlabel2.setFont(new Font("Arial", Font.BOLD, 16));
        		statementlabel2.setHorizontalAlignment(SwingConstants.CENTER);
        		statementlabel2.setVerticalAlignment(SwingConstants.CENTER);
        		processpanel.add(statementlabel2);
        		JLabel statementlabel3 = new JLabel("Your Debit Amount is : "  + debitAmountTotal);
        		statementlabel3.setBounds(20, 140, 400, 40);
        		statementlabel3.setForeground(Color.WHITE);
        		statementlabel3.setFont(new Font("Arial", Font.BOLD, 16));
        		statementlabel3.setHorizontalAlignment(SwingConstants.CENTER);
        		statementlabel3.setVerticalAlignment(SwingConstants.CENTER);
        		processpanel.add(statementlabel3);
        	    processpanel.setVisible(true);
                pinenterpanel.setVisible(false);
                buttonpanel.setVisible(false);
                processpanel.revalidate(); 
                processpanel.repaint(); 
        	}
        	 else {
                 JOptionPane.showMessageDialog(frame, "Please enter the PIN first.");
             }
        });

        b6.addActionListener(action -> {
        	processpanel.removeAll();
            if (!pinenterpanel.isVisible()) { 
                JLabel exitlabel = new JLabel("THANK YOU FOR COMMING MINI ATM");
                exitlabel.setBounds(30, 80, 400, 50);
                exitlabel.setForeground(Color.WHITE);
                exitlabel.setHorizontalAlignment(SwingConstants.CENTER);
                exitlabel.setVerticalAlignment(SwingConstants.CENTER);
                exitlabel.setFont(new Font("Arial", Font.BOLD, 16));
                processpanel.add(exitlabel);
                processpanel.setVisible(true);
                pinenterpanel.setVisible(false);
                buttonpanel.setVisible(false);
                processpanel.revalidate(); 
                processpanel.repaint(); 
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter the PIN first.");
            }
        });

        
        enter.addActionListener(action -> {
        	String enterpin = number.getText();
        	 if (enterpin.equals(String.valueOf(pinnumber))) {
        		 processpanel.removeAll();
        		pinenterpanel.setVisible(false);
        		buttonpanel.setVisible(true);
        	    number.setText("");
        	}
        	else {
        		 number.setText("");
        		JOptionPane.showMessageDialog(buttonpanel, "Wrong Pin Number. Enter Correct Pin Number");
        	}
        });
        
        
        pinenterpanel.setVisible(true);
        buttonpanel.setVisible(false);
        processpanel.setVisible(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
