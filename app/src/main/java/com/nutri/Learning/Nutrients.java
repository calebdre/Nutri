public class Nutrients {

	int calories, protein, fat, carbs, sugars, calcium, potassium, sodium, vitA, vitC;
	
	public void add(Ingredient yum){
		if(yum.getIngredientTitle().equals("eggs")){
			if(yum.getUnit().equals("number")){
				calories = (int)(yum.getPortion() * 78);
				protein = (int)(yum.getPortion() * 6);
				fat = (int)(yum.getPortion() * 5);
				carbs = (int)(yum.getPortion() * 0);
				sugars = (int)(yum.getPortion() * 0.6);
				calcium = (int)(yum.getPortion() * 25);
				potassium = (int)(yum.getPortion() * 63);
				sodium = (int)(yum.getPortion() * 62);
				vitA = (int)(yum.getPortion() * 140);
				vitC = (int)(yum.getPortion() * 0);
			}
			//if(yum.getUnit().equals("oz"))
			//...
		}
		if(yum.getIngredientTitle().equals("banana")){
			if(yum.getUnit().equals("number")){
				calories = (int)(yum.getPortion() * 105);
				protein = (int)(yum.getPortion() * 1.3);
				fat = (int)(yum.getPortion() * 0.4);
				carbs = (int)(yum.getPortion() * 27);
				sugars = (int)(yum.getPortion() * 14);
				calcium = (int)(yum.getPortion() * 0);
				potassium = (int)(yum.getPortion() * 422);
				sodium = (int)(yum.getPortion() * 1);
				vitA = (int)(yum.getPortion() * 24.3);
				vitC = (int)(yum.getPortion() * 9);
			}
			//if(yum.getUnit().equals("oz"))
			//...
		}
		//all other foods
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
