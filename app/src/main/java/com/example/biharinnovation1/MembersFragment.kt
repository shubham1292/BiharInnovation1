package com.example.biharinnovation1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MembersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_members, container, false)

        val button1 = view.findViewById<Button>(R.id.button1)
        val button2 = view.findViewById<Button>(R.id.button2)
        val button3 = view.findViewById<Button>(R.id.button3)
        val button4 = view.findViewById<Button>(R.id.button4)
        val button5 = view.findViewById<Button>(R.id.button5)
        val button6 = view.findViewById<Button>(R.id.button6)
        val button7 = view.findViewById<Button>(R.id.button7)
        val button8 = view.findViewById<Button>(R.id.button8)
        val button9 = view.findViewById<Button>(R.id.button9)
        val button10 = view.findViewById<Button>(R.id.button10)
        val button11 = view.findViewById<Button>(R.id.button11)
        val button12 = view.findViewById<Button>(R.id.button12)
        val button13 = view.findViewById<Button>(R.id.button13)
        val button14 = view.findViewById<Button>(R.id.button14)

        button1.setOnClickListener {
            val url = "https://www.linkedin.com/in/branjan/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button2.setOnClickListener {
            val url = "https://www.linkedin.com/in/amit-kumar-shukla-972a998a/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button3.setOnClickListener {
            val url = "https://www.linkedin.com/in/unavailable/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button4.setOnClickListener {
            val url = "https://www.linkedin.com/in/abhishek-kumar-b52975177/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button5.setOnClickListener {
            val url = "https://www.linkedin.com/in/aditya-narayan-79b5831b0/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button6.setOnClickListener {
            val url = "https://www.linkedin.com/in?_l=en_US"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button7.setOnClickListener {
            val url = "https://www.linkedin.com/in/krishna-kumar-5b836464/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button8.setOnClickListener {
            val url = "https://www.linkedin.com/in/mohit-r-06156b200/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button9.setOnClickListener {
            val url = "https://www.linkedin.com/in/natashgpt/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button10.setOnClickListener {
            val url = "https://www.linkedin.com/in/kamini-kumari-2b2a72208/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button11.setOnClickListener {
            val url = "https://www.linkedin.com/in/ravindra-kumar-31813746/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button12.setOnClickListener {
            val url = "https://www.linkedin.com/in/atulkumar/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button13.setOnClickListener {
            val url = "https://www.linkedin.com/in/dewang-shekhar-7a69aa1a2/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        button14.setOnClickListener {
            val url = "https://www.linkedin.com/in/shubham-kumar-0a44ba1b8/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        return view
    }
}