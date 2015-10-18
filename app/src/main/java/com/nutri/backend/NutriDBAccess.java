package com.nutri.backend;

import com.microsoft.windowsazure.mobileservices.MobileServiceClient;
import com.microsoft.windowsazure.mobileservices.table.MobileServiceTable;

import java.util.concurrent.ExecutionException;

/**
 * Created by Main on 10/17/2015.
 */
public class NutriDBAccess
{
    /*
    You need to have these fields to access the database of Azure.
     */
    private MobileServiceClient mClient;
    private MobileServiceTable<User> mUserTable;
    private MobileServiceTable<Nutrients> mNutrientsTable;

    public NutriDBAccess(MobileServiceClient mClient)
    {
        this.mClient = mClient;
        mUserTable = this.mClient.getTable("Users",User.class);
        mNutrientsTable = this.mClient.getTable(Nutrients.class);
    }

    public User addUserInTable(String firstName,
                               String lastName,
                               int weight,
                               int age,
                               int height_Feet,
                               int height_Inches,
                               int activityLevel,
                               boolean gender,
                               Nutrients nutrients
    ) throws ExecutionException, InterruptedException {
        User newUser = new User(firstName, lastName,weight, age, height_Feet, height_Inches, activityLevel, gender, nutrients);
        User entity = mUserTable.insert(newUser).get(); // Automatically maps all the parameters to the correct serialization.
        return entity;
    }

    public User addUserInTable(User userToAdd) throws ExecutionException, InterruptedException
        {
        User entity = mUserTable.insert(userToAdd).get();
        return entity;
    }

    public Nutrients addNutrientsInTable(int calories,
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
                                         User associatedUser
    ) throws ExecutionException, InterruptedException {
        Nutrients newNutrients = new Nutrients(calories,protein,fat,carbs,sugar,calcium,potassium,sodium,vitaminA,vitaminC,userID,associatedUser);
        Nutrients entity = mNutrientsTable.insert(newNutrients).get();
        return entity;
    }

    public Nutrients addNutrientsInTable(Nutrients newNutrients) throws ExecutionException, InterruptedException
    {
        Nutrients entity = mNutrientsTable.insert(newNutrients).get();
        return entity;
    }

    // Getter methods from the database
    public User retrieveUser(String userID)throws ExecutionException, InterruptedException
    {
        User retrievedUser = mUserTable.lookUp(userID).get();
        return retrievedUser;
    }

    public Nutrients retrieveNutrients(String nutrientUserID) throws ExecutionException, InterruptedException
    {
        Nutrients retrievedNutrient = mNutrientsTable.lookUp(nutrientUserID).get();
        return retrievedNutrient;
    }

    public void deleteUser(String userID)
    {
        mUserTable.delete(userID);
    }

    public void deleteNutrients(String userID)
    {
        mNutrientsTable.delete(userID);
    }


}
