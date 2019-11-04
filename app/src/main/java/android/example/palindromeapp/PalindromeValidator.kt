package android.example.palindromeapp

object PalindromeValidator {

    fun checkPalindrome(inputWord: String): Boolean {
        var filteredInputword = inputWord.toCharArray()
            .filter { it.isLetterOrDigit() }
            .joinToString(separator = "")
        var startIndex = 0
        var endIndex = filteredInputword.lastIndex

        if ((endIndex + 1) % 2 == 0) { //even inputWord String
            while (startIndex < endIndex) { // when the start index is less than the end index, do this loop
                if (filteredInputword[startIndex] != filteredInputword[endIndex]) { //check to see if the left index value is not equal to the right index value
                    return false
                }
                startIndex++
                endIndex--
            }
            return true
        }
        if ((endIndex + 1) % 2 != 0) { //odd inputWord String
            while (startIndex != endIndex) { //while the start index is not equal to the end index
                if (filteredInputword[startIndex] != filteredInputword[endIndex]) { // check to see if the left index value is not equal to the right index value
                    return false
                }
                startIndex++
                endIndex--
            }
            return true
        }
        return true
    }
}