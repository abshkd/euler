/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/30/17 2:50 PM
 */

public class Problem6 {

    private long sumOfSquares;
    private long squareOfSum;
    private long result;

    public void solve(int input) {
        sumOfSquares = 0;
        squareOfSum = 0;
        result = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }

        squareOfSum *= squareOfSum;
        result = squareOfSum - sumOfSquares;
    }

    public long getResult() {
        return result;
    }
}
