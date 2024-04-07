import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.parcial2.R




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val text = editText.text.toString()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("text", text)
        startActivity(intent)
    }
}
