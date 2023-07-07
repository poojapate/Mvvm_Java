package com.example.mvvmjava.RecycleAuth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.viewpager.widget.ViewPager;

public class PrimeViewModel extends ViewModel {
    PrimeRepository primeRepository;

    public PrimeViewModel() {

        primeRepository=new PrimeRepository();
    }

    public LiveData<GetListPrimeVideoModel>callrecmain(){
        return primeRepository.callprimeM();
    }
}
