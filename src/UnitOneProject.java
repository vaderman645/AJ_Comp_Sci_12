import java.util.Scanner;

public class UnitOneProject {
    static String print (String input){System.out.print(input);return("");}
    static String println (String input){System.out.println(input);return("");}//print methods to save time
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        println("Enter your selection: \n1. An addition table\n2. A multiplication table\n3. A logic table for booleans logics AND gate\n4. A logic table for booleans logics OR gate");

        byte selection = input.nextByte();
    switch (selection){

        case 1:// Addition Table
            byte[]firstrow = {0,1,2,3,4,5,6,7,8,9,10};
            for (byte i=0;i<11;i++){System.out.print(firstrow[i] + "   ");} // prints first row
            print("\n");

            for (byte i=0;i<9;i++){//this loop controls the bases
    byte base = 10;
    base = (byte) (base + (i*10));
    for(byte x=0;x<11;x++) {// this nested loop controls the rows
        byte result = (byte) (base +firstrow[x]);
        System.out.print(result + "  ");
    }
    print("\n"); // adds a new line
}
            for(byte x=0;x<11;x++) { // this for loop is the final row in the addition table, so it can be properly aligned.
                byte result = (byte) (100 +firstrow[x]);
                System.out.print(result + " ");
            }
            break;
        case 2:// multiplication table
            byte[]multiplacationfirstrow = {0,1,2,3,4,5,6,7,8,9,10};
            for (byte i=0;i<11;i++){System.out.print(multiplacationfirstrow[i] + "   ");} // prints first row
            print("\n");

            for (byte i=0;i<9;i++){//this loop controls the bases
                byte multibase = 10;
                multibase = (byte) (multibase + (i*10));
                for(byte x=0;x<11;x++) {// this nested loop controls the rows
                    byte result = (byte) (multibase *multiplacationfirstrow[x]);
                    System.out.print(result + "  ");
                }
                print("\n"); // adds a new line
            }
            for(byte x=0;x<11;x++) { // this for loop is the final row in the addition table, so it can be properly aligned.
                byte result = (byte) (100 +multiplacationfirstrow[x]);
                System.out.print(result + " ");
            }


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
