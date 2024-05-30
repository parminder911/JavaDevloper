import java.util.Scanner;

public class javaifelse {
    public static void main(String[] args) {
        System.out.println("Enter Pin");
        Scanner parminder = new Scanner(System.in);
        int pin = parminder.nextInt();

        if(pin == 0000 )
        {
            System.out.println("Name -> Parminderjit");
            System.out.println("Age  -> 20");
            System.out.println("city -> Ludhiana");
        }
        else
        {
            System.out.println("Please Try again later with correct Pin !!!");
        }

    }



}
