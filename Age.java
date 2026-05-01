public class Age {
    public static void main(String[] args) {
        int age = 74;

        if (age < 13) {
            System.out.println("Child");
            } else if (age >= 14 && age < 18) {
                System.out.println("Teen"); 
            } else if (age >= 19 && age < 70) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior");
            }
    }
}            
