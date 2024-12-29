import java.util.Scanner;

public class Range_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter low Input:");
        int low = sc.nextInt();

        System.out.println("Enter high Input:");
        int high = sc.nextInt();

       
        for (int n = low; n<=high; n++) {
           
            int count = 0;

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 00) {
                System.out.println(n + "  It is Prime number");
            } else {
                System.out.println(n + "  It is not Prime number");

            }
        }
        sc.close();
    }
}
