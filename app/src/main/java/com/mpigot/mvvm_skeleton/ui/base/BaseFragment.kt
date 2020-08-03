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
import androidx.lifecycle.ViewModelProviders
import java.lang.reflect.ParameterizedType


abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel> : Fragment() {

    private var activity : BaseActivity<*, *>? = null
    private lateinit var rootView : View

    abstract var binding : T
    abstract var viewModel : V


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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
    }

    override fun onAttach(activity: Context?) {
        super.onAttach(activity)
        if (activity is BaseActivity<*, *>) {
            this.activity = activity
            this.activity?.onFragmentAttached()
        }
    }

    override fun onDetach() {
        activity = null
        super.onDetach()
    }

    private fun setUp() {
        setUpViewModel()
        setUpObserver()
        setUpBinding()
        setUpUi()
    }

    abstract fun setUpUi()
    abstract fun setUpObserver()
    private fun setUpViewModel() {
        viewModel = ViewModelProviders.of(this).get(BaseViewModel::class.java)
    }
    private fun setUpBinding() {
        binding.setVariable(getBindingVariable(), viewModel)
        binding.lifecycleOwner = this
        binding.executePendingBindings()
    }

    fun getBaseActivity() : BaseActivity<*, *>? {
        return activity
    }

    fun getViewDataBinding() : T {
        return binding
    }

    fun hideKeyboard() {
            activity?.hideKeyboard()
    }

    fun isNetworkConnected() : Boolean {
        return (activity != null && activity?.isNetworkConnected() ?: false)
    }

    interface CallBack {
        fun onFragmentAttached()
        fun onFragmentDetached(tag : String)
    }
}
