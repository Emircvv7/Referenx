package com.example.referenx;

import static android.os.Build.VERSION_CODES.O;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.referenx.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public  class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();

    public ContinentFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        ContinentAdapter continentAdapter = new ContinentAdapter(continentList, this);
        binding.rvContinent.setAdapter(continentAdapter);
    }

    private void loadData() {
        continentList.add(new ContinentModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1HNpsOshYPbYb9VFwvGckebOx_GzelW_rqA&usqp=CAU", "Eurasia"));
        continentList.add(new ContinentModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxevYXMptO2AVXfLlGNQch2hlqAFTJ-uzbLQ&usqp=CAU", "Africa"));
        continentList.add(new ContinentModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTppEIK2ivNCz6k4NTDccssaSn_MTQZuNvqzA&usqp=CAU", "North America"));
        continentList.add(new ContinentModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRF48W_CSCo_F-IGAC7uDXYNjSMxaxbGZEQUA&usqp=CAU", "South America"));
        continentList.add(new ContinentModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTH7u0YilY1S6R2bQUJMe5DKzDpHjIfcvu1Pw&usqp=CAU", "Australia"));
        continentList.add(new ContinentModel("https://avatars.mds.yandex.net/i?id=fcfbbdea42bda6cf74a6f86644a32c5d-4255243-images-thumbs&n=13", "Antarctica"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("Country", position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, countryFragment)
                .addToBackStack(null)
                .commit();

    }
    }





