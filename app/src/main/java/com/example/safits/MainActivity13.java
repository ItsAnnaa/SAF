package com.example.safits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }

    public void tanaman(View view) {
            Intent intent = new Intent(MainActivity13.this, TanamanActivity.class);
            startActivity(intent);

        }

    public void keperluan(View view) {
        Intent intent = new Intent(MainActivity13.this, PeralatanActivity.class);
        startActivity(intent);

    }

    public void peralatan(View view) {
        Intent intent = new Intent(MainActivity13.this, KeperluanActivity.class);
        startActivity(intent);

    }

    public void tugas(View view) {
        Intent intent = new Intent(MainActivity13.this, TugasActivity.class);
        startActivity(intent);

    }
}
