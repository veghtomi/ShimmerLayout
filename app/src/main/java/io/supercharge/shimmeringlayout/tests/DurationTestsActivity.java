package io.supercharge.shimmeringlayout.tests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.supercharge.shimmeringlayout.R;
import io.supercharge.shimmerlayout.ShimmerLayout;

public class DurationTestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duration_tests);

        ShimmerLayout slowShimmerLayout = findViewById(R.id.duration_test_change_from_code_slow);
        slowShimmerLayout.setShimmerAnimationDuration(6000);
        slowShimmerLayout.startShimmerAnimation();

        ShimmerLayout fastShimmerLayout = findViewById(R.id.duration_test_change_from_code_fast);
        fastShimmerLayout.setShimmerAnimationDuration(1000);
        fastShimmerLayout.startShimmerAnimation();
    }
}
