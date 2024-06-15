package com.mishraaditya.livedatas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private final MutableLiveData<String> _factMutable=new MutableLiveData<>("This is The Factual");


    public final MutableLiveData<String> factMute = _factMutable;
    public void updateLiveData(){
        _factMutable.setValue("TrueFriends");
    }

}
