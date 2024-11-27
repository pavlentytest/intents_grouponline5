package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               doSmth();
            }
        });
    }

    public void goToMainAcitivity2() {
        String name = binding.editText.getText().toString();
        // явное намерение - явный Intent
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("key",name);
        startActivity(intent);
    }

    public void doSmth() {
        // открыть ссылку в браузере
        // неявное намерение - неявный Intent
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+73474734023"));
        startActivity(intent);

        // Мини-задание
        // 1 - неявное намерение - набор номера телефона
        // 2 - неявное намерение - показать географические координаты
    }

}