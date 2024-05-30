import java.util.Scanner;

public class Javaforloop {
    public static void main(String[] args) {
        int num;
        System.out.println("enter any number for write Table");
        Scanner parminder = new Scanner(System.in);
        num = parminder.nextInt();
        for (int i=1 ;i<=10;i++)
        {
            System.out.println(num + "X" + i + "=" + num*i );
        }


    }
}
