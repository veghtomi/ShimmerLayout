package io.supercharge.shimmeringlayout.tests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.supercharge.shimmeringlayout.R;
import io.supercharge.shimmerlayout.ShimmerLayout;

public class AngleTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle_test);

        ShimmerLayout zeroAngleShimmerLayout = findViewById(R.id.angle_test_0_from_code);
        zeroAngleShimmerLayout.setShimmerAngle(0);
        zeroAngleShimmerLayout.startShimmerAnimation();

        ShimmerLayout positiveAngleShimmerLayout = findViewById(R.id.angle_test_30_from_code);
        positiveAngleShimmerLayout.setShimmerAngle(30);
        positiveAngleShimmerLayout.startShimmerAnimation();

        ShimmerLayout maximumAngleShimmerLayout = findViewById(R.id.angle_test_45_from_code);
        maximumAngleShimmerLayout.setShimmerAngle(45);
        maximumAngleShimmerLayout.startShimmerAnimation();

        ShimmerLayout negativeAngleShimmerLayout = findViewById(R.id.angle_test_minus_30_from_code);
        negativeAngleShimmerLayout.setShimmerAngle(-30);
        negativeAngleShimmerLayout.startShimmerAnimation();

        ShimmerLayout minimumAngleShimmerLayout = findViewById(R.id.angle_test_minus_45_from_code);
        minimumAngleShimmerLayout.setShimmerAngle(-45);
        minimumAngleShimmerLayout.startShimmerAnimation();

        ShimmerLayout invalidAngleShimmerLayout = findViewById(R.id.angle_test_31_from_code);
//        invalidAngleShimmerLayout.setShimmerAngle(-46);
        invalidAngleShimmerLayout.startShimmerAnimation();
    }
}
