import java.sql.SQLOutput;
import java.util.Scanner;

public class puzzles {

    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);
        System.out.println("Print value :" );
        int a = table.nextInt();
        if (a>=5)
        {
            for (int i=0;i<=10;i++)
                System.out.printf("%d * %d = %d", a, i, (a*i)).println();
                   }else{
            System.out.println("value is lessthan : " +a);
        }
    }


}
