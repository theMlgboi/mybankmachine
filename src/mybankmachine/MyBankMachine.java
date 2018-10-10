/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;

import javax.swing.JOptionPane;

/**
 *
 * @author anarc6700
 */
public class MyBankMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ATM sp;
        ATM sp = new ATM();
    //Ask for what the user wants to use the ATM for
    String choice = JOptionPane.showInputDialog(
      " Enter a number to :\n"
      + "1 - deposit \n"
      + "2 - withdraw \n"
      + "3 - see current balance");
     String number = JOptionPane.showInputDialog(
      " Enter the amount you would like to depose/withdraw:\n"
     );
    int number1 = Integer.parseInt(number);
    if(choice.equals("1")){
      //Use the default constructor
        sp.deposit(number1);
     System.out.println(sp);
    } else if(choice.equals("2")) {
      //Ask user phone type
      sp.withdraw(number1);
      System.out.println(sp);
    }else if(choice.equals("3")){
        String time = JOptionPane.showInputDialog(
      "eneter the amount of compound times\n"
     );
        String intrest1 = JOptionPane.showInputDialog(
      " Enter the intrest rate\n"
     );
       
        int time2 = Integer.parseInt(time);
        int intrest2 = Integer.parseInt(intrest1);
       sp.intrest(time2,intrest2, number1);
        System.out.println(sp);
    }else{  
    System.out.println("Invalid selection!");
      //sp = new ATM(name,amount);
    }


    }
    
}
