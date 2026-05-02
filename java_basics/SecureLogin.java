import java.util.Scanner; 

public class SecureLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = input.nextLine();

        System.out.println("Enter password: ");
        String password = input.nextLine();

        if(username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful");
        }
        else {
            System.out.println("Invalid credentials");
        }
        input.close();
    }
}

