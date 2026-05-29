import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length:");
        int length = input.nextInt();

        System.out.println("Enter the width:");
        int width = input.nextInt();

        int perimeter = 2 * (length + width);

        System.out.println("The perimeter is: " + (perimeter));

        input.close();
    }
}
