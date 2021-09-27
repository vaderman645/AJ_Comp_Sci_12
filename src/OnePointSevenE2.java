public class OnePointSevenE2 {
    public static void main(String[] args) {
        int [] num = {2,5,6,2,5,2,8,5};
        int counter = 0;

        for (int count=0;count<num.length;count++){System.out.println(num[count]);}
            for (int i = 0; i < num.length; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] ==(num[j])) {
counter++;
                        System.out.print(num[j]);

                    }
                }
            }
        System.out.println("\nThere are " +counter + " duplicates.");


    }


    }

