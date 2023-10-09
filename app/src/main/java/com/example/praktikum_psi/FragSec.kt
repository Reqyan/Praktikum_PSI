package com.example.praktikum_psi;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.lang.StringBuilder
class FragSec : Fragment() {
    private var nilai = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val displayView =
            inflater.inflate(R.layout.fragment_frag_sec, container,false)
        displayView.findViewById<TextView>(R.id.tv_frag_two).text = nilai.toString()
        displayView.findViewById<Button>(R.id.btn_counter).setOnClickListener {
            displayView.findViewById<TextView>(R.id.tv_frag_two).text = nilai++.toString()
        }
        return displayView
    }
}