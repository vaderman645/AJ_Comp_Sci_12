import java.util.Scanner;

public class TwoPointFive {
    static int Overload(int inp1,int inp2){
        return inp1+inp2;
    }
    static boolean Overload(boolean inp1, boolean inp2){
        if(Boolean.toString(inp1).equalsIgnoreCase("true")&& Boolean.toString(inp2).equalsIgnoreCase("true")){return true;}
        else {return false;}
    }
    static String Overload(String inp1, String inp2){
        return inp1 + inp2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Integers to add: ");
    int intInp1 = input.nextInt();
    int intInp2 = input.nextInt();
    System.out.println(Overload(intInp1,intInp2));

    System.out.println("Enter Your Booleans to add: ");
    boolean booInp1 = Boolean.parseBoolean(input.nextLine());
    boolean booInp2 = Boolean.parseBoolean(input.nextLine());
    booInp2 = Boolean.parseBoolean(input.nextLine());
    System.out.println(Overload(booInp1,booInp2));

    System.out.println("Enter Your Strings to add: ");
    String strInp1 = input.nextLine();
    String strInp2 = input.nextLine();
    System.out.println(Overload(strInp1,strInp2));
    }
}
