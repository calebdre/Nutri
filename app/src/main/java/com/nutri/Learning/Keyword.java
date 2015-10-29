
public class Keyword {

	String name, keyOne, keyTwo, keyThree, keyFour, keyFive, keySix, keySeven, keyEight, keyNine, keyTen;
	

	public Keyword(){
		name = "";
		keyOne = "";
		keyTwo = "";
		keyThree = "";
		keyFour = "";
		keyFive = "";
		keySix = "";
		keySeven = "";
		keyEight = "";
		keyNine = "";
		keyTen = "";
	}
	
	public Keyword(String label, String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, String ten){
		name = label;
		keyOne = one;
		keyTwo = two;
		keyThree = three;
		keyFour = four;
		keyFive = five;
		keySix = six;
		keySeven = seven;
		keyEight = eight;
		keyNine = nine;
		keyTen = ten;
	}
	
	public String getName(){
		return name;
	}
	
	public String getKeyOne() {
		return keyOne;
	}

	public String getKeyTwo() {
		return keyTwo;
	}

	public String getKeyThree() {
		return keyThree;
	}

	public String getKeyFour() {
		return keyFour;
	}

	public String getKeyFive() {
		return keyFive;
	}

	public String getKeySix() {
		return keySix;
	}

	public String getKeySeven() {
		return keySeven;
	}

	public String getKeyEight() {
		return keyEight;
	}

	public String getKeyNine() {
		return keyNine;
	}

	public String getKeyTen() {
		return keyTen;
	}

	
}
