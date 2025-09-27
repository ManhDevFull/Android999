package com.example.android;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numberInput;
    Button btnCheck, btnRefresh;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        btnCheck = findViewById(R.id.btnCheck);
        btnRefresh = findViewById(R.id.btnRefresh);
        result = findViewById(R.id.result);

        btnCheck.setOnClickListener(v -> checkPrime());

        btnRefresh.setOnClickListener(v -> {
            numberInput.setText("");
            result.setText("");
        });
    }

    private void checkPrime() {
        String numStr = numberInput.getText().toString();

        if (numStr.isEmpty()) {
            result.setText("Vui lòng nhập một số");
            return;
        }

        int num = Integer.parseInt(numStr);

        if (num < 2) {
            result.setText(num + " không phải là số nguyên tố");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            result.setText(num + " là số nguyên tố");
        } else {
            result.setText(num + " không phải là số nguyên tố");
        }
    }
}
