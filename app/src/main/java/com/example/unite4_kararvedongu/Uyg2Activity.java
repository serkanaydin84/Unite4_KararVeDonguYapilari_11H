package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    EditText txtSayi1, txtSayi2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);

        txtSayi1 = findViewById(R.id.txtSayi1);
        txtSayi2 = findViewById(R.id.txtSayi2);
    }

    public void kontrolEt(View view) {
        
    }
}
