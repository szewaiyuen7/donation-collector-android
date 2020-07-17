package com.flagcamp.donationcollector.ui.ngo.calendar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.flagcamp.donationcollector.databinding.FragmentCalendarNgoBinding;

public class CalendarNGOFragment extends Fragment {
    private FragmentCalendarNgoBinding binding;

    public CalendarNGOFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentCalendarNgoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}