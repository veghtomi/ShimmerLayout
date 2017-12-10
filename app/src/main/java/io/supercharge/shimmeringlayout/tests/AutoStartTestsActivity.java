package io.supercharge.shimmeringlayout.tests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.supercharge.shimmeringlayout.R;
import io.supercharge.shimmerlayout.ShimmerLayout;

public class AutoStartTestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_start_tests);

        ShimmerLayout autoStartFromXmlStopImmediately = findViewById(R.id.auto_start_test_start_from_xml_stop_immediately);
        autoStartFromXmlStopImmediately.stopShimmerAnimation();

        ShimmerLayout manualStartStopImmediatelyShimmerLayout = findViewById(R.id.auto_start_test_manual_start_stop_immediately);
        manualStartStopImmediatelyShimmerLayout.startShimmerAnimation();
        manualStartStopImmediatelyShimmerLayout.stopShimmerAnimation();

        final ShimmerLayout autoStartVisibilityShimmerLayout = findViewById(R.id.auto_start_test_true_visibility);

        Button toVisible = findViewById(R.id.auto_start_test_visible);
        Button toInvisible = findViewById(R.id.auto_start_test_invisible);
        Button toGone = findViewById(R.id.auto_start_test_gone);

        toVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoStartVisibilityShimmerLayout.setVisibility(View.VISIBLE);
            }
        });

        toInvisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoStartVisibilityShimmerLayout.setVisibility(View.INVISIBLE);
            }
        });

        toGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autoStartVisibilityShimmerLayout.setVisibility(View.GONE);
            }
        });
    }
}
