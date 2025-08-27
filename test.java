import java.util.Scanner;

public class test {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.println("You entered the name: " + name);

        in.close();
    }
}