package com.example.rating_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RatingBar caesarSaladRatingBar, spaghettiCarbonaraRatingBar, margheritaPizzaRatingBar,
            tandooriChickenRatingBar, chocolateLavaCakeRatingBar, sushiPlatterRatingBar,
            grilledSalmonRatingBar, chickenBiryaniRatingBar, frenchFriesRatingBar,
            tiramisuRatingBar;

    private TextView caesarSaladRatingTextView, spaghettiCarbonaraRatingTextView,
            margheritaPizzaRatingTextView, tandooriChickenRatingTextView,
            chocolateLavaCakeRatingTextView, sushiPlatterRatingTextView,
            grilledSalmonRatingTextView, chickenBiryaniRatingTextView,
            frenchFriesRatingTextView, tiramisuRatingTextView;

    private Button submitFeedbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RatingBars and TextViews for each dish
        caesarSaladRatingBar = findViewById(R.id.caesarSaladRatingBar);
        caesarSaladRatingTextView = findViewById(R.id.caesarSaladRatingTextView);
        spaghettiCarbonaraRatingBar = findViewById(R.id.spaghettiCarbonaraRatingBar);
        spaghettiCarbonaraRatingTextView = findViewById(R.id.spaghettiCarbonaraRatingTextView);
        margheritaPizzaRatingBar = findViewById(R.id.margheritaPizzaRatingBar);
        margheritaPizzaRatingTextView = findViewById(R.id.margheritaPizzaRatingTextView);
        tandooriChickenRatingBar = findViewById(R.id.tandooriChickenRatingBar);
        tandooriChickenRatingTextView = findViewById(R.id.tandooriChickenRatingTextView);
        chocolateLavaCakeRatingBar = findViewById(R.id.chocolateLavaCakeRatingBar);
        chocolateLavaCakeRatingTextView = findViewById(R.id.chocolateLavaCakeRatingTextView);
        sushiPlatterRatingBar = findViewById(R.id.sushiPlatterRatingBar);
        sushiPlatterRatingTextView = findViewById(R.id.sushiPlatterRatingTextView);
        grilledSalmonRatingBar = findViewById(R.id.grilledSalmonRatingBar);
        grilledSalmonRatingTextView = findViewById(R.id.grilledSalmonRatingTextView);
        chickenBiryaniRatingBar = findViewById(R.id.chickenBiryaniRatingBar);
        chickenBiryaniRatingTextView = findViewById(R.id.chickenBiryaniRatingTextView);
        frenchFriesRatingBar = findViewById(R.id.frenchFriesRatingBar);
        frenchFriesRatingTextView = findViewById(R.id.frenchFriesRatingTextView);
        tiramisuRatingBar = findViewById(R.id.tiramisuRatingBar);
        tiramisuRatingTextView = findViewById(R.id.tiramisuRatingTextView);

        submitFeedbackButton = findViewById(R.id.submitFeedbackButton);

        // Set listeners to update ratings in TextViews
        caesarSaladRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                caesarSaladRatingTextView.setText("Rating: " + rating));

        spaghettiCarbonaraRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                spaghettiCarbonaraRatingTextView.setText("Rating: " + rating));

        margheritaPizzaRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                margheritaPizzaRatingTextView.setText("Rating: " + rating));

        tandooriChickenRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                tandooriChickenRatingTextView.setText("Rating: " + rating));

        chocolateLavaCakeRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                chocolateLavaCakeRatingTextView.setText("Rating: " + rating));

        sushiPlatterRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                sushiPlatterRatingTextView.setText("Rating: " + rating));

        grilledSalmonRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                grilledSalmonRatingTextView.setText("Rating: " + rating));

        chickenBiryaniRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                chickenBiryaniRatingTextView.setText("Rating: " + rating));

        frenchFriesRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                frenchFriesRatingTextView.setText("Rating: " + rating));

        tiramisuRatingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) ->
                tiramisuRatingTextView.setText("Rating: " + rating));

        // Submit Feedback Button to calculate average rating and display feedback
        submitFeedbackButton.setOnClickListener(v -> {
            float totalRating = caesarSaladRatingBar.getRating() +
                    spaghettiCarbonaraRatingBar.getRating() +
                    margheritaPizzaRatingBar.getRating() +
                    tandooriChickenRatingBar.getRating() +
                    chocolateLavaCakeRatingBar.getRating() +
                    sushiPlatterRatingBar.getRating() +
                    grilledSalmonRatingBar.getRating() +
                    chickenBiryaniRatingBar.getRating() +
                    frenchFriesRatingBar.getRating() +
                    tiramisuRatingBar.getRating();

            float averageRating = totalRating / 10;

            String feedbackMessage = "Thanks for your feedback! Average Rating: " + averageRating;
            Toast.makeText(MainActivity.this, feedbackMessage, Toast.LENGTH_LONG).show();
        });
    }
}