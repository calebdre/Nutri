import java.util.Scanner;

public class TestCode {
	static Scanner sc;
	int weight, height, age, activityLevel;
	boolean gender;
	int calories, protein, fat, carbs, sugars, calcium, potassium, sodium, vitA, vitC;
	
	public TestCode(){
		weight = 0;
		height = 0;
		age = 0;
		activityLevel = 0;
		gender = true;
	}
	
	public void main(String [] args){ //static taken out
		sc= new Scanner(System.in);
		System.out.println("Enter your weight in pounds: ");
		weight = sc.nextInt();
		System.out.println("Enter your height in inches : "); //can we do boxes    fix Ryu's API 
		height = sc.nextInt();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your gender (M or F): ");
		if(sc.nextLine().equals("M")){
			gender = true;
		}else{
			gender = false;
		}
		
		System.out.println("Select which number activity level would best describe you: ");
		System.out.println("1 - Primarily sedentary");
		System.out.println("2 - Some light exercise (Example: leisure walks)");
		System.out.println("3 - Moderate exercise 3 to 5 days per week");
		System.out.println("4 - An active individual (exercising 6 to 7 days per week)");
		System.out.println("5 - An extremely active individual (Examples: heavy manual labor or a competitive athlete)");
		activityLevel = sc.nextInt();
		
		
		
	}

}
