import java.util.Scanner;

public class TwoPointFourE1 {
    static String RockPaper (String playerInt, String oppInp){
        if (playerInt.equalsIgnoreCase(oppInp)){return "Tie!";}
        else if (playerInt.equalsIgnoreCase("rock")&&oppInp.equalsIgnoreCase("scissors")){return"Player Wins!";}
        else if (playerInt.equalsIgnoreCase("rock")&&oppInp.equalsIgnoreCase("paper")){return"Player Loses!";}
        else if (playerInt.equalsIgnoreCase("scissors")&&oppInp.equalsIgnoreCase("rock")){return"Player Loses!";}
        else if (playerInt.equalsIgnoreCase("scissors")&&oppInp.equalsIgnoreCase("paper")){return"Player Wins!";}
        else if (playerInt.equalsIgnoreCase("paper")&&oppInp.equalsIgnoreCase("scissors")){return"Player Loses!";}
        else if (playerInt.equalsIgnoreCase("paper")&&oppInp.equalsIgnoreCase("rock")){return"Player Wins!";}
        else {return"";}
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Input (Rock, Paper, Scissors)");
        String playerInp = input.nextLine();
        System.out.println("Enter Opponent Input");
        String oppInp = input.nextLine();
        System.out.println(RockPaper(playerInp,oppInp));
    }
}
