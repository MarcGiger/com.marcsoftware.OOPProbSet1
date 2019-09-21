import java.util.Arrays;

public class Exc9 {

    public static void main(String[] args) {
        double[] anim = new double[]{100, 15, 345.56, 34, 765, 500, 433.80, 200, 300};

        System.out.println("Weights: "+Arrays.toString(anim));
        int under = 0;
        float higher = 0;
        double lightest = anim[0];

        double average = 0;

        for(int i=0;i<anim.length;i++){
average = (average +anim[i]);
    if(anim[i]<250){
       under++;
    }
    if(anim[i]>400){
        higher++;

    }
if(anim[i]<lightest)
    lightest = anim[i];

}
        float percentage = higher/anim.length*100;
        System.out.println("Number under 250kg: "+under+"\nPercentage over 400kg: "+String.format("%.0f",percentage)+"%");
System.out.println("Lightest animal: "+lightest+"kg");
System.out.println("Average weight: "+String.format("%.2f",average/anim.length)+"kg");
    }
}