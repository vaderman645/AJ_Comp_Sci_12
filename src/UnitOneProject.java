

import java.util.Scanner;

public class UnitOneProject {
    static void print(String input) {
        System.out.print(input);
    }

    static void println(String input) {
        System.out.println(input);
    }//print methods to save time

    public static final String Red = "\u001B[31m";//Turn perfect squares red
    public static final String White = "\u001B[0m";//turns red back to white
    static boolean[] Condition1 = {true, true, false, false};//declaring boolean arrays
    static boolean[] Condition2 = {true, false, true, false};// ^^^^^^^^^^^^^^^^^^^^^^^

    static void BooleanArrays(boolean Condition1, boolean Condition2, boolean TrueOrFalse) {
        //method for boolean arrays, conditions are the arrays in position i, and then it prints the output (TrueOrFalse)
        print(Condition1 + "\t\t|\t" + Condition2 + "\t|\t" + TrueOrFalse + "\n");
    }

    static boolean isPerfSquare(double z)//method for perfect square
    {
        double square = Math.sqrt(z);
        return ((square - Math.floor(square)) == 0);
    }
    static int factorials(int num) {
        int factorial;
        for(factorial = 1; num > 1; num--){
            factorial *= num;}
        return factorial;}
    static int Pascals(int n,int r) {
        return factorials(n) / ( factorials(n-r) * factorials(r) );
    }

    public static void main(String[] args) {
        byte selection = 0;
        while (selection !=7) {//loops the whole thing unless they pick 5
            Scanner input = new Scanner(System.in);

            println("\nEnter your selection: \n1. An addition table\n2. A multiplication table\n3. A logic table for booleans logics AND gate\n4. A logic table for booleans logics OR gate\n5. 2 Dimensional Multiplication table\n6. Pascals Triangle\n7. Exit");

            selection = input.nextByte();
            switch (selection) {
                case 1 -> {// Addition Table
                    byte[] first = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    for (byte i = 0; i < 11; i++) {//this loop controls the bases
                        for (byte x = 0; x < 11; x++) {// this nested loop controls the rows
                            byte result = (byte) ((i * 10) + first[x]);
                            if (isPerfSquare(result)) {
                                print(Red + result + "\t" + White);
                            }// turns perfect squares red
                            else {
                                print(result + "\t");
                            }
                        }
                        print("\n"); // adds a new line
                    }
                }
                case 2 -> {// multiplication table
                    println("\nEnter How dimensions of array:\nLength:");
                    byte length = input.nextByte();
                    println("\nWidth:");
                    byte width = input.nextByte();
                    byte[] MultiplicationFirst = new byte[width];
                    for (byte x = 0,y = 1; x < width; x++,y++){MultiplicationFirst[x] =y;}//adding an array of 1-10
                    byte MultiTableBase = 0;//declaring the base, number to be multiplied by first row
                    print("\n");//Separate lines
                    for (byte i = 0; i < length; i++) {//this loop controls the bases

                        MultiTableBase += 1;// goes from 1 to 2, 3 to 4, etc
                        for (byte x = 0; x < width; x++) {// this nested loop controls the rows
                            byte result = (byte) (MultiTableBase * MultiplicationFirst[x]);
                            if (isPerfSquare(result)) {
                                print(Red +result + "\t"+ White);
                            }// turns perfect squares red
                            else {
                                System.out.print(result + "\t");
                            }
                        }
                        print("\n"); // adds a new line
                    }
                }
                case 3 -> {//Booleans AND Gate table
                    print("Condition 1 |Condition 2|\tAND\n");
                    for (byte x = 0; x < 4; x++) {
                        boolean TrueOrFalse = Condition1[x] && Condition2[x];//does it meet AND?
                        BooleanArrays(Condition1[x], Condition2[x], TrueOrFalse);//calling method
                    }
                }
                case 4 -> {// Booleans OR gate
                    print("Condition 1 |Condition 2|\tOR\n");
                    for (byte x = 0; x < 4; x++) {
                        boolean TrueOrFalse = Condition1[x] || Condition2[x];//does it meet OR?
                        BooleanArrays(Condition1[x], Condition2[x], TrueOrFalse);//calling method
                    }
                }
                case 5 -> {// 2d multiplication table
                    byte[] MultiplicationFirst = new byte[10];
                    byte[][] bytetest = new byte[11][11];
                    for (byte x = 0,y = 1; x < 10; x++,y++){MultiplicationFirst[x] =y;}//adding an array of 1-10
                    for (byte x = 0,y = 1; x < 10; x++,y++){bytetest[0][x] =y;System.out.println(bytetest[0][x]);}

                    byte MultiTableBase = 0;//declaring the base, number to be multiplied by first row
                    print("\n");//Separate lines
                    for (byte i = 0; i < 10; i++) {//this loop controls the bases
                        MultiTableBase += 1;// goes from 1 to 2, 3 to 4, etc
                        for (byte x = 0; x < 10; x++) {// this nested loop controls the rows
                            bytetest[MultiTableBase][x] = (byte) (MultiplicationFirst[x] * MultiTableBase);
                            byte result = bytetest[MultiTableBase][x];
                            if (isPerfSquare(result)) {
                                print(Red +result + "\t"+ White);}// turns perfect squares red
                            else {
                                System.out.print(result + "\t");
                            }
                        }
                        print("\n"); // adds a new line
                    }
                }
                case 6 -> {//pascals triangle
                    print("\nEnter # of rows");
                    int NumberOfRows = input.nextInt();
                    for(int i = 0; i < NumberOfRows; i++) {
                        for(int j = 0; j < NumberOfRows-i; j++){
                            System.out.print(" ");}
                        for(int y = 0; y <= i; y++){
                            int result = Pascals(i,y);
                            System.out.print(" "+result);
                        }
                        System.out.println();
                    }
                }
                case 7 -> println("Bye");
                default -> print("Try Again Please\n");
            }
        }
    }
}
