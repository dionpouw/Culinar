package com.jeflette.culinar.ui.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jeflette.culinar.R

class DetailRestaurantFragment : Fragment() {

    companion object {
        fun newInstance() = DetailRestaurantFragment()
    }

    private lateinit var viewModel: DetailRestaurantViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail_restaurant, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailRestaurantViewModel::class.java)
        // TODO: Use the ViewModel
    }

}