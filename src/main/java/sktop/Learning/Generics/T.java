package sktop.Learning.Generics;

import java.util.Scanner;

class BankAccount<T>{
    T t1;
    double bal;
     double depositAmount;
    Scanner input = new Scanner(System.in);
    
    BankAccount(T t1, double bal) {
        this.t1 = t1;
        this.bal= bal;
    }

    BankAccount(T t1){
        this(t1, 1000);
    }
    public T getT1() {
        return this.t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public double getBal() {
        return this.bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public <T> void  deposit(){
        System.out.println("Would you like to deposit?");
        int choice;
       
        do {
            System.out.print("Yes [1] or No [2]: ");
            choice = input.nextInt();
            
        
        if (choice == 1){
            System.out.println("Enter amount to deposit");
            depositAmount = input.nextDouble();
            System.out.println("You have successfully deposited "+ depositAmount);
        }else if (choice == 2){
            System.out.println("You chose not to deposit");
        }
        else{
            System.out.println("You chose "+choice + ", selcet [1] Yes or [2] No");
        }
    }while (choice !=1 && choice != 2);
        System.out.println("Thank you for using our services");
        bal += depositAmount;
        System.out.println("=== Your current balance is: "+ (bal)+" === ");
    }

    public <T> void withdraw(){
        System.out.println("Your have $"+ bal+ " in your account");
        System.out.println("How much would you like to withdraw? ");
        double withdrawAmount = input.nextDouble();
        do{
            if(withdrawAmount > bal){
                System.out.println("Your withdrawal can't exceed your balance amount: $"+bal);
            }
            else{
                System.out.println("$" +withdrawAmount +" has been successfully withdrawn");
                bal -= withdrawAmount;
                System.out.println("Your balance is now: $"+bal);
            }
        }while(withdrawAmount > bal);

    }


    public void display(){
        System.out.println("Your "+ t1.toString()+ " account has: $" + getBal());
    }

}
