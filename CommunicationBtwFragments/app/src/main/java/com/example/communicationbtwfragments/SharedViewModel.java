package com.example.communicationbtwfragments;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    MutableLiveData<String> message=  new MutableLiveData<String>();
    public MutableLiveData<String> getMessage() {
        return message;
    }

    MutableLiveData<Sort> sort= new MutableLiveData<>();
    public MutableLiveData<Sort> getSort(){
        return sort;
    }
}
