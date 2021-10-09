package Nan_code_palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    public boolean isPalindrome(String value){
        String temp = "";

        for (int i = value.length() -1; i >= 0; i--) {
            temp = temp  + value.charAt(i);
        }

        System.out.println(temp);

        return temp.equals(value);
    }

    @Test
    void test(){
        isPalindrome("kodok");
    }

    @Test
    void testPalindrome() {
        Assertions.assertTrue(isPalindrome("radar"));
        Assertions.assertTrue(isPalindrome("malam"));
        Assertions.assertTrue(isPalindrome("kasur ini rusak"));
        Assertions.assertTrue(isPalindrome("ibu ratna antar ubi"));

        Assertions.assertFalse(isPalindrome("malas"));
        Assertions.assertFalse(isPalindrome("makan nasi goreng"));
        Assertions.assertFalse(isPalindrome("balonku ada lima"));
    }
}
