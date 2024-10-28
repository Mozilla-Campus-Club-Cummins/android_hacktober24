package com.example.color_picker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mainLayout;
    //Using slidrs of range 0-255 as mentioned in activity_mian.xml file
    private Slider redSlider, greenSlider, blueSlider;
    private MaterialButton resetButton, applyButton;

    private int currentRed = 255;
    private int currentGreen = 255;
    private int currentBlue = 255;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization
        mainLayout = findViewById(R.id.mainLayout);
        redSlider = findViewById(R.id.redSlider);
        greenSlider = findViewById(R.id.greenSlider);
        blueSlider = findViewById(R.id.blueSlider);
        resetButton = findViewById(R.id.resetButton);
        applyButton = findViewById(R.id.applyButton);

        setupSliderListeners();
        setupButtonListeners();
    }

    // Sets up listeners for each slider to adjust color components.
    private void setupSliderListeners() {
        redSlider.addOnChangeListener((slider, value, fromUser) -> {
            currentRed = (int) value;
        });

        greenSlider.addOnChangeListener((slider, value, fromUser) -> {
            currentGreen = (int) value;
        });

        blueSlider.addOnChangeListener((slider, value, fromUser) -> {
            currentBlue = (int) value;
        });
    }

    private void setupButtonListeners() {
        // Reset button to reset sliders to default values
        resetButton.setOnClickListener(v -> {
            resetColors(); //Calling function to reset the values of sliders
            Toast.makeText(this, "Colors reset!", Toast.LENGTH_SHORT).show();
        });

        // Apply button to set the background color based on current RGB values
        applyButton.setOnClickListener(v -> {
            updateBackgroundColor();
            Toast.makeText(this, "Color applied!", Toast.LENGTH_SHORT).show();
        });
    }

    // Updates the background color based on RGB slider values
    private void updateBackgroundColor() {
        int color = Color.rgb(currentRed, currentGreen, currentBlue);
        mainLayout.setBackgroundColor(color);
    }

    //Function for the Resetting the sliders
    private void resetColors() {
        currentRed = 255;
        currentGreen = 255;
        currentBlue = 255;
        redSlider.setValue(255);
        greenSlider.setValue(255);
        blueSlider.setValue(255);
        mainLayout.setBackgroundColor(Color.WHITE);
    }
}
