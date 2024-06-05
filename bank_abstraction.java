import java.util.Scanner;

abstract class user
{
    //hiding Essential Info & highlight set of services

    public String Bname = "Kotak";
    public String IFSC = "0064KOTAK";

    public void bankDetail()
    {
        System.out.println("Bank Name:" + Bname + " " + "Bank IFSC CODE: " + IFSC  );
    }

    abstract void Deposite(); //abstract method have no body
    abstract void Widhdraw();
    abstract void checkBal();



}
class bankService extends user {
    private double bal = 15000;
    private int pin;
    public double money;

    public void Deposite() {
        System.out.println("Enter Pin...");
        Scanner P1 = new Scanner(System.in);

        pin = P1.nextInt();

        if (pin == 2003) {
            System.out.println("Enter Deposite Amount...");
            money = P1.nextDouble();
            bal = bal + money;
            System.out.println("Deposited Money :" + money);
            System.out.println("Total Balance :" + bal);

        } else {
            System.out.println("Wrong Pin...");
        }
    }

    public void Widhdraw() {
        System.out.println("Enter Pin...");
        Scanner P1 = new Scanner(System.in);

        pin = P1.nextInt();

        if (pin == 2003) {
            System.out.println("Enter Withdraw Amount...");
            money = P1.nextDouble();
            bal = bal - money;
            System.out.println("Deposited Money :" + money);
            System.out.println("Total Balance :" + bal);

        } else {
            System.out.println("Wrong Pin...");
        }


    }

    public void checkBal() {
        System.out.println("Enter Pin...");
        Scanner P1 = new Scanner(System.in);

        pin = P1.nextInt();

        if (pin == 2003) {

            System.out.println("Total Balance :" + bal);

        } else {
            System.out.println("Wrong Pin...");
        }

    }

}

public class bank_abstraction {
    public static void main(String[] args) {
        bankService parminder = new bankService();
        parminder.bankDetail();

        int ch;
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("----------Enter Your choice---------");

        Scanner p2 = new Scanner(System.in);

        ch = p2.nextInt();

        switch (ch) {
            case 1:
                parminder.Deposite();
                break;

            case 2:
                parminder.Widhdraw();
                break;

            case 3 :
                parminder.checkBal();
                break;

            default:
                System.out.println("Please Enter correct choice...");


        }


    }
}

