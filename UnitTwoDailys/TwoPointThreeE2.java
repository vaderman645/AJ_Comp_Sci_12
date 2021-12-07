import java.util.Scanner;

public class TwoPointThreeE2 {
static boolean Pomp (int num){
    return num % 3 == 0 || Integer.toString(num).contains("3");
}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int num = input.nextInt();
    if (Pomp(num)){System.out.println("Pomplemousse");}
    else {System.out.println(num);}
    }
}
