package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView show_count;
    private int num = 0;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("PRUEBAS", num);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_count = (TextView) findViewById(R.id.show_count);

        if (savedInstanceState != null) {
            num = savedInstanceState.getInt("PRUEBAS", 0);
            show_count.setText(String.valueOf(num));
        }
    }

    public void count (View view){
        show_count.setText(String.valueOf(++num));
    }

    public void toast (View view){
        Toast.makeText(getApplicationContext(), show_count.getText(), Toast.LENGTH_SHORT).show();
    }
}