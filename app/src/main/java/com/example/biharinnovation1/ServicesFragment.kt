package com.example.biharinnovation1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction

class ServicesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_services, container, false)

        val b1 = view.findViewById<Button>(R.id.button1)
        val b2 = view.findViewById<Button>(R.id.button2)
        val b3 = view.findViewById<Button>(R.id.button3)
        val b4 = view.findViewById<Button>(R.id.button4)
        val b5 = view.findViewById<Button>(R.id.button5)

        b1.setOnClickListener{
            val contactFragment = ContactUsFragment()
            val transaction:FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.frame,contactFragment)
            transaction.commit()
        }
        b2.setOnClickListener{
            val contactFragment = ContactUsFragment()
            val transaction:FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.frame,contactFragment)
            transaction.commit()
        }
        b3.setOnClickListener{
            val contactFragment = ContactUsFragment()
            val transaction:FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.frame,contactFragment)
            transaction.commit()
        }
        b4.setOnClickListener{
            val contactFragment = ContactUsFragment()
            val transaction:FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.frame,contactFragment)
            transaction.commit()
        }
        b5.setOnClickListener{
            val contactFragment = ContactUsFragment()
            val transaction:FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.frame,contactFragment)
            transaction.commit()
        }


        return view
    }
}