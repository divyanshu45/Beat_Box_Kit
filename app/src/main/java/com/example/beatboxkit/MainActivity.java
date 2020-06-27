package com.example.beatboxkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    AudioManager audioManager;
    SeekBar seekVol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View overlay = findViewById(R.id.myLayout);
        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        int maxVol = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVol = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        SeekBar seekVol = findViewById(R.id.seekVol);
        seekVol.setMax(maxVol);
        seekVol.setProgress(curVol);
        seekVol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ImageButton img1 = (ImageButton)findViewById(R.id.imageButton1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.ah);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img2 = (ImageButton)findViewById(R.id.imageButton2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.boom);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img3 = (ImageButton)findViewById(R.id.imageButton3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.boomha);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img4 = (ImageButton)findViewById(R.id.imageButton4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.chick);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img5 = (ImageButton)findViewById(R.id.imageButton5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.crack);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img6 = (ImageButton)findViewById(R.id.imageButton6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.hiss);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img7 = (ImageButton)findViewById(R.id.imageButton7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.huhpoof);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img8 = (ImageButton)findViewById(R.id.imageButton8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.kick);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img9 = (ImageButton)findViewById(R.id.imageButton9);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.longboom);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });

        ImageButton img10 = (ImageButton)findViewById(R.id.imageButton10);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.snare);
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                        mp = null;
                    }
                });
                mp.start();
            }
        });
    }
}