import java.util.Scanner;

class M1{

    int a,b,c;

    void  input()
    {
        System.out.println("Enter 2 numbers :");
        Scanner S1 = new Scanner(System.in );
        a=S1.nextInt();
        b=S1.nextInt();
    }

    void add()
    {
        c=a+b;
        System.out.println("addition of 2 numbers : " + c );
    }
    void sub()
    {
        c=a-b;
        System.out.println("subtraction of 2 numbers :" + c );
    }



}
class  M2 extends M1
{
    void mul()
    {
        c=a*b;
        System.out.println("multipication of 2 numbers : " + c );
    }


    void div()
    {
        c=a/b;
        System.out.println("Division of 2 numbers : " + c );
    }
    

}


public class Multilevelinher extends M2  {


    public static void main(String[] args) {
        Multilevelinher parminder = new Multilevelinher();

        parminder.input();
        parminder.add();
        parminder.sub();
        parminder.mul();
       parminder.div();


    }


}
