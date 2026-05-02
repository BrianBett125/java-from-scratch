public class NewId {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = false;

        if (age < 18) {
            System.out.println("Access denied");
        } else if (age >= 18 && hasID) {
            System.out.println("Access granted");
        } else if (age >= 18 && !hasID) {
            System.out.println("ID required");
        }
    }
}

