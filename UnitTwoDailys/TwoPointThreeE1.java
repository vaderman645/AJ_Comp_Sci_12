import java.util.Scanner;

public class TwoPointThreeE1 {
static void Info (String name, String favColor, byte age){
System.out.println(name + " notsmith is " + age + " years old, and their favourite colour is " + favColor);
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter Name: ");
    String name = input.nextLine();
    System.out.println("Enter Age: ");
    byte age = Byte.parseByte(input.nextLine());
    System.out.println("Enter favourite colour: ");
    String favColor = input.nextLine();
    Info(name,favColor,age);
    }
}
