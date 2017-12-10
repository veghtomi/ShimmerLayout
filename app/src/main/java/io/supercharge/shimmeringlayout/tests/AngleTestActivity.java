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

        ShimmerLayout minimumAngleShimmerLayout = findViewById(R.id.angle_test_0_from_code);
        minimumAngleShimmerLayout.setShimmerAngle(0);
        minimumAngleShimmerLayout.startShimmerAnimation();

        ShimmerLayout maximumAngleShimmerLayout = findViewById(R.id.angle_test_30_from_code);
        maximumAngleShimmerLayout.setShimmerAngle(30);
        maximumAngleShimmerLayout.startShimmerAnimation();

        ShimmerLayout invalidAngleShimmerLayout = findViewById(R.id.angle_test_31_from_code);
//        invalidAngleShimmerLayout.setShimmerAngle(31);
        invalidAngleShimmerLayout.startShimmerAnimation();
    }
}
