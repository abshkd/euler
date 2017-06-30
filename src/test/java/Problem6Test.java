/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/30/17 2:53 PM
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Problem6Test {

    private static Problem6 problem = new Problem6();
    private long input;
    private long expected;

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10L, 2640L},
                {20L, 0L},
                {100L, 1912970916L}
        });
    }

    //constructor
    public Problem6Test(long input, long expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals(expected, problem.solve(input));
    }
}
