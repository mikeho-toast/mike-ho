package android.example.palindromeapp

import org.junit.Test

import org.junit.Assert.*

class PalindromeValidatorTest {
    @Test
    fun `Single letter word is a palindrome`() {
        // arrange
        val testData = "a"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Two like letter word is a palindrome`() {
        //arrange
        val testData = "bb"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Palindrome name with a capital first letter is not a palindrome`() {
        //arrange
        val testData = "Ana"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }

    @Test
    fun `Longer type word is palindrome`() {
        //arrange
        val testData = "tacocat"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Two different letter word is not a palindrome`() {
        //arrange
        val testData = "do"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }

    @Test
    fun `Number phrase can be detected as a palindrome`() {
        //arrange
        val testData = "19191"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)
    }

    @Test
    fun `A Single emoji as a word is a palindrome`() {
        //arrange
        val testData = "A"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Palindrome word with an extra letter at the end is not a palindrome`() {
        //arrange
        val testData = "racecars"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }

    @Test
    fun `Phrase with letters, symbols and numbers is a palindrome`() {
        //arrange
        val testData = "#801LOL108#"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Chinese phrase is a palindrome`() {
        //arrange
        val testData = "谢谢"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertTrue(result)
    }

    @Test
    fun `Chinese name is not a palindrome`() {
        //arrange
        val testData = "何嘉仁" //Ho Ga Ren

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }

    @Test
    fun `Word with greek symbols is not a palindrome `() {
        //arrange
        val testData = "Καλημέρα"

        // act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        // assert
        assertFalse(result)
    }


    @Test
    fun `Phrase going forward and backwards is a palindrome`() {
        //arrange
        val testData = "PandaadnaP"

        //act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)
    }

    @Test
    fun `No phrase is a palindrome`() {
        //arrange
        val testData = ""

        //act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)
    }

    @Test
    fun `Even number character phrase`() {
        //arrange
        val testData = "True"

        //act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertFalse(result)
    }

    @Test
    fun `Odd number character phrase`() {
        //arrange
        val testData = "False"

        //act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertFalse(result)
    }

    @Test
    fun `Only symbol phrase is a palindrome`() {
        //arrange
        val testData = "!@!"

        //act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)

    }

    @Test
    fun `Symbols followed by a letter at the end should be a palindrome`() {
        //arrange
        val testData = "!@#@!F"

        //act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)

    }

    @Test
    fun `Emoji should be a palindrome`() {
        //arrange
        val testData = "🐼"

        //act
        val result: Boolean = PalindromeValidator.checkPalindrome(testData)

        //assert
        assertTrue(result)
    }
        
}