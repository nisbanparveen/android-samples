package com.example.communicationbtwfragments.View;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.communicationbtwfragments.ViewModel.SharedViewModel;
import com.example.communicationbtwfragments.Model.Sort;
import com.example.communicationbtwfragments.Model.SortAlgo;
import com.example.communicationbtwfragments.databinding.FragmentBBinding;

import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentB#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentB extends Fragment {


    public FragmentB() {
        // Required empty public constructor
    }

    public static FragmentB newInstance() {
        return new FragmentB();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    private FragmentBBinding binding;
    SharedViewModel viewModel;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        viewModel.getMessage().observe(getViewLifecycleOwner(), this::showData);
        viewModel.getSort().observe(getViewLifecycleOwner(),sort -> {
            binding.sortAscending.setText(Arrays.toString(sort.getSortAscending()));
            binding.sortDescending.setText(Arrays.toString(sort.getSortDescending()));
        });
        return view;
    }

    void showData(String input) {
        Sort sort= SortAlgo.sort(input);
        viewModel.sort.setValue(sort);
        binding.sortAscending.setText(Arrays.toString(sort.getSortAscending()));
        binding.sortDescending.setText(Arrays.toString(sort.getSortDescending()));
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}