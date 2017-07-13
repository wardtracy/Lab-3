import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int userNum = 0;

        System.out.println("Learn your squares and cubes!");
        System.out.println();
        System.out.println("Please enter a number 1-10: ");
        System.out.println();
        System.out.println("Number  " +  "\tSquared  " +  "  \tCubed");
        System.out.println("======  " +  "    ======="  + "     =====");

        userNum = scan.nextInt();

     for (int i = 0; i <= userNum; i++) {

         System.out.println(i + "       \t" + (int)Math.pow(i, 2) + "     \t    " + (int)Math.pow(i, 3));
     }

    }
}
