package com.example.unite4_kararvedongu;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
    }

    @Override
    protected void onResume() {
        super.onResume();

        for (int i = 1; i <= 100; i+=3) {
            System.out.println(i);
        }
    }
}
