package com.nutri.backend;

/**
 * Created by Main on 10/17/2015.
 */
public class Nutrients
{
    // Data fields
    @com.google.gson.annotations.SerializedName("calories")
    private int calories;
    @com.google.gson.annotations.SerializedName("protein")
    private int protein;
    @com.google.gson.annotations.SerializedName("fat")
    private int fat;
    @com.google.gson.annotations.SerializedName("carbs")
    private int carbs;
    @com.google.gson.annotations.SerializedName("sugar")
    private int sugar;
    @com.google.gson.annotations.SerializedName("calcium")
    private int calcium;
    @com.google.gson.annotations.SerializedName("potassium")
    private int potassium;
    @com.google.gson.annotations.SerializedName("sodium")
    private int sodium;
    @com.google.gson.annotations.SerializedName("vitamin_A")
    private int vitaminA;
    @com.google.gson.annotations.SerializedName("vitamin_C")
    private int vitaminC;
    @com.google.gson.annotations.SerializedName("id")
    private String userID;
    private User associatedUser;

    // Constructors
    public Nutrients()
    {
        this(0,0,0,0,0,0,0,0,0,0,null,null);
    }

    public Nutrients(int calories,
                     int protein,
                     int fat,
                     int carbs,
                     int sugar,
                     int calcium,
                     int potassium,
                     int sodium,
                     int vitaminA,
                     int vitaminC,
                     String userID,
                     User associatedUser){
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
        this.sugar = sugar;
        this.calcium = calcium;
        this.potassium = potassium;
        this.sodium = sodium;
        this.vitaminA = vitaminA;
        this.vitaminC = vitaminC;
        this.userID = userID;
        this.associatedUser = associatedUser;
    }

    // Instance methods

    // Accessor methods
    public int getCalories() { return calories; }

    public int getProtein() { return protein; }

    public int getFat() { return fat; }

    public int getCarbs() { return carbs; }

    public int getSugar()  { return sugar; }

    public int getCalcium() { return calcium; }

    public int getPotassium() { return potassium; }

    public int getSodium() { return sodium; }

    public int getVitaminA() { return vitaminA; }

    public int getVitaminC() { return vitaminC; }

    public String getUserID() { return userID; }

    // Modifier methods
    public void setCalories(int calories) { this.calories = calories; }

    public void setProtein(int protein) { this.protein = protein; }

    public void setFat(int fat) { this.fat = fat; }

    public void setCarbs(int carbs) { this.carbs = carbs; }

    public void setSugar(int sugar) { this.sugar = sugar; }

    public void setCalcium(int calcium) { this.calcium = calcium; }

    public void setPotassium(int potassium) { this.potassium = potassium; }

    public void setSodium(int sodium) { this.sodium = sodium; }

    public void setVitaminA(int vitaminA) { this.vitaminA = vitaminA; }

    public void setVitaminC(int vitaminC) { this.vitaminC = vitaminC; }

    public void setUserID(String userID) { this.userID = userID; }
}
