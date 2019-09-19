import javax.swing.*;

public class Exc4 {

    public static void main(String[] args) {

        String fullName = JOptionPane.showInputDialog(null, "Please enter your full Name");
        System.out.println("Number of chars in Name: "+fullName.length());
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.toUpperCase());
        System.out.println("Where are Spaces: "+fullName.indexOf(" "));
        System.out.println("Last Space @: "+fullName.lastIndexOf(" "));

        char firstname = fullName.charAt(0);
        System.out.println("Firstname initial: "+firstname);
        System.out.println("Family Name:"+fullName.substring(fullName.lastIndexOf(" ")));
    }
}

// Marc Oliver Giger for Ctrl + C