abstract class Animals
{
    void legs(){
        System.out.println("All animals have 4 Legs");

    }
    abstract void eat();  //dont define here bcz df animals eat different
}
class dog extends Animals {
   @Override
    void eat()
    {
        System.out.println(" Dogs eat meat ");
    }

}

class cow extends Animals{
    void  eat()
    {
        System.out.println("Cow Eat Grass");
    }
}

public class abstractjava {
    public static void main(String[] args) {
        dog d1 = new dog();
       cow c1 = new cow();

        d1.eat();
        d1.legs();  //both directly access these method

        c1.eat();
        c1.legs();
    }



}
