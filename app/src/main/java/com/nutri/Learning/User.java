public class User {

	//parse JSON from clarifai to make keyword userOBJECT
	//Keyword user = new Keyword(JSON[1],..);
	Keyword best;
	IngredientList found;
	
	public void main(String[]args){
		Food var = new Food();
		Nutrients sumItUp = new Nutrients();
		Keyword [] test = var.getkeyArray();
		IngredientList [] see = var.getIngList();
		for(Keyword k: test){
			if(k.equals(user)){
				best = k;
				break;
			}
		}
		for(IngredientList i : see){
			if(best.getName().toUpperCase().equals(i.getName())){
				found = i;
			}
		}
		//add all of ingredients depending on how many there are
		sumItUp.add(found.ingredientOne);
	}
	//return nutrients
	//sumItUp.getCalories();
	//...
}
