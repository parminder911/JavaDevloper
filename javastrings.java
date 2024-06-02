public class javastrings {

    public static void main(String[] args) {
        String a = "Parminderjit";
        System.out.println(a);
     int length =  a.length();
        System.out.println("length of String = " + length);


        String b =a.toUpperCase();
        System.out.println(b);  // System.out.println(a.toUpperCase());

        System.out.println(a.toLowerCase());


        System.out.println("Now compare 2 strings as same values");

        String a1 = "Parminderjit";

        if (a==a1)
        {
            System.out.println("both are equal" );
        }

        else {
            System.out.println("not equal , because check reference Variable not its content thats store in srting");

        }




        if(a.equals(a1))
        {
            System.out.println("both values are equal -> " + a + " = " + a1 );
        }


        System.out.println("To print storage location of string, refrence variable");

        int strlocation = System.identityHashCode(a);
        System.out.println(strlocation);
        int strlocation1 = System.identityHashCode(a1);
        System.out.println(strlocation1);


        System.out.println("srting are immutable :-");

        a.concat(" Singh");
        System.out.println(a);

        System.out.println("string can changed after copy in new variable ");

        String a2 = a.concat(" Singh");   //only copy of string can change value of string
        System.out.println(a2);




    }

}
