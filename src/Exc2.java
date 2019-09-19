import javax.swing.*;

public class Exc2 {

    public static void main(String[] args) {

        Integer n = Integer.parseInt(JOptionPane.showInputDialog(null, "enter how many Times it should repeat", "Do it", 1 ));
// n trigger how many times it should be iterated

        JTextArea textArea = new JTextArea(2+n,2);
        //not needed JScrollPane scrollPane = new JScrollPane(textArea);
        //not needed textArea.setEditable(false);

        textArea.setText("Yards \tInches\n"+
                        "----- \t------");

        for(int i=1;i<=n;i++) {
            textArea.append("\n"+i + "\t"+i*36);

        }

JOptionPane.showMessageDialog(null,textArea);
    }
}
