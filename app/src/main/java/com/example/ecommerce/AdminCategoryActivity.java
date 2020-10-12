package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ecommerce.databinding.ActivityAdminCategoryBinding;

public class AdminCategoryActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityAdminCategoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_admin_category);


        binding.femaleDresses.setOnClickListener(this);
        binding.glasses.setOnClickListener(this);
        binding.hatsCaps.setOnClickListener(this);
        binding.headphonesHandfree.setOnClickListener(this);
        binding.laptopPc.setOnClickListener(this);
        binding.mobilephones.setOnClickListener(this);
        binding.pursesBagsWallets.setOnClickListener(this);
        binding.shoes.setOnClickListener(this);
        binding.sportsTShirts.setOnClickListener(this);
        binding.sweathers.setOnClickListener(this);
        binding.tShirts.setOnClickListener(this);
        binding.watches.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.female_dresses:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","female_dresses");
                startActivity(intent);
                break;
            }case R.id.glasses:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","glasses");
                startActivity(intent);
                break;
            }case R.id.hats_caps:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","hats_caps");
                startActivity(intent);
                break;
            }case R.id.headphones_handfree:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","headphones_handfree");
                startActivity(intent);
                break;
            }case R.id.laptop_pc:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","laptop_pc");
                startActivity(intent);
                break;
            }case R.id.mobilephones:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","mobilephones");
                startActivity(intent);
                break;
            }case R.id.purses_bags_wallets:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","purses_bags_wallets");
                startActivity(intent);
                break;
            }case R.id.shoes:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","shoes");
                startActivity(intent);
                break;
            }case R.id.sports_t_shirts:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","sports_t_shirts");
                startActivity(intent);
                break;
            }case R.id.sweathers:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","sweathers");
                startActivity(intent);
                break;
            }case R.id.t_shirts:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","t_shirts");
                startActivity(intent);
                break;
            }case R.id.watches:{
                Intent intent = new Intent(AdminCategoryActivity.this,AdminPanelActivity.class);
                intent.putExtra("category","watches");
                startActivity(intent);
                break;
            }
        }
    }
}
