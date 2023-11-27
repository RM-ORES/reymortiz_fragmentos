package com.example.reymortiz_fragmentos.ui.thirdNav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.reymortiz_fragmentos.databinding.SeventhFragmentBinding

class SeventhFragment : Fragment() {
    private var _binding: SeventhFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = SeventhFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            botonSeptimo.setOnClickListener {
                val action = SeventhFragmentDirections.actionSeventhFragmentToEighthFragment()
                findNavController().navigate(action)
            }
        }
    }
}