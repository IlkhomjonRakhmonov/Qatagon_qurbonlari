package uz.rakhmonov.i.qatagon_qurbonlari

import android.annotation.SuppressLint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import uz.rakhmonov.i.qatagon_qurbonlari.databinding.ActivityInfoBinding

class Info_Activity : AppCompatActivity() {
    lateinit var binding: ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityInfoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val image=binding.imageInfo
        val title=binding.title
        val info=binding.info

        val number = intent.getIntExtra("NUMBER",-1)

        loadData(number,image,title,info)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
                }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home)
        finish()
        return true
    }


}

    @SuppressLint("SetTextI18n")
    private fun loadData(number:Int, image: ImageView, title:TextView, info:TextView) {
        when (number){
            0-> {image.setImageResource(R.drawable.behbudiy)
            title.text="Mahmudxo'ja Behbudiy"
                info.text=Data.infoBehbudiy
            }
            1-> {image.setImageResource(R.drawable.chulpon)
                title.text="Cho'lpon"
                info.text=Data.infoChulpon
            }
            2-> {image.setImageResource(R.drawable.qodiriy)
                title.text="Abdulla Qodiriy"
                info.text=Data.infoQodiriy
            }
            3-> {image.setImageResource(R.drawable.fitrat)
                title.text="Abdurauf Fitrat"
                info.text=Data.infoFitrat
            }
            4-> {image.setImageResource(R.drawable.nosir)
                title.text="Usmon Nosir"
                info.text=Data.infoNosir
            }
        }
}