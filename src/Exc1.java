import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Exc1 {

    public static void main(String[] args) {


       float exchangerate = Float.parseFloat(showInputDialog(null, "Please enter the Exchange Rate\nfor GBP/EUR" , "GBP/EUR", JOptionPane.INFORMATION_MESSAGE));

       float gbp = Float.parseFloat(showInputDialog(null, "Please Enter GBP that needs to be converted" , "GBP/EUR", JOptionPane.INFORMATION_MESSAGE));

       while(gbp!=0){

           float eur = gbp*exchangerate;
           JOptionPane.showMessageDialog(null, "For GBP:  "+String.format("%.2f",gbp)+"\nExchange rate:  "+exchangerate+"\nYou receive:  "+String.format("%.2f",eur)+ " EUR",String.format("%.4f",exchangerate)+"", JOptionPane.INFORMATION_MESSAGE);

           gbp = Float.parseFloat(showInputDialog(null, "Please Enter GBP that needs to be converted or End with entering 0" , "GBP/EUR "+String.format("%.4f",exchangerate), JOptionPane.INFORMATION_MESSAGE));
    }





    }
}

