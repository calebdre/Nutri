package com.nutri;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.nutri.Models.Food;
import com.nutri.Nutrition.NutritionInfo;

import java.util.ArrayList;
import java.util.HashMap;

public class DashboardActivity extends AppCompatActivity {

//    @Bind(R.id.chart) RadarChart mChart;
    @Bind(R.id.dashboardSuggestionsList) ListView suggestionsListView;

    private String[] mParties = new String[] {"Party A", "Party B", "Party C", "Party D", "Party E", "Party F", "Party G", "Party H", "Party I"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//        RadarChartGenerator chartGenerator = new RadarChartGenerator(mChart, mParties);
//        chartGenerator.generate();

        Food apple = new Food("apple", "someimage.jpg", new NutritionInfo(1,1,1,1,1,1,1,1,1,1));
        Food pizza = new Food("pizza", "someimage.jpg", new NutritionInfo(2,2,2,2,2,2,2,2,2,2));
        Food coffee = new Food("coffee", "someimage.jpg", new NutritionInfo(3,3,3,3,3,3,3,3,3,3));

        HashMap<String[], Food> suggestions = new HashMap<>();
        suggestions.put(new String[]{"Calcium", "Protien"}, apple);
        suggestions.put(new String[]{"Calcium", "Protien"}, pizza);
        suggestions.put(new String[]{"Calcium", "Protien"}, coffee);

        SuggestionListAdapter suggestionAdapter = new SuggestionListAdapter(this, suggestions);
        suggestionsListView.setAdapter(suggestionAdapter);
    }
}