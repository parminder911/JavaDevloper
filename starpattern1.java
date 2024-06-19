import java.util.Scanner;

public class starpattern1 {

    public static void main(String[] args) {

        System.out.println("How many lines of STAR You want to print ?");
        Scanner parminder=new Scanner(System.in);

        int n = parminder.nextInt();

        for (int i=1;i<=n;i++)
        {
            for (int j=1 ;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
