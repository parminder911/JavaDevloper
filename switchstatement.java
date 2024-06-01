import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {

        System.out.println("Calculator using Switch statement");
        System.out.println("enter 2 numbers");
        int a , b, c;
        Scanner parminder = new Scanner(System.in);
        a= parminder.nextInt();
        b= parminder.nextInt();

        System.out.println("Enter your choice");
        System.out.println("1. Addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiply");
        System.out.println("4. division");

        int ch= parminder.nextInt();

        switch (ch)
        {
            case 1: c=a+b;
                System.out.println(c);
                break;

            case 2: c=a-b;
                System.out.println(c);
                break;
            case 3: c=a*b;
                System.out.println(c);
                break;
            case 4: c=a/b;
                System.out.println(c);
                break;
            default:
                System.out.println("something went wrong! please Enter value between 1-4 only ");
        }
    }
}
