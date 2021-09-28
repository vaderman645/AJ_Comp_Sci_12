import java.awt.*;
import java.util.Scanner;
public class OnePointSevenE4 {
    static String print (String input){
        System.out.println(input);
        return("");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    print("How many items would you like to enter?");
    int length = Integer.parseInt(input.nextLine());
    String[] ItemNames = new String[length];
    for (int i=0,y=1;i<length;i++,y++){
        print("Enter item #" + y + ":");
        ItemNames[i] = input.nextLine();
    }
    double[] ItemPrice = new double[length];
    for (int i=0;i<length;i++){
        print("Enter Price of " + ItemNames[i]);
        ItemPrice[i] = Double.parseDouble(input.nextLine());
    }
    int[] ItemCount = new int[length];
    for (int i=0;i<length;i++){
        print("Enter how many " + ItemNames[i] + " you are selling:");
        ItemCount[i] = Integer.parseInt(input.nextLine());
    }
    for (int i=0;i<length;i++){
        print("Total $ earned for " + ItemNames[i] + ":");
        print("$"+ Double.toString(ItemPrice[i] * ItemCount[i]));
    }
    }
}
