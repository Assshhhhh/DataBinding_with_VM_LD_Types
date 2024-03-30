package com.example.databinding_with_vm_ld_types

import androidx.databinding.InverseMethod
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    /*
    // Cannot use for Two Way Data Binding
    private val quoteLiveDataObject = MutableLiveData<String>("What you give is what you get")
    val quoteLiveData: LiveData<String>
        get() = quoteLiveDataObject
    */

    val quoteLiveData = MutableLiveData<String>("What you give is what you get")

    fun updateQuote() {
        quoteLiveData.value = "You'll see it when you believe it"
    }

}