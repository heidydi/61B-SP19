import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();
    static CharacterComparator offbyone= new OffByOne();
    static CharacterComparator offbyn= new OffByN(3);

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);

    }

    @Test
    public void TestisPalindrome(){
        assertFalse(palindrome.isPalindrome("cat"));
        assertTrue(palindrome.isPalindrome("noon"));
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("a"));
        assertTrue(palindrome.isPalindrome("nouon"));

        assertFalse(palindrome.isPalindrome("cat",offbyone));
        assertTrue(palindrome.isPalindrome("noom",offbyone));
        assertTrue(palindrome.isPalindrome("",offbyone));
        assertTrue(palindrome.isPalindrome("a",offbyone));
        assertTrue(palindrome.isPalindrome("noupn",offbyone));

        assertFalse(palindrome.isPalindrome("cat",offbyn));
        assertTrue(palindrome.isPalindrome("noop",offbyn));
        assertTrue(palindrome.isPalindrome("",offbyn));
        assertTrue(palindrome.isPalindrome("a",offbyn));
        assertTrue(palindrome.isPalindrome("nouln",offbyn));
    }
}     //Uncomment this class once you've created your Palindrome class.