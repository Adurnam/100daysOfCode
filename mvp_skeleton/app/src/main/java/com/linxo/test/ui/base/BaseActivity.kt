package com.linxo.test.ui.base

import android.os.Bundle
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.Unbinder
import com.linxo.test.utils.ProgressBarHandler

abstract class BaseActivity<V : IBaseActivityMvpView, T : IBaseActivityMvpPresenter<V>> : AppCompatActivity(), IBaseActivityMvpView {

    @get:LayoutRes
    protected abstract val layoutResourceId: Int

    protected lateinit var presenter: T
    private var unbinder: Unbinder? = null
    protected var progressBarHandler: ProgressBarHandler? = null

    /**
     * Init Resources and Presenter
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = setPresenter()
        setContentView(layoutResourceId)
        presenter.init(this as V)
        setUp()
    }

    abstract fun setPresenter() : T

    /**
     * SetUp
     */
    protected open fun setUp() {
        unbinder = ButterKnife.bind(this)
        setUpProgressBar()
    }

    private fun setUpProgressBar() {
        progressBarHandler = ProgressBarHandler(this,
            window.decorView.findViewById(android.R.id.content) as ViewGroup
        )
    }

    // [LifeCycle]
    // Link presenter and activity lifecycle

    override fun onDestroy() {
        super.onDestroy()
        unbinder!!.unbind()
    }

    override fun onStart() {
        super.onStart()
        presenter!!.onStart()
    }

    override fun onResume() {
        super.onResume()
        presenter!!.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter!!.onPause()
    }

    override fun onStop() {
        super.onStop()
        presenter!!.onStop()
    }

    // [LifeCycle]

    /**
     * Display loader to screen
     */
    override fun showLoading() {
        progressBarHandler!!.show()
    }

    /**
     * Hide loader to screen
     */
    override fun hideLoading() {
        progressBarHandler!!.hide()
    }
}