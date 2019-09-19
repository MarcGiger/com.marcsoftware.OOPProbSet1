import javax.swing.*;

public class Exc5 {

    public static void main(String[] args) {


        Exc5.getResult();

        }



    public static void getResult(){

        double x1, x2;

        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"C"));

        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}