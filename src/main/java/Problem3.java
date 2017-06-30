/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/29/17 8:03 AM
 */

/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/29/17 8:00 AM
 */

public class Problem3 {

    public static void main(String[] args) {

        long number = 600851475143L;
        long i;

        // Don't start with 0 or 1.
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i; // The number is divided by the factor to continue the loop with new number
                i--;
            }
        }

        System.out.println(i);
    }
}
