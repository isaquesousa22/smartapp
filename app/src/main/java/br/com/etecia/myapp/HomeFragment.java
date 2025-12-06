package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Pega a Toolbar do layout do fragment
        Toolbar toolbar = view.findViewById(R.id.toolbar);

        // Define a Toolbar como ActionBar da Activity
        ((AppCompatActivity) requireActivity()).setSupportActionBar(toolbar);

        // Permite que o fragment adicione itens no menu
        setHasOptionsMenu(true);
    }

}
