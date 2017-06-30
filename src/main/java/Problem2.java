/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/29/17 8:03 AM
 */

/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/29/17 8:00 AM
 */

public class Problem2 {

    public static void main(String[] args) {
        Integer term = 0;
        Integer nextTerm = 1;
        Integer value = 0;
        Integer sum = 0;

        while (value < 4000000) {
            value = term + nextTerm;
            if (value % 2 == 0) sum += value;
            term = nextTerm;
            nextTerm = value;
        }

        System.out.println(sum);
    }
}
