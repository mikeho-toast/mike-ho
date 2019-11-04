package android.example.palindromeapp

object PalindromeValidator {

    fun checkPalindrome(inputWord: String): Boolean {

        var startIndex = 0
        var endIndex = inputWord.lastIndex

        while (startIndex < endIndex) { // when the start index is less than the end index, do this loop

            startIndex = getNextValidCharacterIndex(inputWord, startIndex, true)
            endIndex = getNextValidCharacterIndex(inputWord, endIndex, false)

            if (inputWord[startIndex] != inputWord[endIndex]) { //check to see if the left index value is not equal to the right index value
                return false
            }
            startIndex++
            endIndex--
        }
        return true
    }

    private fun getNextValidCharacterIndex(inputWord: String, index: Int, isStart: Boolean) : Int {
        return if (inputWord[index].isLetterOrDigit()) {
            index
        } else {
            var increment = if (isStart) index + 1 else index -1
            getNextValidCharacterIndex(inputWord, increment, isStart)
        }
    }
}