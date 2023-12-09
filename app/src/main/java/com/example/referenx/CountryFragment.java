package com.example.referenx;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.referenx.databinding.FragmentCountryBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private Integer Country;
    private ArrayList<CountryModel> countryList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Country = getArguments().getInt("Country");
        checkPosition(Country);
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(countryAdapter);

    }

    private void checkPosition(Integer Country) {
        if (Country == 0) {
            loadEurasia();
        } else if (Country == 1) {
            loadAfrica();
        } else if (Country == 2) {
            loadNorthAmerica();
        } else if (Country == 3) {
            loadSouthAmerica();
        } else if (Country == 4) {
            loadAustralia();
        } else if (Country == 5) {
            loadAntarctica();
        }
    }


    private void loadEurasia() {
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdtkwuiYIlgH1lLR6faCir17TTkI-2A9Etsg&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRB0emIDEXg5OahiAPjnqC21T29ZRDFKbvNfw&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsCJW5LIZ7WS6dlhcv_VxFfW_N6OqYog9qgg&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSidN6zIGXdSTgWh62nzn3fjr1R8Qbgsbdgtw&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQfr2Mij93rLMbOef_6sDXPXEjgqaoOV8iRw&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWnGyKCr7heT-NKu_QDHW6vUXjwCJhk7clbQ&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqFdzq7PaLPpGgHKU7JglhtZCAb0wtGfBZEQ&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3w3c29G_ZjgnuTLCSZb6hyUlH-Dg175RoMA&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlYIxJrIUboXvVLGMzukIckExRT9mIfa9rMw&usqp=CAU"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqGNOQCsCwWLGfG7VuCSR34O-EnT0OSpkaog&usqp=CAU"));
    }

    private void loadAfrica() {
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-QnV17pM9XtgEiOco7TPpOIw1xo2L0HEvZQ&usqp=CAU"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Flag_of_Uganda.svg/langru-1500px-Flag_of_Uganda.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/langru-1500px-Flag_of_Egypt.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Flag_of_Senegal.svg/langru-1500px-Flag_of_Senegal.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Flag_of_Ghana.svg/langru-1500px-Flag_of_Ghana.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/langru-1500px-Flag_of_Morocco.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/langru-1500px-Flag_of_Algeria.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Madagascar.svg/langru-1500px-Flag_of_Madagascar.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Flag_of_Somalia.svg/langru-1500px-Flag_of_Somalia.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Flag_of_Djibouti.svg/langru-1500px-Flag_of_Djibouti.svg.png&w=1200&q=50"));
    }


    private void loadNorthAmerica() {
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Flag_of_the_United_States.svg/langru-1500px-Flag_of_the_United_States.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Canada_%2528Pantone%2529.svg/langru-1500px-Flag_of_Canada_%2528Pantone%2529.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Flag_of_Panama.svg/langru-1500px-Flag_of_Panama.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Flag_of_Costa_Rica.svg/langru-1500px-Flag_of_Costa_Rica.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Paraguay.svg/langru-1500px-Flag_of_Paraguay.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/langru-1500px-Flag_of_Cuba.svg.png&w=1200&q=50"));
    }

    private void loadSouthAmerica() {
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/langru-1500px-Flag_of_Brazil.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/langru-1500px-Flag_of_Argentina.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/langru-1500px-Flag_of_Colombia.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Uruguay.svg/langru-1500px-Flag_of_Uruguay.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Flag_of_Chile.svg/langru-1500px-Flag_of_Chile.svg.png&w=1200&q=50"));
    }

    private void loadAustralia() {
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%2528converted%2529.svg/langru-1500px-Flag_of_Australia_%2528converted%2529.svg.png&w=1200&q=50"));
        countryList.add(new CountryModel("https://wikiwandv2-19431.kxcdn.com/_next/image?url=https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Flag_of_New_Zealand.svg/langru-1500px-Flag_of_New_Zealand.svg.png&w=1200&q=50"));
    }

    private void loadAntarctica() {
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Flag_of_the_Antarctic_Treaty.svg/180px-Flag_of_the_Antarctic_Treaty.svg.png"));
    }

}




