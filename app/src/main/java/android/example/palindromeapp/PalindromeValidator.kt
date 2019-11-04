package android.example.palindromeapp

object PalindromeValidator {

    fun checkPalindrome(inputWord: String): Boolean {
        var filteredInputword = inputWord.toCharArray()
            .filter { it.isLetterOrDigit() }
            .joinToString(separator = "")
        var startIndex = 0
        var endIndex = filteredInputword.lastIndex

        if ((endIndex + 1) % 2 == 0) { //even inputWord
            while (startIndex < endIndex) {
                if (filteredInputword[startIndex] != filteredInputword[endIndex]) {
                    return false
                }
                startIndex++
                endIndex--
            }
            return true
        }
        if ((endIndex + 1) % 2 != 0) { //odd inputWord
            while (startIndex != endIndex) {
                if (filteredInputword[startIndex] != filteredInputword[endIndex]) {
                    return false
                } else if (filteredInputword[startIndex] == filteredInputword[endIndex]) {
                    startIndex++
                    endIndex--
                }
            }
            return true
        }
        return true
    }
}