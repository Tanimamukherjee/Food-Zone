package com.example.foodzone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.foodzone.Adapters.MainAdapter;
import com.example.foodzone.Models.MainModel;
import com.example.foodzone.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

      ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.pizza, "Pizza" , "180" , "The offer to download the coupons ends Thursday!"));
        list.add(new MainModel(R.drawable.burger , "Burger" , "150" , "Chicken Burger with extra cheese."));

        list.add(new MainModel(R.drawable.por , "Portobello Mushroom" , "120" , "Meaty portobello mushroom make for the perfect vegetarian burger!"));
        list.add(new MainModel(R.drawable.boc , "Pizza Burger" , "200" , "Burger O'clock is available to satiate your hunger!"));
        list.add(new MainModel(R.drawable.momo , "Veg Momo" , "50" , "It is plain flour based dumplings steamed with cabbage,carrot and spring onion stuffing."));
        list.add(new MainModel(R.drawable.chickenmomo , "Chicken Momo" , "100" , "These dumplings are soft and juicy and are traditionally steamed."));
        list.add(new MainModel(R.drawable.momochicken , "Chicken Cheese Momo" , "120" , "Chicken cheese momo blends cheesy taste and delectable chicken."));
        list.add(new MainModel(R.drawable.coldrinksburger , "Chicken Burger" , "150" , "Crispy Chicken Burgers are hot, tangy, spicy and crunchy!"));
        list.add(new MainModel(R.drawable.vegnoodles, "Veg Schezwan Noodles" , "100" , "Vegetable noodles is a healthy Chinese inspired dish."));
        list.add(new MainModel(R.drawable.hakkanoodles , "Hakka Noodles" , "180" , "Hakka noodles are Indian-Chinese style noodles."));
        list.add(new MainModel(R.drawable.eggchickennoodles , "Mixed Noodles" , "200" , "Mixed noodles is always a versatile Chinese recipe!"));





        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}