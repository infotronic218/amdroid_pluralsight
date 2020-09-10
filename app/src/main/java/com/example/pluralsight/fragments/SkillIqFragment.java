package com.example.pluralsight.fragments;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pluralsight.R;
import com.example.pluralsight.fragments.viewmodels.SkillIqViewModel;

public class SkillIqFragment extends Fragment {

    private SkillIqViewModel mViewModel;

    public static SkillIqFragment newInstance() {
        return new SkillIqFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.skill_iq_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SkillIqViewModel.class);
        // TODO: Use the ViewModel
    }

}