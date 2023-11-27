package com.example.reymortiz_fragmentos.ui.secondNav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.reymortiz_fragmentos.databinding.FifthFragmentBinding

class FifthFragment : Fragment() {
    private var _binding: FifthFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = FifthFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            botonQuinto.setOnClickListener {
                val action = FifthFragmentDirections.actionFifthFragmentToSixthFragment()
                findNavController().navigate(action)
            }
            botonAtras.setOnClickListener {
                val action = FifthFragmentDirections.actionFifthFragmentToFourthFragment()
                findNavController().navigate(action)
            }
        }
    }
}