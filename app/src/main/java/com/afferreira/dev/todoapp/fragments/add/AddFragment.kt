package com.afferreira.dev.todoapp.fragments.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.afferreira.dev.todoapp.R
import com.afferreira.dev.todoapp.databinding.FragmentAddBinding

class AddFragment : Fragment() {

    private var binding: FragmentAddBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding = FragmentAddBinding.inflate(inflater, container, false)
        this.binding = binding
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.add_fragment_menu, menu)
    }

}