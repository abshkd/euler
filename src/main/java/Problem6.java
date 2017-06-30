/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/30/17 2:50 PM
 */

public class Problem6 {

    private long sumOfSqares = 0;
    private long squareOfSum = 0;
    private long result = 0;

    public long solve(int input) {
        for (long i = 1; i <= input; i++) {
            sumOfSqares += i * i;
            squareOfSum += i;
        }

        squareOfSum *= squareOfSum;
        result = squareOfSum - sumOfSqares;
        return result;
    }
}
