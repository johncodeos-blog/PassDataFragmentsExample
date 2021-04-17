package com.johncodeos.passdatafragmentsexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.johncodeos.passdatafragmentsexample.databinding.Fragment1Binding

class Fragment1 : Fragment(R.layout.fragment_1) {

    private lateinit var comm: Communicator

    private var fragment1Binding: Fragment1Binding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = Fragment1Binding.inflate(inflater, container, false)
        fragment1Binding = binding

        comm = requireActivity() as Communicator
        binding.enterBtn.setOnClickListener {
            comm.passDataCom(binding.inputEdittext.text.toString())
        }

        return binding.root
    }

    override fun onDestroyView() {
        fragment1Binding = null
        super.onDestroyView()
    }
}