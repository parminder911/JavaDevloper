import java.util.Scanner;

public class Javaladderelseif {
    public static void main(String[] args) {

        int marks;
        System.out.println("Enter Your Marks");
        Scanner parminder = new Scanner(System.in);
        marks = parminder.nextInt();


        if(marks >=60 && marks <100 )

        {
            System.out.println("1st Division");

        }
        else if (marks>= 40 && marks < 60)
        {
            System.out.println("2nd Division");
        }
        else if (marks>= 30 && marks < 40)
        {
            System.out.println("3rd Division");

        }
        else
        {
            System.out.println("fail or enter corect marks");

        }
    }
}
