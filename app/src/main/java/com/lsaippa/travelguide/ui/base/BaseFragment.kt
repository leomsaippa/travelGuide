package com.lsaippa.travelguide.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.lsaippa.travelguide.di.component.Injectable

open class BaseFragment: Fragment(), BaseView, Injectable {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
}