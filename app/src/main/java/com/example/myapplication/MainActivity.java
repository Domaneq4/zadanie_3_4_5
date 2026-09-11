package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void napiszCos(View view){
        TextView tekst= findViewById(R.id.napis);
        tekst.setText("przycisk klikniety przez 1 przycisk");
    }

    public void napisz(View view){
        TextView tekst= findViewById(R.id.napis);
        tekst.setText("przycisk klikniety przez 2 przycisk");
    }

    public void powrot(View view){
        TextView tekst= findViewById(R.id.napis);
        tekst.setText("brak kliknietego przycisku");
    }

    int licznik=0;


    public void odswiez(){
        TextView tekst= findViewById(R.id.napis2);
        tekst.setText(Integer.toString(licznik));
    }
    public void dodaj(View view){
        licznik+=1;
        odswiez();
    }

    public void odejmij(View view){
        licznik-=1;
        odswiez();
    }

    public void zero(View view){
        licznik=0;
        odswiez();
    }

}