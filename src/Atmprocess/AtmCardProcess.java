package Atmprocess;

import java.util.Scanner;

public class AtmCardProcess {

	public static void main(String[] args) {
		int pin = 1234;
        int balance = 100000;
        int credit = 0;
        int debit = 0;
        String name;
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("Enter Your Pin Number");
            int password = scanner.nextInt();
            
            if (password == pin) {
                loggedIn = true;
                System.out.println("Enter Your Name ");
                name = scanner.next();
                System.out.println("Welcome " + name);

                while (true) {
                	System.out.println("");
                    System.out.println("Press 1 to Check Your Balance");
                    System.out.println("Press 2 Credit Your Amount");
                    System.out.println("Press 3 Debit Your Amount");
                    System.out.println("Press 4 Take Receipt");
                    System.out.println("Press 5 To Exit");

                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Your Current Balance is " + balance);
                            break;
                        case 2:
                            System.out.println("How Much Amount to Add to Your Account?");
                            credit = scanner.nextInt();
                            System.out.println("Successfully Credited");
                            balance = credit + balance;
                            break;
                        case 3:
                            System.out.println("How Much Amount Do You Want To Debit?");
                            debit = scanner.nextInt();
                            if (debit > balance) {
                                System.out.println("Your Balance is Insufficient ");
                                System.out.println("Try Less Than Your Available Balance");
                            } else {
                                System.out.println("Successfully Taken " + debit);
                                balance = balance - debit;
                            }
                            break;
                        case 4:
                            System.out.println("Welcome To ABC mini Atm");
                            System.out.println("Available Balance is " + balance);
                            System.out.println("Amount Deposited " + credit);
                            System.out.println("Amount Credited " + debit);
                            System.out.println("Thanks For Coming ");
                            break;
                        case 5:
                            System.out.println("Thank You");
                            return;
                        default:
                            System.out.println("Press a Number Between 1 and 5");
                            break;
                    }
                }
            } else {
                System.out.println("Wrong Pin Number. Please try again.");
            }
        }
    }
	}


