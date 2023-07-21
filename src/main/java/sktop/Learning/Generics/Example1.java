package sktop.Learning.Generics;

import java.util.Scanner;

public class Example1 {
	static public void main(String[] args) {
        BankAccount <String>  b1 = new BankAccount("Savings");
        Scanner input = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("==== Welcome to our Bank System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Cancel");
            System.out.println();
            System.out.print("Please enter a choice: ");
             choice = input.nextInt();

             

        }while(choice > 4 && choice < 1);

        switch(choice){
                case 1:
                b1.deposit();
                break;
                case 2:
                b1. withdraw();
                break;
                case 3: 
                b1.display();
                break;
                case 4:
                System.out.println("Good Bye!");
             }
    }
}
