import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks = input.nextInt();

        if (marks >= 50) {
            if(marks >= 80) {
                System.out.println("Grade A");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("Fail");
        }
        input.close();
        }
}

