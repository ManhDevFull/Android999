package com.example.android;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome = findViewById(R.id.tvWelcome);

        // Nếu muốn lấy tên user từ LoginActivity thì có thể truyền qua Intent
        String username = getIntent().getStringExtra("username");
        if (username != null && !username.isEmpty()) {
            tvWelcome.setText("Xin chào, " + username + " !");
        }
    }
}
