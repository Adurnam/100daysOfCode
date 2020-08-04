package com.linxo.test.ui.base

import android.app.Activity
import com.linxo.test.utils.DisposableManager

abstract class BaseActivityPresenter<V : IBaseActivityMvpView> : IBaseActivityMvpPresenter<V> {

    var disposableManager: DisposableManager = DisposableManager()
    lateinit var mvpView : V

    init {
        disposableManager = DisposableManager()
    }

    override fun init(activity: V) {
        mvpView = activity
    }

    override fun getActivity() : Activity {
        return mvpView as Activity
    }

    override fun onStart() {}

    override fun onResume() {}

    override fun onPause() {}

    override fun onStop() {
        disposableManager.dispose()
    }
}