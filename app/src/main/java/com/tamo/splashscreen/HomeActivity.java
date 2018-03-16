package com.tamo.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button newavatar = findViewById(R.id.button);
        Button newschedule = findViewById(R.id.button2);

        newavatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, NewEventActivity.class));
            }
        });

        newschedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, Avatar.class));
            }
        });


    }

    public void launchClick(View view){
        Intent intent = null;

        switch (view.getId())  {
            case R.id.button:
                intent = new Intent(HomeActivity.this, NewEventActivity.class);
                break;

            case R.id.button2:
                intent = new Intent(HomeActivity.this, Avatar.class);

        }
        startActivityForResult(intent, 0);
    }


}
