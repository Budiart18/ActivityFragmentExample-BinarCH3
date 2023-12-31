package com.aeryz.activityfragmentexample.presentation.fragmentthree

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aeryz.activityfragmentexample.R
import com.aeryz.activityfragmentexample.databinding.FragmentThreeBinding
import com.aeryz.activityfragmentexample.presentation.otheractivity.OtherActivity

class FragmentThree : Fragment() {

    private lateinit var binding : FragmentThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThreeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListener()
    }

    private fun setClickListener() {
        binding.btnNavigateOther.setOnClickListener {
            navigateToOtherActivity()
        }
    }

    private fun navigateToOtherActivity() {
        val intent = Intent(this.requireContext(),OtherActivity::class.java)

        intent.putExtra(OtherActivity.ARGS_NAME, "Budi")
        intent.putExtra(OtherActivity.ARGS_AGE, 22)
        startActivity(intent)
    }
}