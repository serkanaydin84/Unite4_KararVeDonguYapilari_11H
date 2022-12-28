package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    EditText txtKulAdi, txtSifre;

    final String kullaniciAdi = "Serkan";
    final String sifre = "123";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);

        txtKulAdi = findViewById(R.id.txtUser);
        txtSifre = findViewById(R.id.txtPass);
    }

    public void btnLogin(View view){
        String kuladi = txtKulAdi.getText().toString();
        String sifre = txtSifre.getText().toString();

        if (kullaniciAdi.equals(kuladi) && sifre.equals(sifre)) {
            Toast.makeText(this, "Giriş başarılı", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Giriş BAŞARISIZ", Toast.LENGTH_LONG).show();

        }
    }
}
