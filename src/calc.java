import java.util.Scanner;

public class calc {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value1: ");
        int a = sc.nextInt();
        System.out.println("Enter the value2: ");
        int b = sc.nextInt();

        System.out.printf("%d * %d= %d ", a,b,(a*b)).println();
        System.out.printf("%d + %d= %d ", a,b,(a+b)).println();
        System.out.printf("%d - %d= %d ", a,b,(a-b)).println();
        System.out.printf("%d%%%d= %d ", a,b,(a%b)).println();
        System.out.printf("%d / %d= %d ", a,b,(a/b)).println();

    }
}
