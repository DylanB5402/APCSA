package com.example.a201155623.synthesizer;
//Barva, Dylan
//Activity #5
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {

    private static final String TAG = SynthesizerActivity.class.getName();
    private static final int kWholeNote = 1000;
    private Button button1;
    private MediaPlayer mpE, mpF, mpA, mpB, mpC, mpD, mpEHigh, mpFHighSharp,mpCSharp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button1);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpD = MediaPlayer.create(this, R.raw.scalec);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpEHigh = MediaPlayer.create(this, R.raw.scalehighe);
        mpFHighSharp = MediaPlayer.create(this, R.raw.scalehighfs);
        mpCSharp = MediaPlayer.create(this, R.raw.scalecs);
    }

    public void onButton1Click(View view) {
        playNote(mpA);
        playNote(mpA);
        playNote(mpEHigh);
        playNote(mpEHigh);
        playNote(mpFHighSharp);
        playNote(mpFHighSharp);
        playNote(mpEHigh);
        playNote(mpD);
        playNote(mpD);
        playNote(mpCSharp);
        playNote(mpCSharp);
        playNote(mpB);
        playNote(mpB);
        playNote(mpA);
    }


    public void playNote(MediaPlayer mP) {
        mP.seekTo(0);
        mP.start();
        delayPlaying(kWholeNote);
    }

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }
}
