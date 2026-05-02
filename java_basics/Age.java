public class Age {
    public static void main(String[] args) {
        int age = 74;

        if (age < 13) {
            System.out.println("Child");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teen"); 
            } else if (age >= 18 && age <= 60) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior");
            }
    }
}            
