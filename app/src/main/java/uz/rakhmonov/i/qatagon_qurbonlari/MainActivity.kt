package uz.rakhmonov.i.qatagon_qurbonlari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.rakhmonov.i.qatagon_qurbonlari.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.behbudiy.setOnClickListener {
            putData(0,)
        }
        binding.chulpon.setOnClickListener {
            putData(1)
        }
        binding.qodiriy.setOnClickListener {
            putData(2)
        }
        binding.fitrat.setOnClickListener {
            putData(3)
        }
        binding.nosir.setOnClickListener {
            putData(4)
        }


    }

    private fun putData(number: Int) {
        var intent=Intent(this,Info_Activity::class.java)
        intent.putExtra("NUMBER",number)
        startActivity(intent)    }
}