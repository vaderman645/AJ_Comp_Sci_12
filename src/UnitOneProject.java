import java.util.Scanner;

public class UnitOneProject {
    static String print (String input){System.out.println(input);return("");}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    print("Enter your selection: \n1. An addition table\n2. A multiplication table\n3. A logic table for booleans logics AND gate\n4. A logic table for booleans logics OR gate");
    byte selection = input.nextByte();
    switch (selection){
        case 1:
            byte[]firstrow = {1,2,3,4,5,6,7,8,9,10};
            byte[]rows = new byte[9];
for (byte i=0;i<11;i++){
    //rows[i] = firstrow[i];
//print();
}
            break;
        case 2:

            break;

        case 3:

            break;

        case 4:

            break;
        default:
            print("Try Again Please");
    }
    }
}
