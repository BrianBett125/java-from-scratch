public class Test {
    public static void main(String[] args) {
        int score = 75;
        boolean ispresent = true;
        
        if (score >= 50) {
            if (ispresent) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Fail");
        }
    }
}
