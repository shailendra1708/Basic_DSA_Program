/*  constraints
   1<-t<-10000
   2<-t<10^9 */

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of inputs:");
        int t = sc.nextInt();

        System.out.println("Enter Input:");
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2 ; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;

                }
            }
            if (count == 02) {
                System.out.println("It is Prime number");
            } else {
                System.out.println("It is not Prime number");

            }
        }
    }
}
