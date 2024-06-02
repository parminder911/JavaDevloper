public class parametrizedconst   //parametrized Constructor
{
    parametrizedconst(int a , int b)
    {
        System.out.println( a + " " + b);

    }
    parametrizedconst(int a , String str)
    {
        System.out.println( a + " " + str);

    }

    public static void main(String[] args) {
        parametrizedconst parminder = new parametrizedconst(153 , 77);
parametrizedconst parminderjit = new parametrizedconst(50 ,"Parminder");
    }

}
