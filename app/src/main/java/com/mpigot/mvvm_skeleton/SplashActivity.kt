package com.mpigot.mvvm_skeleton

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.mpigot.mvvm_skeleton.ui.base.BaseActivity
import com.mpigot.mvvm_skeleton.ui.login.LoginFragment


class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupUI()
    }

    private fun setupUI() {
        val manager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.fragment_container, LoginFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
