package com.example.tiendamovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tiendamovil.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View v = mainBinding.getRoot();
        setContentView(v);
    }
    

    public void login(View view){
        String email = mainBinding.etEmail.getText().toString();
        String password = mainBinding.etPassword.getText().toString();
        Intent intent = new Intent(MainActivity.this,ProcessActivity.class);
        intent.putExtra("email",email);
        intent.putExtra("password",password);
        startActivity(intent);
        Toast.makeText(MainActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
    }
    public void register(View view){
        Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(intent);
        finish();
    }
}