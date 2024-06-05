import java.util.Scanner;

class A1{
    //one class access propety of another class called inheritance
    //code reusability ,
    //java dont support multiple inheritance but possible by interface

int rollnumber;
String name;

void input()
{
    System.out.println("enter Your roll number and  name  ");
}


}

class simpleinheritance extends A1 {


    void display()
    {
        Scanner p1 = new Scanner(System.in);
        rollnumber=  p1.nextInt();
        name = p1.next();

        System.out.println("roll number: " + rollnumber  + "   Name:  " + name );
    }

    public static void main(String[] args) {
        simpleinheritance parminder = new simpleinheritance();

        parminder.input();
        parminder.display();


    }


}
