package Basics;

import java.util.Scanner;

public class Armstrong_No {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = scanner.nextInt();

        int temp = n;
        int arm = 0;
        int remain;

        while (n != 0) {
            remain = n % 10;
            arm = remain * remain * remain + arm;
            n = n / 10;
        }

        if ( arm==temp) {
            System.out.println( " Yes it is an Armstrong Number");
        } else {
            System.out.println(" No it is  not an Armstrong Number");

        }
        scanner.close();
    }

}
