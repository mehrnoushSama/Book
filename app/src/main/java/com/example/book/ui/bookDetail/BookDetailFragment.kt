package com.example.book.ui.bookDetail

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.book.databinding.FragmentBookDetailBinding
import com.example.book.model.Author
import dagger.hilt.android.AndroidEntryPoint
import java.net.URL


@AndroidEntryPoint
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

        viewModel.getBookDetail()
        viewModel.bookDetail.observe(viewLifecycleOwner) {

            binding.apply {
                bookTitle.setText(it.fullDetail.bookTitle)
                Glide.with(this@BookDetailFragment).load(it.fullDetail.iconUrl).into(bookImg)
                titleTxt.setText(it.fullDetail.bookTitle)
                authorTxt.setText(getAuthorNames(it.authors))
                pagesTxt.setText(it.fullDetail.pageCount)
                descriptionTxt.setText(it.fullDetail.fullDescription)

            }

        }
        return view
    }


    private fun getAuthorNames(authors: List<Author>): String {
        var res: String = ""
        for ((index, auth) in authors.withIndex()) {
            res += "${auth.authorFullName}"
            if (index != authors.count())
                res += " , "
        }
        return res
    }

}