package com.example.arnausilberman.projectmedusa.database.Connection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.arnausilberman.projectmedusa.R;


public class MainActivity2 extends AppCompatActivity {

    Button server,clint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connection_layout);
        server=(Button) findViewById(R.id.server);
        clint=(Button) findViewById(R.id.clint);

        server.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this,MainServer.class);
                startActivity(i);
            }
        });
        clint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity2.this,MainClint.class);
                startActivity(i);
            }
        });
    }
}
