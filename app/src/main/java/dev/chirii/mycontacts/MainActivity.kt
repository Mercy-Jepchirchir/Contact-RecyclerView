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
        var contact1 = Contact("Mercy Jepchirchir","0713520925","mercykemboi999@gmail.com","616","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=386&q=80")
        var contact2 = Contact("Albert Kimeli","071350000","mercykemboi999@gmail.com","618","https://images.unsplash.com/photo-1627897495484-229b29feb0d5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact3 = Contact("Benson Ajuma","0700006551","mercykemboi999@gmail.com","61","https://images.unsplash.com/photo-1543807535-eceef0bc6599?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact4 = Contact("Gilbert Kibet","071566666","mercykemboi999@gmail.com","888","https://images.unsplash.com/photo-1563995103864-d87d3c1fdd39?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact5 = Contact("Viola Jemutai","0713577777","mercykemboi999@gmail.com","616","https://images.unsplash.com/photo-1614251056798-0a63eda2bb25?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact6 = Contact("Jackson Lagat","0713520925","mercykemboi999@gmail.com","616","https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact7 = Contact("Eliud Kiplagat","07139999998","mercykemboi999@gmail.com","616","https://media.istockphoto.com/photos/portrait-of-a-happy-senior-couple-sitting-together-outdoors-picture-id1324925755?b=1&k=20&m=1324925755&s=170667a&w=0&h=H840IrlGJfupJH86c_VWu9wG5XxMl2ie1URWjB6Bmfc=")
        var ContactLists=
            listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        var contactAdapter = ContactRvAdapter(ContactLists)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }

}