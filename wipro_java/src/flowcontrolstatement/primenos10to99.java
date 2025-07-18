package flowcontrolstatement;
public class primenos10to99 {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");

        for (int num = 10; num <= 99; num++) {
            boolean isPrime = true;

            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + "\t");
            }
        }
    }
}
