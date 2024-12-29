import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Year: ");
        int n=sc.nextInt();

        if(n/4==0){
            System.out.println("Yes it is not leap year");
        }
        else if(n/100==0)
        {
            System.out.println("Yes it is leap year");
        }
        else if(n/400==0){
            System.out.println("Yes it is leap year");
        }
        else
        {
            System.out.println("Yes it is not leap year"); 
        }
    }
}
