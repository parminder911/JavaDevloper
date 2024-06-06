class H1{

    void input()
    {
        System.out.println("Enter your name:");
    }

}

class H2 extends  H1 {
    void show()
    {
        System.out.println("my name is Parminder");
    }


}

public class hierarchicalinheritance extends H1 {
    void Display()
    {
        System.out.println("my name is parminderjit Singh");
    }


    public static void main(String[] args) {
        H2 parminder= new H2();
        hierarchicalinheritance p1 = new hierarchicalinheritance();

        parminder.input();
        parminder.show();

        p1.input();
        p1.Display();


    }


}
