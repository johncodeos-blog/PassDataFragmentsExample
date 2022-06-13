package com.johncodeos.passdatafragmentsexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class Fragment1 : Fragment() {

    private lateinit var comm: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = layoutInflater.inflate(R.layout.fragment_1, container, false)

        comm = requireActivity() as Communicator

        val enterBtn = rootView.findViewById<Button>(R.id.enter_btn)
        val inputEditText = rootView.findViewById<EditText>(R.id.input_edit_text)
        enterBtn.setOnClickListener {
            comm.passDataCom(inputEditText.text.toString())
        }

        return rootView
    }
}