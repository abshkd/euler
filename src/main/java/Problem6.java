/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/30/17 2:50 PM
 */

public class Problem6 {

    private long sumOfSqares = 0;
    private long squareOfSum = 0;
    private long result = 0;

    public long solve(long input) {
        for (long i = 1; i <= input; i++) {
            sumOfSqares += i * i;
            squareOfSum += i;
        }

        System.out.println(sumOfSqares);
        squareOfSum *= squareOfSum;
        System.out.println(squareOfSum);

        result = squareOfSum - sumOfSqares;
        return result;
    }
}
