package android.example.palindromeapp

import org.junit.Test

import org.junit.Assert.*

class PalindromeValidatorTest {
    @Test
    fun `Single letter word is a palindrome`() {
        // arrange
        var testData = "a"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Two like letter word is a palindrome`() {
        //arrange
        var testData = "bb"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Palindrome name with a capital first letter is not a palindrome`() {
        //arrange
        var testData = "Ana"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }

    @Test
    fun `Longer type word is palindrome`() {
        //arrange
        var testData = "tacocat"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Two different letter word is not a palindrome`() {
        //arrange
        var testData = "do"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }

    @Test
    fun `Number phrase can be detected as a palindrome`() {
        //arrange
        var testData = "19191"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)
    }

    @Test
    fun `A Single emoji as a word is a palindrome`() {
        //arrange
        var testData = "A"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Palindrome word with an extra letter at the end is not a palindrome`() {
        //arrange
        var testData = "racecars"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }

    @Test
    fun `Phrase with letters, symbols and numbers is a palindrome`() {
        //arrange
        var testData = "#801LOL108#"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Chinese phrase is a palindrome`() {
        //arrange
        var testData = "谢谢"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Word with greek symbols is not a palindrome `() {
        //arrange
        var testData = "Καλημέρα"

        // act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }


    @Test
    fun `Phrase going forward and backwards is a palindrome`() {
        //arrange
        var testData = "PandaadnaP"

        //act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)
    }

    @Test
    fun `No phrase is a palindrome`() {
        //arrange
        var testData = ""

        //act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)
    }

    @Test
    fun `Even number character phrase`() {
        //arrange
        var testData = "True"

        //act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertFalse(result)
    }

    @Test
    fun `Odd number character phrase`() {
        //arrange
        var testData = "False"

        //act
        var result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertFalse(result)
    }
}
