import java.util.Scanner;
public class OnePointTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Enter Type of Animal: ");
String type = input.nextLine();
System.out.println("Enter Amount of Animals: ");
int amount = Integer.parseInt(input.nextLine());
System.out.println("Enter Projection Year: ");
int year = Integer.parseInt(input.nextLine());
int maths = amount*(1 + (year - 2021));
System.out.println("\n Type of Animal: " + type + "\n Starting Amount: " + amount + "\n Current Year: 2021 \n Projection Year: " + year + "\n Projected Population: " + maths);
    }
}
