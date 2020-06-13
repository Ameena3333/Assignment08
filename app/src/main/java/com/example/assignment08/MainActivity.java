package com.example.assignment08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   protected void onResume(){
        super.onResume();
       Toast.makeText(this,"THIS IS RESUME PHASE",Toast.LENGTH_SHORT).show();
   }
}
