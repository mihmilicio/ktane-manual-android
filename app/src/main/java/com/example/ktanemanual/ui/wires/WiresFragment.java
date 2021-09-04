package com.example.ktanemanual.ui.wires;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ktanemanual.databinding.FragmentWiresBinding;

public class WiresFragment extends Fragment {
    private WiresViewModel wiresViewModel;
    private FragmentWiresBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wiresViewModel =
                new ViewModelProvider(this).get(WiresViewModel.class);

        binding = FragmentWiresBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textWires;
        wiresViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
