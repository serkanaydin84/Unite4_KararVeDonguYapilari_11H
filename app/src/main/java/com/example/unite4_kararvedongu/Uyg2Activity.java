package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {

    EditText txtSayi1;
    EditText txtSayi2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);

        txtSayi1 = findViewById(R.id.txtSayi1);
        txtSayi2 = findViewById(R.id.txtSayi2);
    }

    public void kontrolEt(View view){
        int sayi1 = Integer.parseInt(txtSayi1.getText().toString());
        int sayi2 = Integer.parseInt(txtSayi2.getText().toString());

        if (sayi1 > sayi2) {
            Toast.makeText(this, "1.sayı büyüktür", Toast.LENGTH_LONG).show();
        }

        if (sayi2 > sayi1){
            Toast.makeText(this, "2.sayı büyüktür", Toast.LENGTH_LONG).show();
        }

        if (sayi1 == sayi2){
            Toast.makeText(this, "Sayılar eşittir", Toast.LENGTH_LONG).show();
        }
    }
}













