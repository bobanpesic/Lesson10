package exercises;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PalindromeTest {
	
	Palindrome testPalindrome = new Palindrome();

	@Test
	void testLoadWords() {
		assertTrue(testPalindrome.loadWords().contains("apple"));
	}
	
	// 2. Test that a word exists in the dictionary 
	
	
	@Test
	void testWordExists() throws Exception {
		assertTrue(testPalindrome.loadWords().contains("aba"));
		assertTrue(testPalindrome.loadWords().contains("redder"));
		assertTrue(testPalindrome.loadWords().contains("eye"));
		assertTrue(testPalindrome.loadWords().contains("baron"));

		assertFalse(testPalindrome.loadWords().contains("promaja"));

	}

	// 3. Test that a word is a palindrome
	@Test
	void testIsPalindrome() throws Exception {
		assertTrue(testPalindrome.isPalindrome("aba"));
	    assertTrue(testPalindrome.isPalindrome("redder"));
        assertTrue(testPalindrome.isPalindrome("eye"));
		assertFalse(testPalindrome.isPalindrome("baron"));
	}





}
