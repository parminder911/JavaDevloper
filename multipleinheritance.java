interface super1{
    void show(); //always absteact + public
}
interface   super2 {
   abstract void show();

 }
public class multipleinheritance implements super1,super2    //only possible by interface
{
    public void show()
    {
        System.out.println("Interface A & B");
    }
    public static void main(String[] args) {
        multipleinheritance parminder = new multipleinheritance();

                parminder.show();

        }
}



