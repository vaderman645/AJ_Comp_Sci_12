import java.util.Scanner;

public class OnePointSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {345,678,456,324,245};
        for (int count=0; count<5;count++){System.out.println(array[count]);}
        System.out.println("Reversed:");
        for (int count=0, alength = array.length; count<5;count++,alength--){System.out.println(array[alength-1]);}
        int max = array[0], min = array[0];
        for (int i = array.length-1; i>0;i--){if (array[i]>max){max = array[i];}}
        for (int i = array.length-1; i>0;i--){if (array[i]<min){min = array[i];}}
        System.out.println("Maximum: " + max + " Minimum: " + min);
    }
}
