package com.johncodeos.passdatafragmentsexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    private var inputText: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = layoutInflater.inflate(R.layout.fragment_2, container, false)

        inputText = arguments?.getString("input_txt")

        val outputTextView = rootView.findViewById<TextView>(R.id.output_textview)
        outputTextView.text = inputText

        return rootView
    }
}