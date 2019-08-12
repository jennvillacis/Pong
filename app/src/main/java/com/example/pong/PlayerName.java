package com.example.pong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerName extends AppCompatActivity {

    private Button button;
    private TextView PlayerNameValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //assigning PlayerNameValue and Button fields so we can use them in onclick
        setContentView(R.layout.activity_player_name);
        PlayerNameValue = findViewById(R.id.PlayerNameValue);

        button = findViewById(R.id.submitPlayerNameButton);
        button.setOnClickListener(new View.OnClickListener( ) {

            @Override
            public void onClick(View v) {
                String playerName = PlayerNameValue.getText( ).toString( );

                Intent buttonIntent;
                buttonIntent = new Intent(getApplicationContext( ), LevelOne.class);
                buttonIntent.putExtra("playerName", playerName);

                startActivity(buttonIntent);

            }
        });
    }

}