package com.johncodeos.passdatafragmentsexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.johncodeos.passdatafragmentsexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Replace Main Activity content with the Fragment1 content
        val fragment1 = Fragment1()
        supportFragmentManager.beginTransaction().replace(R.id.content_id, fragment1).commit()

    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("input_txt", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val frag2 = Fragment2()
        frag2.arguments = bundle

        transaction.replace(R.id.content_id, frag2)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }
}
