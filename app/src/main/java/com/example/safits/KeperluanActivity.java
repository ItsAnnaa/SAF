package com.example.safits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KeperluanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keperluan);
    }
    public void kembali(View view) {
        Intent intent = new Intent(KeperluanActivity.this, MainActivity13.class);
        startActivity(intent);

    }

}