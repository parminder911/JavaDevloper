public class thiskeyword {
    int a;  //instance variable

    thiskeyword(int a)
    {
     
        this.a=a;  //local and instance var. are same
          }
    void  show()
    {
        System.out.println(this);
        System.out.println(a);
    }

    //refer current object = instance variable ,
    // both object and this keyword show same reference number
    public static void main(String[] args) {
        thiskeyword parminder = new thiskeyword(500);
        System.out.println(parminder);

        parminder.show();




    }
}
