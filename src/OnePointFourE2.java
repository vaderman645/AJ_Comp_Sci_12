import java.util.Scanner;
public class OnePointFourE2 {
static double rounder (double f){
    return 5 * (Math.round(f / 5));
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Enter Price: ");
double price = Double.parseDouble(input.nextLine());
double withtax = (price * 1.13);
String test = Double.toString(withtax);
int test2 = Integer.parseInt(test.substring((test.length() -2),test.length()));
System.out.println("Price With Tax: " + test.substring(0,2) + "." + (Double.toString(rounder(test2))).substring(0,2));



    }
}
