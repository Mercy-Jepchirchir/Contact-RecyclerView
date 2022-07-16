package dev.chirii.mycontacts

import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.chirii.mycontacts.databinding.ActivityMainBinding
import dev.chirii.mycontacts.databinding.ContactListItemBinding

class ContactRvAdapter (var ContactList:List<Contact>):
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        var ContactsViewHolder = ContactsViewHolder(binding)
        return ContactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = ContactList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvEmail.text = currentContact.email
        holder.binding .tvLocation.text = currentContact.address
        holder.binding.tvContact.text = currentContact.phoneNumber
        Picasso.get()
            .load(currentContact.image)
            .resize(250,250)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_outline_24)
            .networkPolicy(NetworkPolicy.OFFLINE)
            .centerCrop()
            .into(holder.binding.imgContacts)

        var context = holder.itemView.context
        holder.binding.imgContacts.setOnClickListener {
            Toast.makeText(context,"you have clicked on ${currentContact.name} the image",Toast.LENGTH_SHORT).show()
        }

        holder.binding.cvContact.setOnClickListener{
            var intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("EMAIL",currentContact.email)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
      return ContactList.size
    }



}
class ContactsViewHolder(var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root){



    }