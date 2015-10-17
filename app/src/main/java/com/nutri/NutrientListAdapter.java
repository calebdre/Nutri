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
import com.nutri.Nutrition.NutritionInfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NutrientListAdapter extends ArrayAdapter<String>{
    Context context;
    Food foodItem;

    public NutrientListAdapter(Context context, Food foodItem) {
        super(context, -1, NutritionInfo.allFields);
        this.context = context;
        this.foodItem = foodItem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String field = getItem(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_item_key_value, parent, false);
        Method method = null;

        NutritionInfo info = foodItem.getInfo();

        try {
            method = info.getClass().getMethod("get" + field.substring(0, 1).toUpperCase() + field.substring(1));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        ((TextView) v.findViewById(R.id.list_item_key)).setText(field);

        try {
            assert method != null;
            ((TextView) v.findViewById(R.id.list_item_value)).setText(String.valueOf((int) method.invoke(info)));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return v;
    }
}
