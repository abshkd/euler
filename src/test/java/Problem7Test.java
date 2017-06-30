/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/30/17 4:10 PM
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Problem7Test {

    private Problem7 problem;
    private int input;
    private long expected;

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {6, 13},
                {10001, 104743},
                {100001,1299721}
        });
    }

    //contructor
    public Problem7Test(int input, long expected) {
        problem = new Problem7();
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        problem.solve(input);
        assertEquals(expected, problem.getResult());
    }

}