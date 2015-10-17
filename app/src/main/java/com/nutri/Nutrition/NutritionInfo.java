package com.nutri.Nutrition;

public class NutritionInfo {
	private int calories, protein, fat, carbs, sugars, calcium, potassium, sodium, vitA, vitC;
	public String[] allFields = new String[]{
		"calories", "protein", "fat", "carbs", "sugars", "calcium", "potassium", "sodium", "vitA", "vitC"
	};

    public NutritionInfo(int calories, int protein, int fat, int carbs, int sugars, int calcium, int potassium, int sodium, int vitA, int vitC) {
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
        this.sugars = sugars;
        this.calcium = calcium;
        this.potassium = potassium;
        this.sodium = sodium;
        this.vitA = vitA;
        this.vitC = vitC;
    }

    public int getCalories() {
        return calories;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getSugars() {
        return sugars;
    }

    public int getCalcium() {
        return calcium;
    }

    public int getPotassium() {
        return potassium;
    }

    public int getSodium() {
        return sodium;
    }

    public int getVitA() {
        return vitA;
    }

    public int getVitC() {
        return vitC;
    }
}
