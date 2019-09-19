import javax.swing.*;

public class Exc6 {

    public static void main(String[] args) {

       /* int f = Integer.parseInt(JOptionPane.showInputDialog(null, "How many times?"));
        Exc6b.cube(f);
    }
    */
       int g = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the length of your object of desire?"));
    throughBorder(g);
}

public static void throughBorder(int i){

        i = i*i*i;

        if(i>100){
            JOptionPane.showMessageDialog(null,"You can’t take this on board, put it into your check-in luggage", "NO", JOptionPane.ERROR_MESSAGE );
        } else {JOptionPane.showMessageDialog(null,"You are good to go", "Yes", JOptionPane.DEFAULT_OPTION );
        }
    }
}