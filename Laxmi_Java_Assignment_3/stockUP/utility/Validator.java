package utility;

import java.util.Scanner;

public class Validator {
  
  public Validator() {
    // do nothing
  }

  public int selValidation(Ink ink, Scanner input, int min, int max) {
    boolean valid = false;
    int choice = 0;
    while(!valid) {
      ink.printMenu();
      try {
        choice = input.nextInt(); // throw an exception
        if(choice >= min && choice <= max){
          valid = true;
        }
        else {
          System.out.println("\u001B[91m" + "Selection out of range!");
        }
      }
      catch (Exception e) {
        System.out.println("\u001B[91m" + "Please read the menu and make a valid selection!");
        valid = false; // just in case
      } 
      finally { // runs if there's an error or NOT!! always runs
        input.nextLine(); // clear the input
      }
    } // while()
    return choice;
  } // isValid()

  public double fundValidation(Ink ink, Scanner input, double balance ) {
    double amount = 0;
    boolean valid = false;
    while(!valid) {
      ink.printAddFunds(balance);
      
      try {
        amount = input.nextDouble(); // throw an exception
        if(amount > 0){
          valid = true;
        }
        else {
          System.out.println("\033[0;31m" + "Enter a postive amount!");
        }
      } 
      catch (Exception e) {
        System.out.println("\033[0;31m" + "Please enter valid amount!");
        valid = false; // just in case
      } 
      finally { // runs if there's an error or NOT!! always runs
        input.nextLine(); // clear the input
      }
    } // while()
    return amount;
  }


  public double fundWithDrawValidation(Ink ink, Scanner input, double balance ) {
    double amount = 0;
    boolean valid = false;
    while(!valid) {
      ink.printFundsWithdraw(balance);
      try {
        amount = input.nextDouble(); // throw an exception
        if(amount > 0){
          valid = true;
        }
        else {
          System.out.println("\033[0;31m" + "Enter positive amount!");
        }
        if(amount > balance) {
          System.out.println("\033[0;31m" + "You do not have enough funds to withdraw that amount!");
          valid = false;
        }
      } 
      catch (Exception e) {
        System.out.println("\033[0;31m" + "Please enter valid amount!");
        valid = false; // just in case
      } 
      finally { // runs if there's an error or NOT!! always runs
        input.nextLine(); // clear the input
      }
    } // while()
    return amount;
  }

  
  
} // class