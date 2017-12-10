package io.supercharge.shimmeringlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.supercharge.shimmeringlayout.tests.UiTestCasesActivity;
import io.supercharge.shimmerlayout.ShimmerLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShimmerLayout shimmerLayout = findViewById(R.id.shimmer_layout);
        shimmerLayout.startShimmerAnimation();

        Button uiTestCases = findViewById(R.id.ui_test_cases);
        uiTestCases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UiTestCasesActivity.class);
                startActivity(intent);
            }
        });
    }
}
