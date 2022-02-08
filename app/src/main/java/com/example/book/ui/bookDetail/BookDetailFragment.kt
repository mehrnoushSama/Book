package com.example.book.ui.bookDetail

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.service.autofill.Transformation
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.book.MainActivity
import com.example.book.R
import com.example.book.databinding.FragmentBookDetailBinding
import com.example.book.model.Author
import dagger.hilt.android.AndroidEntryPoint


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
            if (it == null)
                AlertDialog.Builder(context).setTitle(getString(R.string.error))
                    .setMessage(getString(R.string.error_receiving_information))
                    .setPositiveButton(
                        "دوباره تلاش کن",
                        DialogInterface.OnClickListener { dialogInterface, i -> viewModel.getBookDetail() })
                    .setNegativeButton(
                        "انصراف",
                        DialogInterface.OnClickListener { dialogInterface, i -> back() })
                    .show()
            else
                binding.apply {
                    progressBar.visibility = View.GONE
                    layoutMain.visibility = View.VISIBLE
                    classifiedTxt.text = "6420"
                    bookTitle.text = it.result.fullDetail.bookTitle
                    titleTxt.text = it.result.fullDetail.bookTitle
                    authorTxt.text = getAuthorNames(it.result.authors)
                    pagesTxt.text = "${it.result.fullDetail.pageCount}"
                    descriptionTxt.text = Html.fromHtml(it.result.fullDetail.fullDescription)
                    backBtn.setOnClickListener {
                        back()
                    }
                    Glide.with(this@BookDetailFragment).load(it.result.fullDetail.iconUrl)
                        .into(bookImg)
                }
        }
        return view
    }

    fun back() {
        startActivity(Intent(context, MainActivity::class.java))
    }


    private fun getAuthorNames(authors: List<Author>): String {
        var res: String = ""
        for ((index, auth) in authors.withIndex()) {
            res += "${auth.authorFullName}"
            if (index != authors.count() - 1)
                res += " , "
        }
        return res
    }

}