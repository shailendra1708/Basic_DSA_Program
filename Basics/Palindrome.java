package Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = scanner.nextInt();
        int temp=n, remain , reverse=0;

        while(n>0){
      remain=n%10;
     reverse = reverse * 10 + remain; 
     n /= 10; 
}
if(temp==reverse)
{
    System.out.println("Yes it is Palindrome Number]");
}
else{
    System.out.println("Yes it is not Palindrome Number]");

}
        }

    }
