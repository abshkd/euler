/*
 * Created by Abhishek Dujari (ab@3computing.com) on 7/2/17 4:11 AM
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Problem9Test {

    private Problem9 problem;
    private int input;
    private int expected;

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {12, 60},
                {1000, 31875000}
        });
    }

    //constructor
    public Problem9Test(int input, int expected) {
        this.input = input;
        this.expected = expected;
        problem = new Problem9();
    }

    @Test
    public void test() {
        problem.solve(input);
        assertEquals(expected, problem.getResult());
    }
}
