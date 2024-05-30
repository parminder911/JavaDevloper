import java.util.Scanner;

public class Javanastedifelse {
    public static void main(String[] args) {
        System.out.println("To find Grater of 3 Numbers");
        System.out.println("enter any Three Numbers ...");
        Scanner Parminder = new Scanner(System.in);
        System.out.print("a=>");
        int a = Parminder.nextInt();
        System.out.print("b=>"); int b = Parminder.nextInt();
        System.out.print("c=>"); int c = Parminder.nextInt();


        if(a>b){
            if (a>c)
            {
                System.out.println("A is Grater from 3 Numbers " +" " + a );
            }
            else {
                System.out.println("C is Grater from 3 Numbers " +" " + c );
            }

        }
        else
        {
            if(b>c){
                System.out.println("B is Grater from 3 Numbers " +" " + b );

            }
            else
            {
                System.out.println("C is Grater from 3 Numbers " +" " + c );
            }
        }
    }
}
