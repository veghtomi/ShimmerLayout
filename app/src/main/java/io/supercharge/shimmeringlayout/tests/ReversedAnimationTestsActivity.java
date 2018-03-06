package io.supercharge.shimmeringlayout.tests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.supercharge.shimmeringlayout.R;
import io.supercharge.shimmerlayout.ShimmerLayout;

public class ReversedAnimationTestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reversed_animation_tests);

        ShimmerLayout notReversedShimmerLayout = findViewById(R.id.reversed_animation_test_false);
        notReversedShimmerLayout.setAnimationReversed(false);

        ShimmerLayout reversedShimmerLayout = findViewById(R.id.reversed_animation_test_true);
        reversedShimmerLayout.setAnimationReversed(true);
    }
}
