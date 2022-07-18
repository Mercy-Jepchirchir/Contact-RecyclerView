package dev.chirii.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.chirii.mycontacts.databinding.ActivityMainBinding
import dev.chirii.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_view_contact)
        getExtras()
        getImageClickListener()
    }
    fun getImageClickListener(){
       binding.imgPerson.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
       }
    }

    fun getExtras(){
        val extras = intent.extras
         binding.tvDisplayName.text= extras?.getString("NAME","")
        binding.tvNumber.text = extras?.getString("EMAIL","")
        binding.tvDisplayPrimary.text = extras?.getString("PHONE NUMBER","")
        binding.tvRecord.text = extras?.getString("ADDRESS","")
        val image = extras?.getString("IMAGE","")
        Picasso.get().load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .resize(350,350)
            .centerCrop()
            .into(binding.imgPerson)
        //Toast.makeText(this,"$name: $email", Toast.LENGTH_LONG).show()
    }
}