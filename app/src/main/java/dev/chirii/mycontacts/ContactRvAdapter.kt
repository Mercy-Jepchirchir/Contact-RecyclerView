package dev.chirii.mycontacts

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactRvAdapter (var ContactList:List<Contact>):
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
       var itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = ContactList.get(position)
        holder.tvName.text = currentContact.name
        holder.tvEmail.text = currentContact.email
        holder.tvLocation.text = currentContact.address
        holder.tvContact.text = currentContact.phoneNumber
    }

    override fun getItemCount(): Int {
      return ContactList.size
    }


}
class ContactsViewHolder(itemView:View):
    RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvContact = itemView.findViewById<TextView>(R.id.tvContact)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvLocation = itemView.findViewById<TextView>(R.id.tvLocation)
    var imgContacts = itemView.findViewById<ImageView>(R.id.imgContacts)


    }