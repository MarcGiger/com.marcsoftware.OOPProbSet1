import javax.swing.*;

public class Exc4 {

    public static void main(String[] args) {

        String fullName = JOptionPane.showInputDialog(null, "Please enter your full Name");
        System.out.println("number of chars in name: "+fullName.length());
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.toUpperCase());

        System.out.println(fullName.lastIndexOf(" "));
    }
}
