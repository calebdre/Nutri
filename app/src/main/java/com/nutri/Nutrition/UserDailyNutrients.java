

public class UserDailyNutrients {
	/*User inputs picture
	 * Picture gives nutrients
	 * userDailyNutrients adds nutrient counts to already established
	 * class can return percents at current time for each nutrient
	 * (at 6 in the morning the nutrients loop back to zero)
	 * (reset method)
	 */
	
	private int calories, protein, fat, carbs, sugars, calcium, potassium, sodium, vitA, vitC;
	int age, weight, height, activityLevel;
	boolean gender;
	NutritionInfo info;
	CalculateNutrients data;
	
	public UserDailyNutrients(){ //for beginning of day
		calories = 0;
		protein = 0;
		fat = 0;
		carbs = 0;
		sugars = 0;
		calcium = 0;
		potassium = 0;
		sodium = 0;
		vitA = 0;
		vitC = 0;
	}
	
	//adds a new food's nutrients to todays count
	public UserDailyNutrients(NutritionInfo info){
		calories += info.getCalories();
		protein += info.getProtein();
		fat += info.getFat();
		carbs += info.getCarbs();
		sugars += info.getSugars();
		calcium += info.getCalcium();
		potassium += info.getPotassium();
		sodium += info.getSodium();
		vitA += info.getVitA();
		vitC += info.getVitC();
	}
	
	public double calculateCaloriesPercent(){
		return calories/data.calculateCalories();
	}
	
	public double calculateProteinPercent(){
		return protein/data.calculateProtein();
	}
	
	public double calculateFatPercent(){
		return fat/data.calculateFat();
	}
	
	public double calculateCarbsPercent(){
		return carbs/data.calculateCarbs();
	}
	
	public double calculateSugarsPercent(){
		return sugars/data.calculateSugars();
	}
	
	public double calculateCalciumPercent(){
		return calcium/data.calculateCalcium();
	}
	
	public double calculatePotassiumPercent(){
		return potassium/data.calculatePotassium();
	}
	
	public double calculateSodiumPercent(){
		return sodium/data.calculateSodium();
	}
	
	public double calculateVitAPercent(){
		return vitA/data.calculateVitA();
	}
	
	public double calculateVitCPercent(){
		return vitC/data.calculateVitC();
	}
	
	public void reset(){
		calories = 0;
		protein = 0;
		fat = 0;
		carbs = 0;
		sugars = 0;
		calcium = 0;
		potassium = 0;
		sodium = 0;
		vitA = 0;
		vitC = 0;
	}
	
}
