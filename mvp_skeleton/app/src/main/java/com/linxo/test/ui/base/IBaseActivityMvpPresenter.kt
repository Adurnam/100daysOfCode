package com.linxo.test.ui.base

import android.app.Activity

interface IBaseActivityMvpPresenter<V : IBaseActivityMvpView> {

    fun init(activity: V)

    fun getActivity() : Activity

    fun onStart()

    fun onResume()

    fun onPause()

    fun onStop()
}