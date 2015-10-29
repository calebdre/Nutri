
public class Food {
	
	Ingredient allpurposeflour;
	Ingredient brownsugar;
	//Ingredient ;
	//Ingredient ;
	Ingredient eggs;
	//Ingredient ;
	Ingredient groundcinnamon, groundcloves, groundnutmeg;
	//Ingredient ;
	//Ingredient ;
	//Ingredient ;
	//Ingredient ;
	//Ingredient ;
	//Ingredient ;
	//Ingredient ;
	//Ingredient ;
	Ingredient pumpkinpuree;
	//Ingredient ;
	//Ingredient ;
	Ingredient softenedbutter;
	Ingredient texastoastthickslicedbread;
	//Ingredient ;
	Ingredient vanillaextract;
	Ingredient whitesugar;
	//Ingredient ;
	//Ingredient ;
	//Ingredient ;
	Keyword [] keyArray;
	IngredientList [] ingArray;
	
	public void main(String [] args){
		Keyword pumpkinfrenchtoast = new Keyword("Pumpkin French Toast", "food", "nobody", "homemade", "meal", "delectable", "lunch", "dish", "meat", "plate", "dinner");
		eggs = new Ingredient(8.0, "number", "eggs");
		vanillaextract = new Ingredient(1.0, "tsp", "vanilla extract");
		groundcinnamon = new Ingredient(2.0, "tsp", "ground cinnamon");
		groundcloves = new Ingredient(0.5, "tsp", "ground cloves");
		groundnutmeg = new Ingredient(2.25, "tsp", "ground nutmeg");
		whitesugar = new Ingredient(1, "tbsp", "white sugar");
		pumpkinpuree = new Ingredient(15, "oz", "pumpkin puree");
		texastoastthickslicedbread = new Ingredient(1, "loaf", "texas toast thick-sliced bread");
		brownsugar = new Ingredient(0.33, "cup", "brown sugar");
		allpurposeflour = new Ingredient(2, "tbsp", "all-purpose flour");
		softenedbutter = new Ingredient(1, "tbsp", "softened butter");
		IngredientList PUMPKINFRENCHTOAST = new IngredientList("PUMPKINFRENCHTOAST", eggs, vanillaextract, groundcinnamon, groundcloves, groundnutmeg, whitesugar, pumpkinpuree, texastoastthickslicedbread, brownsugar, allpurposeflour, softenedbutter);
		//http://allrecipes.com/recipe/217955/pumpkin-french-toast-bake/?internalSource=staff%20pick&referringContentType=home%20page
		keyArray[0] = pumpkinfrenchtoast;
		ingArray[0] = PUMPKINFRENCHTOAST;
		
	}
	
	public Keyword[] getkeyArray(){
		return keyArray;
	}
	
	public IngredientList[] getIngList(){
		return ingArray;
	}
}
