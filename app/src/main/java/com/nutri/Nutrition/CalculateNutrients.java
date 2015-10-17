package com.nutri.Nutrition;

public class CalculateNutrients {

	private int calories, protein, fat, carbs, sugars, calcium, potassium, sodium, vitA, vitC;
	int age, weight, height, activityLevel;
	boolean gender;
	
	public CalculateNutrients(int a, int w, int h, int aL, boolean g){
		age = a;
		weight = w;
		height = h;
		activityLevel = aL;
		gender = g;
	}
	
	//calculates calories
	public int calculateCalories(){
		if(gender){
			calories = (int)(66.47 + 13.75*weight + 5*height - 6.75*age);
		}else{
			calories = (int)(665.09 + 9.56*weight + 1.85*height - 4.67*age);
		}
		switch(activityLevel){
			case 1: calories = (int)(calories*1.2);
					break;
			case 2: calories = (int)(calories*1.375);
					break;
			case 3: calories = (int)(calories*1.55);
					break;
			case 4: calories = (int)(calories*1.725);
					break;
			case 5: calories = (int)(calories*1.9);
					break;
			}
		return calories;
	}
			
	//calculates protein in g
	public int calculateProtein(){
		switch(activityLevel){
			case 1: protein = (int)(weight*0.8);
				break;
			case 2: protein = (int)(weight*0.9);
				break;
			case 3: protein = weight;
				break;
			case 4: protein = (int)(weight*1.3);
				break;
			case 5: protein = (int)(weight*1.8);
				break;
		}
		return protein;
	}
			
	//calculates fat in g
	public int calculateFat(){
		fat = (int)(calories*.275/9); 
		return fat;
	}	
			
	//calculates carbs in g
	public int calculateCarbs(){
		carbs = (int)(calories*.55/4);
		return carbs;
	}	
			
	//calculates sugars in g
	public int calculateSugars(){
		if(age < 4){
			sugars = 16;
		}else if(age <= 8){
			sugars = 12;
		}else if(age < 20){
			sugars = 26;
		}else if(gender){
			sugars = 36;
		}else{
			sugars = 24;
		}
		return sugars;
	}
			
	//calculates calcium in mg
	public int calculateCalcium(){
		if(age < 4){
			calcium = 700;
		}else if(age <= 8){ 
			calcium = 1000;
		}else if(age < 14){ 
			calcium = 1300;
		}else if(age < 19){ 
			calcium = 1300;
		}else if(age < 51){
			calcium = 1000;
		}else if(age < 71 && gender){
			calcium = 1000;
		}else if(age < 71 && !gender){
			calcium = 1200;
		}else{
			calcium = 1200;
		}
		return calcium;
	}
			
	//calculates potassium in mg
	public int calculatePotassium(){
		if(age < 4){
			potassium = 3000;
		}else if(age < 9){
			potassium = 3800;
		}else if(age < 14){
			potassium = 4500;
		}else{
			potassium = 4700;
		}
		return potassium;
	}
			
	//calculates sodium in mg
	public int calculateSodium(){
		if(age < 52){ 
			sodium = 2300;
		}else{
			sodium = 1500;
		}
		return sodium;
	}
			
	//calculates vitA in mcg
	public int calculateVitA(){
		if(age < 4){
			vitA = 900;
		}else if(age < 9){ 
			vitA = 1350;
		}else if(age < 14){
			vitA = 2550;
		}else if(age < 19){
			vitA = 4200;
		}else{
			vitA = 4500;
		}
		return vitA;
	}
			
	//calculates vitC in mcg
	public int calculateVitC(){
		if(age < 4){
			vitC = 15;
		}else if(age < 9){
			vitC = 25;
		}else if(age < 14){
			vitC = 45;
		}else if(age < 19 && gender){
			vitC = 75;
		}else if(age < 19 && !gender){
			vitC = 65;
		}else if(gender){
			vitC = 90;
		}else{
			vitC = 75;
		}
		return vitC;
	}
	
}
