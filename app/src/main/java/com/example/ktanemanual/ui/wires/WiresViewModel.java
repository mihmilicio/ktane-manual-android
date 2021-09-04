package com.example.ktanemanual.ui.wires;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WiresViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public WiresViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is wires fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
