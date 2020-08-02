package com.mpigot.mvvm_skeleton.ui.base

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.mpigot.mvvm_skeleton.R
import com.mpigot.mvvm_skeleton.databinding.ActivityBaseBinding
import com.mpigot.mvvm_skeleton.ui.login.LoginFragment
import com.mpigot.mvvm_skeleton.utils.NetworkUtils

abstract class BaseActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setupBinding()
        setContentView(binding.root)
    }

//    fun setupViewModel() {
//        viewModel = ViewModelProviders.of(this).get(BaseViewModel::class.java)
//    }

    private fun setupBinding() {
        binding = ActivityBaseBinding.inflate(layoutInflater)
    }

    fun onFragmentAttached() {

    }

    fun onFragmentDetached(tag : String) {

    }

    fun hideKeyboard() {
        val view : View? = this.currentFocus
        val imm : InputMethodManager? = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm?.hideSoftInputFromWindow(view?.windowToken, 0)
    }

    fun isNetworkConnected() : Boolean {
        return NetworkUtils.isNetworkConnected(applicationContext)
    }

    fun openNewFragment(fragment : BaseFragment) {
        val manager : FragmentManager = supportFragmentManager
        val transaction : FragmentTransaction = manager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun openFragmentOnTokenExpire() {
        openNewFragment(LoginFragment())
    }
}