package dev.chirii.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.chirii.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = Contact("Mercy Jepchirchir","0713520925","mercykemboi999@gmail.com","616","")
        var contact2 = Contact("Albert Kimeli","071350000","mercykemboi999@gmail.com","618","")
        var contact3 = Contact("Benson Ajuma","0700006551","mercykemboi999@gmail.com","61","")
        var contact4 = Contact("Gilbert Kibet","071566666","mercykemboi999@gmail.com","888","")
        var contact5 = Contact("Viola Jemutai","0713577777","mercykemboi999@gmail.com","616","")
        var contact6 = Contact("Jackson Lagat","0713520925","mercykemboi999@gmail.com","616","")
        var contact7 = Contact("Eliud Kiplagat","07139999998","mercykemboi999@gmail.com","616","")
        var ContactLists=
            listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        var contactAdapter = ContactRvAdapter(ContactLists)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }

}