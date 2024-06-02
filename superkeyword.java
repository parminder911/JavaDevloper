class a{
    int a=20;
    void show()
    {
        System.out.println("to check super keyword on method");
    }
}
class b extends a
{
    int a = 500;
    void show()
    {
        super.show(); // to call the parent class method
        System.out.println(a);
        System.out.println(super.a);
        super.show(); // to call the parent class method
    }

}
public class superkeyword {

    public static void main(String[] args) {
        b parminder = new b();
        parminder.show();

    }
}
