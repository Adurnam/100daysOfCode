package com.mpigot.mvvm_skeleton

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.mpigot.mvvm_skeleton.databinding.ActivitySplashBinding
import com.mpigot.mvvm_skeleton.ui.base.BaseActivity
import com.mpigot.mvvm_skeleton.ui.login.LoginFragment


class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupUI()
    }

    private fun setupUI() {
        val manager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.fragment_container, LoginFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun setupBinding() {
        val binding =
            DataBindingUtil.setContentView<ActivitySplashBinding>(this, R.layout.activity_splash)
    }

    override fun onFragmentAttached() {

    }

    override fun onFragmentDetached(tag: String) {

    }
}
