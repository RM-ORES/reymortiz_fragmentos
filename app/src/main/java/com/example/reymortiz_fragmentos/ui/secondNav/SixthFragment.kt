package com.example.reymortiz_fragmentos.ui.secondNav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.reymortiz_fragmentos.databinding.SixthFragmentBinding

class SixthFragment : Fragment() {
    private var _binding: SixthFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = SixthFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            botonSexto.setOnClickListener {
                val action = SixthFragmentDirections.actionSixthFragmentToFourthFragment()
                findNavController().navigate(action)
            }
            botonAtras.setOnClickListener {
                val action = SixthFragmentDirections.actionSixthFragmentToFifthFragment()
                findNavController().navigate(action)
            }
        }
    }
}