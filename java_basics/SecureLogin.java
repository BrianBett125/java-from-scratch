import java.utils.Scanner; 

public class SecureLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "admin";
        String password = "1234";

        system.out.println("Enter username");
        String username = input.nextLine();

        system.out.println("Enter password");
        String password = input.nextLine();

        if(username.equals("admin") && password.equals("1234")) {
            system.out.println("Login successful");
        }
        else {
            System.out.println("Invalid credentials");
        }
        input.close();
    }
}

