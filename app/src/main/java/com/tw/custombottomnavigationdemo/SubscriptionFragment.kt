package com.tw.custombottomnavigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tw.custombottomnavigationdemo.databinding.FragmentHomeBinding


class SubscriptionFragment : Fragment() {


    lateinit var binding: FragmentHomeBinding
    val TAG:String = this.javaClass.simpleName

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.tvTitle.text = "Subscription Screen"
        return binding.root
    }


}