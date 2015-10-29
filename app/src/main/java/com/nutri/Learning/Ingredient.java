public class Ingredient {

	double portion;
	String unit;
	String ingredientTitle;
	
	public Ingredient(){
		portion = 0.0;
		unit = "";
		ingredientTitle = "";
	}
	
	public Ingredient(double amount, String unitIn, String nameIngredient){
		portion = amount;
		unit = unitIn;
		ingredientTitle = nameIngredient;
	}
	
	public String getIngredientTitle(){
		return ingredientTitle;
	}
	
	public String getUnit(){
		return unit;
	}
	
	public double getPortion(){
		return portion;
	}
	
}
