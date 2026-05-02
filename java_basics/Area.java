import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pi = 3.1459;
        double area;

        System.out.println("Enter the radius:");
        int radius = input.nextInt();

        System.out.println("The area is: " + (pi * radius * radius));

        input.close();
    }
}
