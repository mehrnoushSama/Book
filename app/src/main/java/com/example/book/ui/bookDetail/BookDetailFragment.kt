package com.example.book.ui.bookDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.book.R
import com.example.book.databinding.FragmentBookDetailBinding


class BookDetailFragment : Fragment() {

    private var _binding: FragmentBookDetailBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: BookDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(BookDetailViewModel::class.java)
        _binding = FragmentBookDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        //return inflater.inflate(R.layout.fragment_book_detail, container, false)
        return view
    }

}