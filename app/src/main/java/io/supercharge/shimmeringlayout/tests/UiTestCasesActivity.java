package io.supercharge.shimmeringlayout.tests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.supercharge.shimmeringlayout.R;
import io.supercharge.shimmeringlayout.tests.recyclerview.RecyclerViewTestActivity;

public class UiTestCasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_test_cases);

        addNavigationToTestCases(R.id.ui_test_auto_start_button, AutoStartTestsActivity.class);
        addNavigationToTestCases(R.id.ui_test_color_button, ColorTestsActivity.class);
        addNavigationToTestCases(R.id.ui_test_duration_button, DurationTestsActivity.class);
        addNavigationToTestCases(R.id.ui_test_angle_button, AngleTestActivity.class);
        addNavigationToTestCases(R.id.ui_test_height_width_button, HeightWidthTestsActivity.class);
        addNavigationToTestCases(R.id.ui_test_mask_width_center_color_button, MaskCenterColorWidthTestsActivity.class);
        addNavigationToTestCases(R.id.ui_test_recycler_view, RecyclerViewTestActivity.class);
    }

    private void addNavigationToTestCases(int buttonId, final Class<? extends AppCompatActivity> targetActivity) {
        Button testButton = findViewById(buttonId);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UiTestCasesActivity.this, targetActivity);
                startActivity(intent);
            }
        });
    }
}
