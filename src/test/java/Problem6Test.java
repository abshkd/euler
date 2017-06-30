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

    private static Problem6 problem;
    private int input;
    private long expected;

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {20, 41230L},
                {10, 2640L},
                {100, 25164150L}
        });
    }

    //constructor
    public Problem6Test(int input, long expected) {
        this.input = input;
        this.expected = expected;
        problem = new Problem6();
    }

    @Test
    public void test() {
        problem.solve(input);
        assertEquals(expected, problem.getResult());
    }
}
