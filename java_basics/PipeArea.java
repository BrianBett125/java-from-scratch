import java.util.Scanner;

public class PipeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;
        double  surface_area;


        System.out.println("Enter the radius");
        double radius = input.nextDouble();

        System.out.println("Enter the height");
        int height = input.nextInt();

        surface_area = (Math.PI * Math.pow(radius, 2) + Math.PI * (2 * radius) * height); //Surface area formula

        System.out.println("The surface area is: " + (surface_area));

        input.close();
    }
}
