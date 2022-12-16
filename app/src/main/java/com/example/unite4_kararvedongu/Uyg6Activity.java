package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {

    EditText txtAy;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);

        txtAy = findViewById(R.id.txtAy);
        textView = findViewById(R.id.textView);
    }

    public void btnOnayla(View view) {
        int sayiAy = Integer.parseInt(txtAy.getText().toString());
        String ay = "";
        txtAy.setText("");

        switch (sayiAy) {
            case 1:
                ay = "OCAK";
                break;
            case 2:
                ay = "ŞUBAT";
                break;
            case 3:
                ay = "MART";
                break;
            case 4:
                ay = "NİSAN";
                break;
            case 5:
                ay = "MAYIS";
                break;
            case 6:
                ay = "HAZİRAN";
                break;
            case 7:
                ay = "TEMMUZ";
                break;
            case 8:
                ay = "AĞUSTOS";
                break;
            case 9:
                ay = "EYLÜL";
                break;
            case 10:
                ay = "EKİM";
                break;
            case 11:
                ay = "KASIM";
                break;
            case 12:
                ay = "ARALIK";
                break;
            default:
                ay = "YANLIŞ BİLGİ";
        }

        textView.setText(ay);
    }
}
