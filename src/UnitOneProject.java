

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
        print("  ");//method for boolean arrays, conditions are the arrays in position i, and then it prints the output (TrueOrFalse)
        System.out.print(Condition1);
        if (Condition1) {
            print(" ");
        }
        print("     |       " + Condition2);
        if (Condition2) {
            print(" ");
        }
        print("      |  " + TrueOrFalse + "\n");
    }

    static boolean isPerfSquare(double z)//method for perfect square
    {
        double square = Math.sqrt(z);
        return ((square - Math.floor(square)) == 0);
    }


    public static void main(String[] args) {
        byte selection = 0;
        while (selection !=5) {//loops the whole thing unless they pick 5
            Scanner input = new Scanner(System.in);

            println("\nEnter your selection: \n1. An addition table\n2. A multiplication table\n3. A logic table for booleans logics AND gate\n4. A logic table for booleans logics OR gate\n5. Exit\n");

            selection = input.nextByte();
            switch (selection) {
                case 1 -> {// Addition Table
                    byte[] first = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    for (byte i = 0; i < 11; i++) {//this loop controls the bases
                        for (byte x = 0; x < 11; x++) {// this nested loop controls the rows
                            byte result = (byte) ((i * 10) + first[x]);
                            if (isPerfSquare(result) && Byte.toString(result).length() == 1) {
                                print(Red + result + "   " + White);
                            }// turns perfect squares with a length of 1 red
                            else if (isPerfSquare(result) && Byte.toString(result).length() == 2) {
                                print(Red + result + "  " + White);
                            }// ^^^^^^^^^^^^^^^^^^^^^^^^^^^ length of 2 red
                            else if (Byte.toString(result).length() == 1) {
                                print(result + "   ");
                            } else if (Byte.toString(result).length() == 2) {
                                print(result + "  ");
                            } else {
                                print(result + " ");
                            }
                        }
                        print("\n"); // adds a new line
                    }
                }
                case 2 -> {// multiplication table
                    byte[] MultiplicationFirst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    byte MultiTableBase = 0;//declaring the base, number to be multiplied by first row
                    print("\n");//Separate lines
                    for (byte i = 0; i < 10; i++) {//this loop controls the bases

                        MultiTableBase += 1;// goes from 1 to 2, 3 to 4, etc
                        for (byte x = 0; x < 10; x++) {// this nested loop controls the rows
                            byte result = (byte) (MultiTableBase * MultiplicationFirst[x]);
                            if (isPerfSquare(result) && Byte.toString(result).length() == 1) {
                                print(Red + " " + result + "  " + White);
                            }// turns perfect squares with a length of 1 red
                            else if (isPerfSquare(result) && Byte.toString(result).length() == 2) {
                                print(Red + result + "  " + White);
                            }// ^^^^^^^^^^^^^^^^^^^^^^^^^^^ length of 2 red
                            else if (Byte.toString(result).length() == 1) {
                                print(" " + result + "  ");
                            }//ensures proper alignment for numbers of differing lengths
                            else if (Byte.toString(result).length() == 2) {
                                print(result + "  ");
                            } else {
                                print(result + " ");
                            }
                        }
                        print("\n"); // adds a new line
                    }
                }
                case 3 -> {//Booleans AND Gate table
                    print("Condition 1 |   Condition 2    |  AND\n");
                    for (byte x = 0; x < 4; x++) {
                        boolean TrueOrFalse = Condition1[x] && Condition2[x];//does it meet AND?
                        BooleanArrays(Condition1[x], Condition2[x], TrueOrFalse);//calling method
                    }
                }
                case 4 -> {// Booleans OR gate
                    print("Condition 1 |   Condition 2    |   OR\n");
                    for (byte x = 0; x < 4; x++) {
                        boolean TrueOrFalse = Condition1[x] || Condition2[x];//does it meet OR?
                        BooleanArrays(Condition1[x], Condition2[x], TrueOrFalse);//calling method
                    }
                }
                case 5 -> println("Bye");
                default -> print("Try Again Please\n");
            }
        }
    }
}
