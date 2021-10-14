import java.util.Scanner;
public class OnePointFiveE3 {
    static String print(String prt){System.out.println(prt);return "";}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    print("Enter name number one: ");
    String name1 = input.nextLine();
    print("Enter name numer two: ");
    String name2 = input.nextLine();
    int comp = name1.compareTo(name2);
    boolean alphabeta = (comp<=0) ? true : false;
    print("You entered the names alphabetically: " + alphabeta);
    boolean same = (name1.equalsIgnoreCase(name2)) ? true : false;
    print("You entered the same names: " + same);
    }
}
