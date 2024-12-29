package Basics;
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of inputs:");
        int t = scan.nextInt();

        System.out.println("Enter Input:");
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();

            if (n % 2 == 0) {
                System.out.println(n + " It is Even number");
            } else {
                System.out.println(n + " It is Odd number");
            }
        }
        scan.close();
    }
}
