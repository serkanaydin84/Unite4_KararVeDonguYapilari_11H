package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    EditText txtUserName, txtPassword;

    //Global değişkenler
    final String userName = "BomberMan";
    final String password = "123";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);

        txtUserName = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPass);
    }

    public void btnLogin(View view) {
        if (userName.equals(txtUserName.getText().toString()) && password.equals(txtPassword.getText().toString())) {
            Toast.makeText(this, "Hadi yine iyisi giriş yapabildin, Artist", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Kullanıcı Adın veya şifren hatalı, ne işin var buralarda", Toast.LENGTH_LONG).show();
        }
    }
}
