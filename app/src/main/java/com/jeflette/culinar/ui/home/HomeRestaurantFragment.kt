package com.jeflette.culinar.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jeflette.culinar.R

class HomeRestaurantFragment : Fragment() {

    companion object {
        fun newInstance() = HomeRestaurantFragment()
    }

    private lateinit var viewModel: HomeRestaurantViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_restaurant, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeRestaurantViewModel::class.java)
        // TODO: Use the ViewModel
    }

}