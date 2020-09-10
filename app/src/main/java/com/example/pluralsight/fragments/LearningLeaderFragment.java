package com.example.pluralsight.fragments;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pluralsight.fragments.viewmodels.LearningLeaderViewModel;
import com.example.pluralsight.R;
public class LearningLeaderFragment extends Fragment {

    private LearningLeaderViewModel mViewModel;

    public static LearningLeaderFragment newInstance() {
        return new LearningLeaderFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.learning_leader_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LearningLeaderViewModel.class);
        // TODO: Use the ViewModel
    }

}