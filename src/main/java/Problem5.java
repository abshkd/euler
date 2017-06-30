/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/29/17 9:09 AM
 */

public class Problem5 {

    public static void main(String[] args) {

        int number = 0;
        int range = 20;

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            for (int j = 1; j <= range; j++) {
                if (i % j != 0) {
                    break; //get out of j
                }
                if (j == range) {
                    number = i;
                }
            }
            if (number != 0) {
                break; //get out of i
            }
        }

        System.out.println(number);
    }
}
