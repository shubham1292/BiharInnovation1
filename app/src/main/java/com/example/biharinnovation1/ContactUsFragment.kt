package com.example.biharinnovation1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_contact_us.*

class ContactUsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_contact_us, container, false)

        val w = v.findViewById<ImageView>(R.id.whatsapp)
        val f = v.findViewById<ImageView>(R.id.facebook)
        val y = v.findViewById<ImageView>(R.id.youtube)

        w.setOnClickListener{
            val url = "https://api.whatsapp.com/send/?phone=916127966092&text&app_absent=0"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        f.setOnClickListener{
            val url = "https://www.facebook.com/BiharInnovation/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        y.setOnClickListener {
            val url = "https://www.youtube.com/channel/UC_h6LKTE9pqwZqnmmSGrMRQ"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        return v
    }

}