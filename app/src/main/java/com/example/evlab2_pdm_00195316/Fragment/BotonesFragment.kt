package com.example.evlab2_pdm_00195316.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.evlab2_pdm_00195316.R
import kotlinx.android.synthetic.main.fragment_botones.*

class BotonesFragment : Fragment() {


   var btn1 = btn_despues
    var btn2 = btn_anterior

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_botones, container, false)

        return view

    }





}