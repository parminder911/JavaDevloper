import java.util.Scanner;

public class javaarray {

    public static void main(String[] args) {
        int arr[]={45,63,52,48,600};
        System.out.println(arr[2]);  // single arr print
        for(int fetchvalue : arr )
        {
            System.out.print( fetchvalue + " " );
        }
        System.out.println(" \n enter 3 int elements by user");

        Scanner parminder=new Scanner(System.in);
        int ar[]=new int[3];

        for (int i =0 ; i<=2;i++)
        {
            ar[i] = parminder.nextInt();

        }
        for (int c : ar)
        {
            System.out.println(c + " ");
        }


    }

}
