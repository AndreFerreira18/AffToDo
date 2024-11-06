package com.afferreira.dev.todoapp.fragments.update

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.afferreira.dev.todoapp.R
import com.afferreira.dev.todoapp.databinding.FragmentUpdateBinding


class UpdateFragment : Fragment() {

    private var binding: FragmentUpdateBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding = FragmentUpdateBinding.inflate(inflater, container, false)
        this.binding = binding
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.update_fragment_menu, menu)
    }

}