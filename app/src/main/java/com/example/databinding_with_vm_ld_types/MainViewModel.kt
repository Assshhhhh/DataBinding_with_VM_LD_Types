package com.example.databinding_with_vm_ld_types

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val quoteLiveDataObject = MutableLiveData<String>("What you give is what you get")
    val quoteLiveData: LiveData<String>
        get() = quoteLiveDataObject

    fun updateQuote() {
        quoteLiveDataObject.value = "You'll see it when you believe it"
    }

}