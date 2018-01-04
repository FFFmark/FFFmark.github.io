package com.example.a50442.mypro.uitwo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a50442.mypro.R;

/**
 * Created by 50442 on 2018/1/3.
 */

public class fireFragment extends Fragment{
    public fireFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fire,container,false);
    }
}
