import java.util.Scanner;

public class javaternaryop {
    public static void main(String[] args) {
        int a,b,c,number;
        System.out.println("Enter 3 number to find grater one [ by Ternary operator ]  ");
        Scanner parminder = new Scanner(System.in);
        a= parminder.nextInt();
        b= parminder.nextInt();
        c=parminder.nextInt();

        number = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(number);

    }
}
