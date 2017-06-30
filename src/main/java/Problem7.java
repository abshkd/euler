/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/30/17 4:12 PM
 */

import java.util.ArrayList;
import java.util.List;

/*
 * This is likely too complex
 */
public class Problem7 {

    private Integer result;
    private List<Integer> primes;

    public void solve(int input) {
        primes = new ArrayList<Integer>();
        primes.add(2);
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            boolean isPrime = true;
            for (Integer prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
            if (primes.size() == input) {
                result = primes.get(input - 1);
                break;
            }
        }
    }

    public long getResult() {
        return result;
    }
}

