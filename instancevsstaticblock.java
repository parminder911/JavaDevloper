public class instancevsstaticblock {
    int a = 40 ;
    static int  b = 70;

    instancevsstaticblock()
    {
        System.out.println("constructor call after instance block");
    }

    { //dont call without OBJ , call before constructor
        System.out.println("instance block");
        System.out.println( a + " " + b); //access both static and non static variable

    }



    static {  //static keyword use for static block
        //only access static variable
        System.out.println("static block call first , then instance then constructor ");
        System.out.println("no obj needed for static block");
        System.out.println(  " only access static variable b = " + b);

    }

    public static void main(String[] args) {
       instancevsstaticblock parminder = new instancevsstaticblock();

    }

}
