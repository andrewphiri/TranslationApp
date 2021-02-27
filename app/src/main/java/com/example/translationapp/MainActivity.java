package com.example.translationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.nfc.Tag;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.translationapp.R;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    public void playPhrase (View view) {
      Button buttonPressed = (Button) view;
      Log.i("button pressed",buttonPressed.getTag().toString());

      mediaPlayer = MediaPlayer.create(this,getResources().getIdentifier(buttonPressed.getTag().toString(),"raw",getPackageName()));
      mediaPlayer.start();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}