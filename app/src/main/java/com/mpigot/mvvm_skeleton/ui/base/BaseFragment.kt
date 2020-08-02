package com.mpigot.mvvm_skeleton.ui.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment


abstract class BaseFragment : Fragment() {

    private var activity : BaseActivity? = null
    private var binding : Any? = null
    private lateinit var rootView : View

    /**
     * Override for set binding variable
     *
     * @return variable id
     */
    abstract fun getBindingVariable(): Int

    /**
     * @return layout resource id
     */
    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        rootView = (binding as ViewDataBinding).root
        return rootView
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity) {
            this.activity = context
            activity?.onFragmentAttached()
        }
    }

    override fun onDetach() {
        activity = null
        super.onDetach()
    }

    fun setUp() {
        setUpUi()
        setUpObserver()
        setUpViewModel()
    }

    abstract fun setUpUi()
    abstract fun setUpObserver()
    abstract fun setUpViewModel()

    fun getBaseActivity() : BaseActivity? {
        return activity
    }

    fun getViewDataBinding() : Any? {
        return binding
    }

    fun hideKeyboard() {
        if (activity != null) {
            activity?.hideKeyboard()
        }
    }

    fun isNetworkConnected() : Boolean {
        return (activity != null && activity!!.isNetworkConnected())
    }
}
