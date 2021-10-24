import java.util.Scanner;

public class TwoPointFourE2 {
    static double quadFormula(double a,double b,double c){
        return (-b + Math.sqrt((a*a)-4*a*c))/(2*a);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] quad = new double[3];
    System.out.println("Enter A Value: ");
    quad[0] = input.nextDouble();
    System.out.println("Enter B Value: ");
    quad[1] = input.nextDouble();
    System.out.println("Enter C Value: ");
    quad[2] = input.nextDouble();
    System.out.println("Your Positive Root is: " + quadFormula(quad[0],quad[1],quad[2]));
    }
}
