import java.util.Scanner;

public class OnePointSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Couning up by 3: \n");
    for (int i = 0; i<22;i=i + 3){System.out.println(i);}
System.out.println("\nCounting Down from 21: \n");
    for (int i = 22;i>0;i=i){
        if (i==20){i=14;}i = i -1;
        System.out.println(i);
    }

    }
}
