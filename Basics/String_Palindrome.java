package Basics;

import java.util.Scanner;

public class String_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();

        String Convert = input.toLowerCase(); 

        String rev = new StringBuilder(Convert).reverse().toString(); 
        System.out.println(input);
        System.out.println(Convert);
       
        if (rev.equals(Convert)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close(); 
    }
}
