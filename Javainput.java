import java.util.Scanner;

public class Javainput {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter 2 Numbers");
        Scanner parminder = new Scanner(System.in);
         a = parminder.nextInt();
         b = parminder.nextInt();
         c = a+b;
        System.out.println(c);
    }
}
