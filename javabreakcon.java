public class javabreakcon {

    public static void main(String[] args) {
        System.out.println("continue statement use");
        for (int i =1;i<=5;i++)
        {
            if(i==3)

                continue;

            System.out.print(" " + i);
        }
        System.out.print("\n");
        System.out.println("Break statement Use");

        for (int i =1;i<=5;i++)
        {
            if(i==3)

                break;

            System.out.print(  i + " " );
        }

    }

}
