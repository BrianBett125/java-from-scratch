public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful");
        } else if (!username.equals("admin")) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Invalid password");
        }
    }
}
