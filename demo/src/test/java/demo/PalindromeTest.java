package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.odx.test.controller.PalindromeController;

public class PalindromeTest {
	PalindromeController palindromeController = new PalindromeController();

	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterAll
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Test
	public void checkPalindrome() {
		System.out.println("Checking for palindrome");
		assertEquals("alula", palindromeController.longestPalindrome("alula"));
	}
	
	@Test
	public void notPalindrome() {
		System.out.println("Checking for Non-palindrome");
		assertFalse("alua".equals(palindromeController.longestPalindrome("alula")));
	}
	

	

}