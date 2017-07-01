/*
 * Created by Abhishek Dujari (ab@3computing.com) on 7/2/17 4:24 AM
 */

/*
* Surprisingly fast. 2 runs in < 1ms.
*/
public class Problem9 {
    private int result;

    private int[][] pythagorean;

    public Problem9() {
        // These are the common pythagorean triplets.
        //triplets are their own multiples.
        pythagorean = new int[][]{
                {3, 4, 5},
                {5, 12, 13},
                {7, 24, 25},
                {8, 15, 17}
        };

        result = 0;
    }

    public void solve(int input) {
        int a, b, c, left, right, sum;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            //test each triplet
            for (int[] triplet : pythagorean) {
                a = triplet[0] * i;
                b = triplet[1] * i;
                c = triplet[2] * i;

                left = a * a + b * b;

                right = c * c;

                sum = a + b + c;

                if ((left == right) && (sum == input)) {
                    result = a * b * c;
                    System.out.format("a: %d , b: %d, c: %d \n", a, b, c);
                    break;

                }
            }
            if (result != 0) {
                break;
            }

        }
    }

    public int getResult() {
        return result;
    }
}
