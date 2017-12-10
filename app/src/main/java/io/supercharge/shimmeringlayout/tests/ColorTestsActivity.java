package io.supercharge.shimmeringlayout.tests;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.supercharge.shimmeringlayout.R;
import io.supercharge.shimmerlayout.ShimmerLayout;

public class ColorTestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_tests);

        ShimmerLayout shimmerLayout = findViewById(R.id.color_test_change_from_code);
        shimmerLayout.setShimmerColor(Color.RED);
        shimmerLayout.startShimmerAnimation();
    }
}
