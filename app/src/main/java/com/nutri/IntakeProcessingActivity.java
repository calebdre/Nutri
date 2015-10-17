package com.nutri;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.nutri.Models.Food;
import com.nutri.Nutrition.NutritionInfo;

public class IntakeProcessingActivity extends AppCompatActivity {

    @Bind(R.id.intake_processing_image) ImageView image;
    @Bind(R.id.intake_processing_list) ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intake_processing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);

        Food food = new Food("burger", "imagurl.jpg", new NutritionInfo(4,4,4,4,4,4,4,4,4,4));
        NutrientListAdapter nutrientListAdapter = new NutrientListAdapter(this, food);
        list.setAdapter(nutrientListAdapter);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bp = (Bitmap) data.getExtras().get("data");
        image.setImageBitmap(bp);
    }

    public void addToDailyIntake(View view) {
        Intent dashboardActivityIntent = new Intent(this, DashboardActivity.class);
        startActivity(dashboardActivityIntent);
    }

    public void backToDashboard(View view) {
        Intent dashboardActivityIntent = new Intent(this, DashboardActivity.class);
        startActivity(dashboardActivityIntent);
    }
}
