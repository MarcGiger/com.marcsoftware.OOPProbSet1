import javax.swing.*;

public class Exc7 {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Type a number", "Please", -1));
       if(isEven(a))
           System.out.println(a+" is even");
            else
           System.out.println(a+" is odd");


    }

    public static boolean isEven(int a){

        //boolean even = false;

        //int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Type a number", "Please", -1));
        /*if(a%2==0){
            even = true;
            System.out.println(a+" is even");
            return even;
        } else{
            System.out.println(a+" is odd");
            return even;
        }*/

       /* if(a%2==0)
            return true;
        else
            return false;*/

        return a%2==0;

    }
}
