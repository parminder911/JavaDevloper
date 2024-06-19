import java.util.Scanner;

public class charpattern1 {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("enter No. of lines");
        Scanner parminder = new Scanner(System.in);
        int n=parminder.nextInt();

        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}
