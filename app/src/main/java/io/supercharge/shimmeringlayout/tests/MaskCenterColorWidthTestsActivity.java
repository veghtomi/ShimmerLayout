package io.supercharge.shimmeringlayout.tests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.supercharge.shimmeringlayout.R;
import io.supercharge.shimmerlayout.ShimmerLayout;

public class MaskCenterColorWidthTestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mask_center_color_width_tests);

        ShimmerLayout maskWidth1ShimmerLayout = findViewById(R.id.mask_center_color_width_test_mask_1_from_code);
        maskWidth1ShimmerLayout.setMaskWidth(1);
        maskWidth1ShimmerLayout.setGradientCenterColorWidth(0.4F);
        maskWidth1ShimmerLayout.startShimmerAnimation();

        ShimmerLayout defaultCenterColorWidth = findViewById(R.id.mask_center_color_width_test_center_color_default_from_code);
        defaultCenterColorWidth.setMaskWidth(0.3F);
        defaultCenterColorWidth.startShimmerAnimation();
    }
}
