package com.example.kb2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView pendaftaranBtn, newsBtn, aboutBtn,contactBtn;
    AppCompatButton daftarBtn, hubungiBtn;
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
        pendaftaranBtn = (TextView) findViewById(R.id.pendaftaranBtn);
        newsBtn = (TextView) findViewById(R.id.newsBtn);
        aboutBtn = (TextView) findViewById(R.id.aboutBtn);
        contactBtn = (TextView) findViewById(R.id.contactBtn);
        daftarBtn = (AppCompatButton) findViewById(R.id.daftarBtn);
        hubungiBtn = (AppCompatButton) findViewById(R.id.hubungiBtn);


        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(getApplicationContext(), ContactActivity.class);
                startActivity(contact);
            }
        });
        hubungiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hubungi1 = new Intent(getApplicationContext(), ContactActivity.class);
                startActivity(hubungi1);
            }
        });


        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(getApplicationContext(), AboutusActivity.class);
                startActivity(about);
            }
        });
        daftarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar = new Intent(getApplicationContext(),DaftarbActivity.class);
                startActivity(daftar);
            }
        });
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(getApplicationContext(),AboutusActivity.class);
                startActivity(about);
            }
        });
        newsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent news = new Intent(getApplicationContext(),NewsActivity.class);
                startActivity(news);
            }
        });
        pendaftaranBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pendaftaran = new Intent(getApplicationContext(), PendaftaranActivity.class);
                startActivity(pendaftaran);
            }
        });
    }
}