package com.example.pong;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Player1(View view) {
        setContentView(R.layout.activity_player_name);
        startActivity(new Intent(this,PlayerName.class));
    }

    public void Player2(View view) {
        setContentView(R.layout.activity_player_name);
        startActivity(new Intent(this,PlayerName.class));
    }

}