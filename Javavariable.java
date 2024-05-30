public class Javavariable {
    int a = 20;  //instance var , only call with OBJ
    static double b= 3.14;  //static var , use static keyword
    public static void main(String[] args) {

        boolean c = true; //local var

        Javavariable parminder = new Javavariable();
        System.out.println(parminder.a);

        System.out.println(b);
        System.out.println(c);

        System.out.println(parminder.a + "   " + b + "  " + c);
    }
}
