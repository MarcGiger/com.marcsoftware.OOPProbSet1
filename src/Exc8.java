import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Exc8 {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for(int a=0;a<=9;a++){
          numbers[a] = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter an integer","do it",-1));
        }
        System.out.println(Arrays.toString(numbers));

for(int i= 0; i<10;i++){
while(i==0||i==4){
    System.out.println(numbers[i]);
    i++;
    break;
}

        }

    }
}
