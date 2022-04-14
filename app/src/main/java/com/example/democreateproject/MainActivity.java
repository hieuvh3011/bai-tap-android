package com.example.democreateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOpenWeb;
    Button btnOpenMap;
    Button btnShareText;

    final String urlToOpen = "https://developer.android.com/codelabs/android-training-activity-with-implicit-intent?index=..%2F..%2Fandroid-training#3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvents();
    }

    private void initView() {
        btnOpenMap = findViewById(R.id.btn_open_map);
        btnOpenWeb = findViewById(R.id.btn_open_web);
        btnShareText = findViewById(R.id.btn_share_text);
    }

    private void initEvents() {
        btnOpenWeb.setOnClickListener(view -> openWeb());
        btnOpenMap.setOnClickListener(view -> openMap());
        btnShareText.setOnClickListener(view -> shareText());
    }

    private void openWeb(){
        Uri webpage = Uri.parse(urlToOpen);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    private void openMap(){
        String latitude = "21.006257";
        String longitude = "105.843160";
        Uri addressUri = Uri.parse("geo:0,0?q=\""+latitude+","+longitude+"\"");
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
    }

    private void shareText(){
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(getString(R.string.example_text))
                .startChooser();

    }

}