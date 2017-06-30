/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/29/17 8:03 AM
 */

/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/29/17 8:00 AM
 */
public class Problem1 {

    static int sum = 0;

    public static void main(String args[]) {

        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) sum += i;
        }

        System.out.println("Problem 1 : " + sum);
    }

}
