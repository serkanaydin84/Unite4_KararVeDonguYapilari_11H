package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {

    EditText txtMulti;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);

        txtMulti = findViewById(R.id.txtMulti);
    }

    public void btnCift(View view){
        txtMulti.setText("");

        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                txtMulti.setText(txtMulti.getText() + "\n" + i);
            }
        }
    }

    public void btnTek(View view){
        txtMulti.setText("");

        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 1) {
                txtMulti.setText(txtMulti.getText() + "\n" + i);
            }
        }
    }

    public void btnTum(View view){
        txtMulti.setText("");

        for (int i = 0; i <= 15; i++) {
            txtMulti.setText(txtMulti.getText() + "\n" + i);
        }
    }
}
