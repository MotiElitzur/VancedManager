package com.vanced.manager.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.vanced.manager.R
import com.vanced.manager.databinding.FragmentVancedChangelogBinding

class VancedChangelogFragment : Fragment() {

    private lateinit var binding: FragmentVancedChangelogBinding
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_vanced_changelog, container, false)
        return binding.root
    }

}
