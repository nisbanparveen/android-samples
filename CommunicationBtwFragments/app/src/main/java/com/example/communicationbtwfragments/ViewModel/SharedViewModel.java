package com.example.communicationbtwfragments.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.communicationbtwfragments.Model.Sort;

public class SharedViewModel extends ViewModel {
    public MutableLiveData<String> message=  new MutableLiveData<String>();
    public MutableLiveData<String> getMessage() {
        return message;
    }

    MutableLiveData<Sort> sort= new MutableLiveData<>();
    public MutableLiveData<Sort> getSort(){
        return sort;
    }
}
