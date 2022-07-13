package com.iven.musicplayergo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.iven.musicplayergo.databinding.MainScreenBinding;
import com.iven.musicplayergo.fragments.MusicFragment;

public class MainActivity extends AppCompatActivity {

    MainScreenBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=MainScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadFrag(new MusicFragment());
    }


    public void loadFrag(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }




}
