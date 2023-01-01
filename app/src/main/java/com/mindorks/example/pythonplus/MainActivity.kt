package uz.widvan.example.pythonplus

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mindorks.example.pythonplus.quiz_section.QuizMainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   // private var button: Button? = null

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setStatusBarColor(ContextCompat.getColor(this, R.color.main_quiz_color))

        setUpOnClickListener()
    }

    private fun setUpOnClickListener() {

        btn1.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets1")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets2")
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets3")
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets4")
            startActivity(intent)
        }

        btn5.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets5")
            startActivity(intent)
        }

        btn6.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets6")
            startActivity(intent)
        }

        btn_quiz_section.setOnClickListener {
            val intent = Intent(this, QuizMainActivity::class.java)
            startActivity(intent)
        }

        btn_end.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets7")
            startActivity(intent)
        }

        btn_about.setOnClickListener {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("ViewType", "assets8")
            startActivity(intent)
        }

    }
}
