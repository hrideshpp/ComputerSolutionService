package com.dev.compsolu.screen

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RequestDetailScreen : Fragment()
{
    companion object {
        fun newInstance() : RequestDetailScreen{
            return RequestDetailScreen();

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        var rootview : View =  inflater.inflate(R.layout.requestlist_detail,container,false);
        return rootview
    }
}