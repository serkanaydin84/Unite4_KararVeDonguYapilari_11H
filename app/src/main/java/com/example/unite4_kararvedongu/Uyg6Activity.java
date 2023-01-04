package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity{

    EditText txtAy;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);

        txtAy = findViewById(R.id.txtAy);
        textView = findViewById(R.id.textView);
    }

    public void btnOnayla(View view){
        int sayiAy = Integer.parseInt(txtAy.getText().toString());
        String ay = "";
        txtAy.setText("");

        switch (sayiAy){
            case 1:
                ay = "Ocak";
                break;
            case 2:
                ay = "Şubat";
                break;
            case 3:
                ay = "Mart";
                break;
            case 4:
                ay = "Nisan";
                break;
            case 5:
                ay = "Mayıs";
                break;
            case 6:
                ay = "Haziran";
                break;
            case 7:
                ay = "Temmuz";
                break;
            case 8:
                ay = "Ağustos";
                break;
            case 9:
                ay = "Eylül";
                break;
            case 10:
                ay = "Ekim";
                break;
            case 11:
                ay = "Kasım";
                break;
            case 12:
                ay = "Aralık";
                break;
            default:
                ay = "Hatalı Bilgi";
                break;
        }

        textView.setText(ay);
    }
}
