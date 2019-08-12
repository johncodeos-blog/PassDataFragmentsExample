package com.johncodeos.passdatafragmentsexample

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_1.view.*

class Fragment1: Fragment() {


    lateinit var comm: Communicator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_1, container, false)
        comm = activity as Communicator

        rootView.enter_btn.setOnClickListener {
            comm.passDataCom(rootView.input_edittext.text.toString())
        }
        return rootView
    }
}