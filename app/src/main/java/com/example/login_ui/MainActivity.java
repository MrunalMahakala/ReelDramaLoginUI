package com.example.login_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
Button signin;
Toolbar toolbar;

Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.custom_toolbar);
register=findViewById(R.id.register);
register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(MainActivity.this,step1.class);
        startActivity(intent);
    }
});

    }
}