import java.util.Scanner;
public class OnePointOne {
    static int spacesgen(int spacesone) {
        while (spacesone>0){
            System.out.print(" ");
            spacesone--;}
        System.out.print("|");
        return (0);}
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter Name: ");
String name = input.nextLine();
System.out.println("Enter your section (A,B,C,D)");
String section = input.nextLine();
System.out.println("Enter your seat # (1-200)");
String Seat = input.nextLine();
int spacesone = 29 - name.length();
int spacestwo = 25;
int spacesthree = 29 - Seat.length();
System.out.print("\n|------------------------------------| \n| Name: " + name);
        spacesgen(spacesone);
        System.out.print("\n| Section: " + section);
        spacesgen(spacestwo);
        System.out.print("\n| Seat: " + Seat);
        spacesgen(spacesthree);
        System.out.print("\n| Price: $83");
        spacesgen(25);
        System.out.print("\n|------------------------------------|");
    }
}
