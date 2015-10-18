package com.nutri.backend;

public class User
{
    // Data Fields
    @com.google.gson.annotations.SerializedName("id")
    private String userID;
    @com.google.gson.annotations.SerializedName("firstName")
    private String firstName;
    @com.google.gson.annotations.SerializedName("lastName")
    private String lastName;
    @com.google.gson.annotations.SerializedName("weight")
    private int weight;
    @com.google.gson.annotations.SerializedName("age")
    private int age;
    @com.google.gson.annotations.SerializedName("heightFeet")
    private int height_Feet;
    @com.google.gson.annotations.SerializedName("heightInches")
    private int height_Inches;
    @com.google.gson.annotations.SerializedName("activityLevel")
    private int  activityLevel;
    @com.google.gson.annotations.SerializedName("gender")
    private boolean gender;	// 1 means male; 0 means female.
    private Nutrients userNutrients;

    // Constructors
    public User()
    {
        this(null,null,0,0,0,0,0,false,null);
    }

    public User(String fName, String lName, int weight, int age, int height_Feet,
                int height_Inches, int activityLevel, boolean gender,Nutrients userNutrients)
    {
        firstName = fName;
        lastName = lName;
        this.weight = weight;
        this.height_Feet = height_Feet;
        this.height_Inches = height_Inches;
        this.activityLevel = activityLevel;
        this.gender = gender;
        this.userNutrients = userNutrients;
    }

    // Instance methods

    // Accessor methods
    public String getUserID() { return userID; }

    public String getFirstName() {return firstName; }

    public String getLastName() {return lastName; }

    public int getWeight() { return weight; }

    public int getAge()
    {
        return age;
    }

    public int getHeight_Feet() {return height_Feet; }

    public int getHeight_Inches() {return height_Inches; }

    public int getActivityLevel() { return activityLevel; }

    public boolean getGender() { return gender; }

    public Nutrients getUserNutrients() { return userNutrients; }

    // Modifier methods
    public void setUserID(String newID) { userID = newID ;}

    public void setFirstName(String userFirstName) { firstName = userFirstName; }

    public void setLastName(String userLastName)
    {
        lastName = userLastName;
    }

    public void setWeight(int currentWeight)
    {
        weight = currentWeight;
    }

    public void setAge(int currentAge)
    {
        age = currentAge;
    }

    public void setHeight_Feet(int height_Feet)
    {
        this.height_Feet = height_Feet;
    }

    public void setHeight_Inches(int height_Inches)
    {
        this.height_Inches = height_Inches;
    }

    public void setActivityLevel(int activityLevel)
    {
        this.activityLevel = activityLevel;
    }

    public void setGender(boolean gender) { this.gender = gender; }

    public void setUserNutrients(Nutrients newNutrients) {userNutrients = newNutrients; }
}