import javax.swing.*;
import java.awt.*;

public class Exc3 {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null,"Please enter your Name");
        Float length = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter length"));
        Float breadth = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter breadth"));

        float totalArea = length*breadth;
        float sqmcosts = 33.50f;
        float totalCosts = sqmcosts*totalArea;
        JTextArea quote = new JTextArea(6,1);

        Font font = new Font("Courier", Font.BOLD,12);
        quote.setFont(font);
        quote.setText(String.format("Quotation for %s\n",name));
        quote.append(String.format("Length of room:\t\t %.2f m.\n",length));
        quote.append(String.format("Breadth of room:\t\t %.2f m.\n",breadth));
        quote.append(String.format("Total area of room:\t\t %.2f sq. m.\n",totalArea));
        quote.append(String.format("Cost per square metre of Carpet:\t %.2f euro\n",totalArea));
        quote.append(String.format("Total cost of carpet:\t\t %.2f  euro\n",totalCosts));
        JOptionPane.showMessageDialog(null,quote);
    }
}
