/*
 * Created by Abhishek Dujari (ab@3computing.com) on 7/2/17 2:34 AM
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Problem8Test {

    private long expected;
    private int input;
    private Problem8 problem;

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {4, 5832L},
                {13, 23514624000L}
        });
    }

    //contructor
    public Problem8Test(int input, long expected) {
        this.input = input;
        this.expected = expected;
        problem = new Problem8();
    }

    @Test
    public void test() {
        problem.solve(input);
        assertEquals(expected, problem.getResult());
    }

}
