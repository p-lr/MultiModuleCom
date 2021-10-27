package com.example.featureb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.featureb.databinding.FragmentB1Binding

class FeatureB1 : Fragment() {
    private var binding: FragmentB1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentB1Binding.inflate(inflater, container, false)
        this.binding = binding
        binding.initViews()
        return binding.root
    }

    private fun FragmentB1Binding.initViews() {
        goToFeatureB2.setOnClickListener {
            findNavController().navigate(R.id.featureB2)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}