package com.example.panda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.panda.R

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val poster_res = inflater.inflate(R.id.rec_view, container, false)
        //poster_res.adapter = Poster_adapter(this, PosterList().list)
        //poster_res.textView.text = "hello"

        return inflater.inflate(R.layout.fragment_1, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        //val helloTextView: TextView = view.findViewById(R.id.hello_text)
        //helloTextView.setOnClickListener {
        //    helloTextView.text = "Hello Kitty"
        //}
    }
/*
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    */
}