package com.georgia.akk1.georgiandrumpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    int sound1;
    int sound2;
    int sound3;
    int sound4;
    int sound5;
    int sound6;
    int sound7;
    int sound8;
    int sound9;
    int sound10;
    int sound11;
    int sound12;
    int sound13;
    int sound14;
    int sound15;
    int sound16;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        sound1 = sp.load(getApplicationContext(),R.raw.a1,1);
        sound2 = sp.load(getApplicationContext(),R.raw.a2,1);
        sound3 = sp.load(getApplicationContext(),R.raw.a3,1);
        sound4 = sp.load(getApplicationContext(),R.raw.a4,1);
        sound5 = sp.load(getApplicationContext(),R.raw.a5,1);
        sound6 = sp.load(getApplicationContext(),R.raw.a6,1);
        sound7 = sp.load(getApplicationContext(),R.raw.a7,1);
        sound8 = sp.load(getApplicationContext(),R.raw.a18,1);
        sound9 = sp.load(getApplicationContext(),R.raw.a9,1);
        sound10 = sp.load(getApplicationContext(),R.raw.a10,1);
        sound11 = sp.load(getApplicationContext(),R.raw.a11,1);
        sound12 = sp.load(getApplicationContext(),R.raw.a12,1);
        sound13 = sp.load(getApplicationContext(),R.raw.a13,1);
        sound14 = sp.load(getApplicationContext(),R.raw.a14,1);
        sound15 = sp.load(getApplicationContext(),R.raw.a15,1);
        sound16 = sp.load(getApplicationContext(),R.raw.a16,1);
    }



    public void playsound1(View v){
sp.play(sound1,1.0f,1.0f,0,0,10f);
    }
    public void playsound2(View v){
        sp.play(sound2,1.0f,1.0f,0,0,10f);
    }
    public void playsound3(View v){
        sp.play(sound3,1.0f,1.0f,0,0,10f);
    }
    public void playsound4(View v){
        sp.play(sound4,1.0f,1.0f,0,0,10f);
    }
    public void playsound5(View v){
        sp.play(sound5,1.0f,1.0f,0,0,10f);

    }
    public void playsound6(View v){
        sp.play(sound6,1.0f,1.0f,0,0,10f);
    }
    public void playsound7(View v){
        sp.play(sound7,1.0f,1.0f,0,0,10f);
    }
    public void playsound8(View v){
        sp.play(sound8,1.0f,1.0f,0,0,10f);
    }
    public void playsound9(View v){
        sp.play(sound9,1.0f,1.0f,0,0,10f);
    }
    public void playsound10(View v){
        sp.play(sound10,1.0f,1.0f,0,0,10f);
    }
    public void playsound11(View v){
        sp.play(sound11,1.0f,1.0f,0,0,10f);
    }
    public void playsound12(View v){
        sp.play(sound12,1.0f,1.0f,0,0,10f);
    }
    public void playsound13(View v){
        sp.play(sound13,1.0f,1.0f,0,0,10f);
    }
    public void playsound14(View v){
        sp.play(sound14,1.0f,1.0f,0,0,10f);
    }
    public void playsound15(View v){
        sp.play(sound15,1.0f,1.0f,0,0,10f);
    } public void playsound16(View v){
        sp.play(sound16,1.0f,1.0f,0,0,10f);
    }

}
