public class NewerId {
    public static void main(String[] args) {
        int age = 33;
        boolean hasID = false;

        if (age < 18) {
            System.out.println("Access denied");
        } else if (hasID) {
            System.out.println("Access granted");
        } else {
            System.out.println("ID required");
        }
    }
}
