public class Club { //public class club
    public static void main(String[] args) {
        int age = 21;
        boolean haspasscard = true; 

        if (age >= 21) {
            if (haspasscard) { //nested if statement
                System.out.println("Access granted to guest");
            } else { 
                System.out.println("Access denied to guest");
            }
        } else {
            System.out.println("The guest is underage");
        }
    }
}
