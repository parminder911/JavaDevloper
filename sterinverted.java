import java.util.Scanner;

public class sterinverted {
    public static void main(String[] args) {
        System.out.println("enter no. of lines");
        Scanner parmnder = new Scanner(System.in);
        int n=parmnder.nextInt();

        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=(n-i+1);j++){

                System.out.print("*");

            }
            System.out.println();
        }


    }
}
