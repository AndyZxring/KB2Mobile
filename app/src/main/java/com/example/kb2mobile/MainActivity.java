package com.example.kb2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView pendaftaranBtn, newsBtn, aboutBtn,contactBtn;

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



        pendaftaranBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pendaftaran = new Intent(getApplicationContext(), PendaftaranActivity.class);
                startActivity(pendaftaran);
            }
        });
    }


}