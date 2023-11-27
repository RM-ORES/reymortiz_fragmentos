package com.example.reymortiz_fragmentos.ui.firstNav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.reymortiz_fragmentos.databinding.SecondFragmentBinding

class SecondFragment : Fragment() {
    private var _binding: SecondFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = SecondFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            botonSegundo.setOnClickListener {
                val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
                findNavController().navigate(action)
            }
            botonAtras.setOnClickListener {
                val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
                findNavController().navigate(action)
            }
        }
    }
}