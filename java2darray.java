import java.util.Scanner;

public class java2darray {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        System.out.println("enter 2X3 [ 2 rows and 3 columns ] array");
        Scanner parmidnder=new Scanner(System.in);
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<3;j++)
            {
                a[i][j]= parmidnder.nextInt();
            }
            System.out.println();
        }

        System.out.println("Array we entered");
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }



    }
}
