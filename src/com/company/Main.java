package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    private static int balance = 0;
    private static int anotherTransaction;
    private static float Transfer;
    private static int Exit;
    private static float Deposit;
    private static int AccountNumber;
    private static int pin;



    public static void main(String args[]){
        in = new Scanner(System.in);

        transaction();
    }

    private static void transaction(){
      System.out.println("welcome uboho stephen");
      in.nextInt();
        System.out.println("Pls enter your pin");
        int pin = in.nextInt();
        if (pin == 0);
        else
            System.out.println("Wrong Pin!!!");



        System.out.println("Enter AccountNumber");
        in.nextInt();

        int choice;

        System.out.println("Please select an option");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");

        choice = in.nextInt();

        switch(choice){
            case 1:
                int amount = 0;
                System.out.println("Please enter amount to withdraw: ");
                amount = (int) in.nextFloat();
                if(amount > balance || amount == 0){
                    System.out.println("You have insufficient funds\n\n");
                    anotherTransaction();
                } else {

                    balance = balance - amount;
                    System.out.println("You have withdrawn "+amount+" and your new balance is "+balance+"\n");
                    anotherTransaction();
                }
                break;

            case 2:

                int deposit;
                System.out.println("Please enter amount you would wish to deposit: ");
                deposit = (int) in.nextFloat();
                balance = deposit + balance;
                System.out.println("You have deposited "+deposit+" new balance is "+balance+"\n");
                anotherTransaction();
                break;

            case 3:
                System.out.println("Your balance is "+balance+"\n");
                anotherTransaction();
                break;

            case 4:
                amount = 0;
                System.out.println("Enter the AccountNumber you wish to transfer funds to: ");
                AccountNumber = (int) in.nextFloat();
                System.out.println("Enter amount you wish to transfer");
                amount = (int) in.nextFloat();
                if (balance < amount || amount == 0) {
                    System.out.println("You have insufficient funds\n\n");
                    anotherTransaction();
                } else {

                    Transfer = (int) (Transfer - balance);
                    System.out.println("You have transfered " + amount + "  to  "+AccountNumber+" and your new balance is " + balance + "\n");
                    anotherTransaction();
                }
                anotherTransaction();
                break;

            case 5:
                Exit = 2;
                System.out.println("Thanks for banking with us:\n\n");

            default:
                System.out.println("Have a nice day:\n\n");

        }

    }

    private static void anotherTransaction(){
        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n5 To exit");
        anotherTransaction = in.nextInt();
        if(anotherTransaction == 1){
            transaction();
        } else if(anotherTransaction == 5){
            System.out.println("Thanks for Banking with us. Good Bye!");
        } else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }
}