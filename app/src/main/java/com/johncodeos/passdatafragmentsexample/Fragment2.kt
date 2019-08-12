package com.johncodeos.passdatafragmentsexample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_2.view.*

class Fragment2: Fragment() {

    var inputText: String? = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_2, container, false)
        inputText = arguments?.getString("input_txt")

        rootView.output_textview.text = inputText

        return rootView
    }

}