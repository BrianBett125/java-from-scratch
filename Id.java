public class Id {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = false;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Access granted");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Access denied");
        }
    }
}
