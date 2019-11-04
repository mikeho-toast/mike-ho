package android.example.palindromeapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageCheck: ImageView = findViewById(R.id.resultcheckmark)
        val imageX: ImageView = findViewById(R.id.resultxmark)
        val inputWord: EditText = findViewById(R.id.inputString)
        val enterButton = findViewById<Button>(R.id.enterButton)
        enterButton.setOnClickListener {
            onClickButton(inputWord.text.toString(), imageCheck, imageX)
        }
    }

    private fun onClickButton(inputWord: String, imageCheck: ImageView, imageX: ImageView) {
        //val isPalindrome: Boolean = PalindromeValidator.checkPalindrome(inputWord)
        val isPalindrome: Boolean = PalindromeValidator.checkPalindrome(inputWord)

        if (isPalindrome) {
            imageCheck.visibility = View.VISIBLE
            imageX.visibility = View.INVISIBLE
            Toast.makeText(this, "$inputWord is a palindrome", Toast.LENGTH_LONG).show()
        } else {
            imageX.visibility = View.VISIBLE
            imageCheck.visibility = View.INVISIBLE
            Toast.makeText(this, "$inputWord is not a palindrome", Toast.LENGTH_LONG).show()
        }
    }
}