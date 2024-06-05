interface Android
{

    //by default variables are -> Public+static+final inside interface
    //access without object
    //methods are public+abstract

    //public => access from anywhere by any class
    //static => call without object , no need object to call static var
    //final => dont change once declared, eg. not possible to change name from poco to vivo
    String name = "Poco";
    int price = 12000;  // public+static+final

    void start();
    void poweroff();  //public + abstract

    default void color()
    {
        System.out.println("sky blue");
    }
    static void category()
    {
        System.out.println("Budget phone with expensive features");
    }


}

class interfacejava implements Android {

  public void start()
  {
      System.out.println("Press power button to switch on Android");
  }
   public void poweroff()
    {
        System.out.println("press power button again and swipe down to power button");
    }

    public static void main(String[] args) {
        interfacejava parminder = new interfacejava();

        parminder.start();
        parminder.poweroff();

      //  name = "vivo";  cannot assign value to final variable
        System.out.println(name);
        System.out.println(price);

        parminder.color();

Android.category();   //method call without object / using interface


    }
}
//private and protected not accesible