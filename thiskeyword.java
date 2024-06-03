public class thiskeyword {
    int a;  //instance variable
    thiskeyword()
    {
        this(200); // call parametrized constructor

        System.out.println("constructor");


    }

    thiskeyword(int a)
    {
//     this();      // use to call default constructor
        this.a=a;  //local and instance var. are same
          }
    void  show()
    {
        System.out.println("print this keyword reference => " +this);
        System.out.println(a);
    }

    //refer current object = instance variable ,
    // both object and this keyword show same reference number
    public static void main(String[] args) {
        thiskeyword parminder = new thiskeyword();
        System.out.println( "print object reference => " +parminder);

        parminder.show();




    }
}

