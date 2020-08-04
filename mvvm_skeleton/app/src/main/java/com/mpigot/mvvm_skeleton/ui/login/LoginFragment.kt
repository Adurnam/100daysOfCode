package com.mpigot.mvvm_skeleton.ui.login

import com.mpigot.mvvm_skeleton.R
import com.mpigot.mvvm_skeleton.databinding.FragmentLoginBinding
import com.mpigot.mvvm_skeleton.ui.base.BaseFragment

class LoginFragment() : BaseFragment<FragmentLoginBinding, LoginViewModel>() {

    override lateinit var binding : FragmentLoginBinding
    override lateinit var viewModel: LoginViewModel

    override fun getBindingVariable(): Int {
        return 0
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_login
    }

    override fun setUpUi() {

    }

    override fun setUpObserver() {

    }
}