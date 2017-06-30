/*
 * Created by Abhishek Dujari (ab@3computing.com) on 6/29/17 8:03 AM
 */
public class Problem4 {

    public static void main(String[] args) {

        int palindrome = 0;
        int first = 0;
        int second = 0;

        //not the fastest solution
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                Integer number = i * j;
                if (reverse(number).equals(number) && (number > palindrome)) {
                    palindrome = number;
                    first = i;
                    second = j;
                }
            }

        }

        System.out.println(palindrome);
        System.out.println("i:" + first + " j:" + second);
    }


    public static Integer reverse(Integer n) {
        Integer reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10; //extract digit from n
            n = n / 10; //shorten n by the extracted digit, remainder is dropped

        }
        return reverse;
    }
}
