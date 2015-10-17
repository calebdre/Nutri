package com.nutri;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.nutri.Models.Food;

import java.util.*;

public class SuggestionListAdapter extends ArrayAdapter<Food>{

    HashMap<String[], Food> suggestions;
    Context context;

    public SuggestionListAdapter(Context context, HashMap<String[], Food> suggestions) {
        super(context, -1 , new ArrayList<Food>(suggestions.values()));
        this.suggestions = suggestions;
        this.context = context;
    }

    public SuggestionListAdapter(Context context, int resource) {
        super(context, -1);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Food foodItem = getItem(position);
//        String[] items = getKeyByValue(suggestions, foodItem);
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_item_suggestion, parent, false);
        ((TextView) v.findViewById(R.id.suggestion_name)).setText(foodItem.getName());

        ((TextView) v.findViewById(R.id.suggestion_label1)).setText("Cards");
        ((TextView) v.findViewById(R.id.suggestion_label2)).setText("Calcium");
        ((TextView) v.findViewById(R.id.suggestion_value1)).setText(String.valueOf(foodItem.getInfo().getCarbs()));
        ((TextView) v.findViewById(R.id.suggestion_value2)).setText(String.valueOf(foodItem.getInfo().getCalcium()));

        return v;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}