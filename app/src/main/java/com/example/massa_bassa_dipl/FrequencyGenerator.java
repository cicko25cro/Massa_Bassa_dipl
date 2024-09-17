package com.example.massa_bassa_dipl;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FrequencyGenerator extends AppCompatActivity {

    private SeekBar lowSeekBar;
    private SeekBar midSeekBar;
    private SeekBar highSeekBar;
    private TextView lowText;
    private TextView midText;
    private TextView highText;
    private Button lowStartButton;
    private Button lowStopButton;
    private Button midStartButton;
    private Button midStopButton;
    private Button highStartButton;
    private Button highStopButton;

    private SoundPool soundPool;
    private int lowSoundId;
    private int midSoundId;
    private int highSoundId;
    private int lowStreamId;
    private int midStreamId;
    private int highStreamId;
    private int[] lowSoundIds = new int[100];
    private int[] midSoundIds = new int[76]; // 1000Hz - 250Hz / 10Hz + 1
    private int[] highSoundIds = new int[87]; // 10000Hz - 1500Hz / 100Hz + 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency_generator);

        lowSeekBar = findViewById(R.id.lowSeekBar);
        midSeekBar = findViewById(R.id.midSeekBar);
        highSeekBar = findViewById(R.id.highSeekBar);
        lowText = findViewById(R.id.lowText);
        midText = findViewById(R.id.midText);
        highText = findViewById(R.id.highText);
        lowStartButton = findViewById(R.id.lowStartButton);
        lowStopButton = findViewById(R.id.lowStopButton);
        midStartButton = findViewById(R.id.midStartButton);
        midStopButton = findViewById(R.id.midStopButton);
        highStartButton = findViewById(R.id.highStartButton);
        highStopButton = findViewById(R.id.highStopButton);

        setupSoundPool();

        lowSeekBar.setProgress(0);
        lowText.setText("Low Frequency: 1Hz");
        midSeekBar.setProgress(0);
        midText.setText("Mid Frequency: 250Hz");
        highSeekBar.setProgress(0);
        highText.setText("High Frequency: 1500Hz");

        lowStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playLowFrequency();
            }
        });

        lowStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopLowFrequency();
            }
        });

        midStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMidFrequency();
            }
        });

        midStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMidFrequency();
            }
        });

        highStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHighFrequency();
            }
        });

        highStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopHighFrequency();
            }
        });

        lowSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int selectedFrequency = progress + 1;
                lowText.setText("Low Frequency: " + selectedFrequency + "Hz");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        midSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int selectedFrequency = progress * 10 + 250;
                midText.setText("Mid Frequency: " + selectedFrequency + "Hz");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        highSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int selectedFrequency = progress * 100 + 1500;
                highText.setText("High Frequency: " + selectedFrequency + "Hz");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        getSupportActionBar().setTitle("Frequency Generator");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setupSoundPool() {
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(3)
                .setAudioAttributes(audioAttributes)
                .build();

        // Dohvaćanje zvukova za low frekvencije (od 1Hz do 100Hz)
        for (int i = 1; i <= 100; i++) {
            String soundFileName = "a" + i + "hz";
            int soundResourceId = getResources().getIdentifier(soundFileName, "raw", getPackageName());
            if (soundResourceId != 0) {
                lowSoundIds[i - 1] = soundPool.load(this, soundResourceId, 1);
            }
        }

        // Dohvaćanje zvukova za mid frekvencije (od 250Hz do 1000Hz, korak 10Hz)
        int midIndex = 0;
        for (int i = 250; i <= 1000; i += 10) {
            String soundFileName = "a" + i + "hz";
            int soundResourceId = getResources().getIdentifier(soundFileName, "raw", getPackageName());
            if (soundResourceId != 0) {
                midSoundIds[midIndex++] = soundPool.load(this, soundResourceId, 1);
            }
        }

        // Dohvaćanje zvukova za high frekvencije (od 1500Hz do 10000Hz, korak 100Hz)
        int highIndex = 0;
        for (int i = 1500; i <= 10000; i += 100) {
            String soundFileName = "a" + i + "hz";
            int soundResourceId = getResources().getIdentifier(soundFileName, "raw", getPackageName());
            if (soundResourceId != 0) {
                highSoundIds[highIndex++] = soundPool.load(this, soundResourceId, 1);
            }
        }
    }

    private void playLowFrequency() {
        if (lowStreamId != 0) {
            soundPool.stop(lowStreamId);
            lowStreamId = 0;
        }
        lowStreamId = soundPool.play(lowSoundIds[lowSeekBar.getProgress()], 1.0f, 1.0f, 1, -1, 1.0f);
    }

    private void stopLowFrequency() {
        if (lowStreamId != 0) {
            soundPool.stop(lowStreamId);
            lowStreamId = 0;
        }
    }

    private void playMidFrequency() {
        if (midStreamId != 0) {
            soundPool.stop(midStreamId);
            midStreamId = 0;
        }
        midStreamId = soundPool.play(midSoundIds[midSeekBar.getProgress()], 1.0f, 1.0f, 1, -1, 1.0f);
    }

    private void stopMidFrequency() {
        if (midStreamId != 0) {
            soundPool.stop(midStreamId);
            midStreamId = 0;
        }
    }

    private void playHighFrequency() {
        if (highStreamId != 0) {
            soundPool.stop(highStreamId);
            highStreamId = 0;
        }
        highStreamId = soundPool.play(highSoundIds[highSeekBar.getProgress()], 1.0f, 1.0f, 1, -1, 1.0f);
    }

    private void stopHighFrequency() {
        if (highStreamId != 0) {
            soundPool.stop(highStreamId);
            highStreamId = 0;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onPause() {
        super.onPause();
        stopLowFrequency();
        stopMidFrequency();
        stopHighFrequency();
    }
}
