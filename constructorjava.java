import java.util.Scanner;

public class constructorjava {

    int a;    String str;    char chr;
    float ft;    boolean bl;


    constructorjava() //default constructor
    {

        System.out.println("int = " + a + ", string = " + str +" " + ", char= " + chr);
        System.out.println(" float= " + ft + " " + ", boolean= " + bl);
    }

    void  show()  //only show that values initilize after obj created
    {
        System.out.println("we only call this value using object, other values like boolean and char etc. are call itself at time of object created and values intilized by default =>" +  a);
    }

    public static void main(String[] args) {
        constructorjava parminder = new constructorjava();
       parminder.show();



    }
}
