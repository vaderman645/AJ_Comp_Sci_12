import java.util.Scanner;

public class OnePointFiveE4 {
    static String print(String prt){System.out.println(prt);return "";}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        print("True or false? People from Brazil speak spanish: ");
        String torf = input.nextLine();
        if (torf.equalsIgnoreCase("false")){score++;}
        String torfanswer = (torf.equalsIgnoreCase("false")) ? "Correct" : "Wrong, they speak Portuguese";
        print(torfanswer);


        print("Who does Kylo Ren kill in Star Wars: The Force Awakens? \nA: Chewbacca \nB: Han Solo \nC: Princess Leia \nD: George Lucas");
        String multiple = input.nextLine();
        if (multiple.equalsIgnoreCase("B")){
            print("Correct!");
            score++;
        }
        else{
            print("Wrong");
        }
print("Give an example of a passing grade in Ontario: ");
int passing = Integer.parseInt(input.nextLine());
if (passing>49 && passing<101){print("Correct!"); score++;}
else {print("Wrong");}
print("What is the capital of Russia? ");
String russia = input.nextLine();

if (russia.equalsIgnoreCase("Moscow")){print("Correct!"); score++;}
else {print("Wrong");}


print("Choose an artist: \nA: Kanye West \nB: The Weeknd \nC: Dababy \nD: Drake");
String art = input.nextLine();
if (art.equalsIgnoreCase("A")){print("How many grammys does Kanye have?");int kanye = Integer.parseInt(input.nextLine()); if (kanye==21){print("Correct!"); score++;} else {print("Wrong");}}
else if (art.equalsIgnoreCase("B")){print("How many grammys does The Weeknd have?");int weeknd = Integer.parseInt(input.nextLine()); if (weeknd==3){print("Correct!"); score++;} else {print("Wrong");}}
else if (art.equalsIgnoreCase("C")){print("How many grammys does Dababy have?");int baby = Integer.parseInt(input.nextLine()); if (baby==0){print("Correct!"); score++;} else {print("Wrong");}}
else if (art.equalsIgnoreCase("D")){print("How many grammys does Drake have?");int Drake = Integer.parseInt(input.nextLine()); if (Drake==4){print("Correct!"); score++;} else {print("Wrong");}}
else {print("Wrong");}
System.out.println("Score: " + score +"/5");
    }
}
