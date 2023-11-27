package com.example.reymortiz_fragmentos.ui.thirdNav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.reymortiz_fragmentos.databinding.NinthFragmentBinding

class NinthFragment : Fragment() {
    private var _binding: NinthFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = NinthFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            botonNoveno.setOnClickListener {
                val action = NinthFragmentDirections.actionNinthFragmentToSeventhFragment()
                findNavController().navigate(action)
            }
            botonAtras.setOnClickListener {
                val action = NinthFragmentDirections.actionNinthFragmentToEighthFragment()
                findNavController().navigate(action)
            }
        }
    }
}