package com.example.reymortiz_fragmentos.ui.secondNav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.reymortiz_fragmentos.databinding.FourthFragmentBinding

class FourthFragment : Fragment() {
    private var _binding: FourthFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = FourthFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            botonCuarto.setOnClickListener {
                val action = FourthFragmentDirections.actionFourthFragmentToFifthFragment()
                findNavController().navigate(action)
            }
        }
    }
}