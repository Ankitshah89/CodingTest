package com.odx.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PalindromeController {

	@GetMapping("palindrome/{str}")
	public String longestPalindrome(@PathVariable String str) {

		// starting point for comparison with other palindromes
		String longestPalindrome = str.substring(0, 1);
		for (int i = 0; i < str.length(); i = i + 1) {
			// odd length case (center is i)
			String newPalindrome = checkIfEqual(str, i, i);
			if (newPalindrome.length() > longestPalindrome.length()) {
				longestPalindrome = newPalindrome;
			}
			// even length case (center is i, i+1)
			newPalindrome = checkIfEqual(str, i, i + 1);
			if (newPalindrome.length() > longestPalindrome.length()) {
				longestPalindrome = newPalindrome;
			}
		}

		return longestPalindrome;
	}

	public String checkIfEqual(String str, int begin, int end) {
		while ((begin >= 0 && end <= str.length() - 1) && (str.charAt(begin) == str.charAt(end))) {
			// move left
			begin--;
			// move right
			end++;
		}
		return str.substring(begin + 1, end);
	}
}
