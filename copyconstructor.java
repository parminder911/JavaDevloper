public class copyconstructor {

    //copy one objects reference to another object by reference variable
int a;  String str;
    copyconstructor()
    {
        a = 45;  str = "PARMinder";
        System.out.println(a + " " + str);


    }
    copyconstructor(copyconstructor ref2003)

    {
        a= ref2003.a;
        str=ref2003.str;

        System.out.println(a + " " + str);


    }


    public static void main(String[] args) {
        copyconstructor parminder= new copyconstructor();
        copyconstructor parminder2003 = new copyconstructor(parminder);



    }
}
