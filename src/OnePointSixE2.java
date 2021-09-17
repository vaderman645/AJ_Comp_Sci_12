public class OnePointSixE2 {
    public static void main(String[] args) {


        //intArr = new int[string.length()];
    for(int i=1;i<101;i++){
        if(i % 3 == 0 && i % 5 != 0){System.out.println("Fizz");}
        if (i % 5 == 0 && i % 3 != 0){System.out.println("Buzz");}
        if (i % 3 == 0 && i % 5 == 0){System.out.println("FizzBuzz");}
        else {System.out.println(i);}
    }
}}
