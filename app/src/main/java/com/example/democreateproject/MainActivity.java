package com.example.democreateproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String TAG = "hieuvh";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.anh_cua_ngan);
        imageView.setOnClickListener(view -> onClickImage());
    }

    private void onClickImage(){
        Toast.makeText(this, "Ban vua click vao anh", Toast.LENGTH_LONG).show();
    }
}