package com.dev.compsolu.screen

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RequestListScreen : Fragment() {

    companion object {
        fun newInstance() : RequestListScreen{
            return RequestListScreen()
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        var rootview : View =  inflater.inflate(R.layout.requestlist_item,container,false)
        return rootview
    }


}