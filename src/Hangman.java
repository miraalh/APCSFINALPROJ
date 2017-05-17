import java.util.Scanner; 
import java.util.ArrayList;

public class Hangman {
	
	 private String word; 
	 private String [] wordArray;
	 private ArrayList <String> display; 
	 private int lives;
	 private int correctGuesses; 
	 
	 public Hangman() {
		 
		 lives = 6; 
		 correctGuesses = 0; 
		 createWordArray();
		 createDashArray();

		//set up gameboard
	 	System.out.println("NEW GAME");
		printGallows();		
	} 
	 
	public int getLives (){
			return lives; 
	}
	
	public int getCorrectGuesses(){
		return correctGuesses;
	}
	
	//turns the word into an array 
	public void createWordArray() {
	
		 //generate random word 
		  String [] possibleWords = {"ADULT","AIR","AIRPORT","ALBUM","ALPHABET","APPLE","ARM","ARMY","BABY","BACKPACK",
				  "BALLOON","BANANA","BANK","BARBECUE","BATHROOM","BED","BEE","BIBLE","BIBLE","BIRD","BOOK","BOSS","BOTTLE",
				  "BOWL","BOX","BOY","BRAIN","BRIDGE","BUTTERFLY","BUTTON","CAR","CARPET","CARROT","CAVE","CHAIR","CHESS",
				  "CHIEF","CHILD","CHISEL","CHOCOLATES","CHURCH","CIRCLE","CIRCUS","CLOCK","COFFEE","COMET","COMPASS","COMPUTER"
				  ,"CRYSTAL","CUP","CYCLE","DATA","DESK","DIAMOND","DRESS","DRILL","DRINK","DRUM","EARS","EARTH","EGG",
				  "ELECTRICITY","ELEPHANT","ERASER","EYES","FAMILY","FAN","FEATHER","FESTIVAL","FILM","FIRE","FLOOD","FLOWER",
				  "FOOT","FORK","FREEWAY","FRUIT","GAME","GARDEN","GATE","GEM","GLOVES","GRAPE","GUITAR","HAT","HIGHWAY"
				  ,"HOROSCOPE","HORSE","HOSE","ICE","INSECT","JUNK","KITCHEN","LEATHER","LIBRARY","LIQUID","MAGNET","MAN",
				  "MAP","MAZE","MEAT","METEOR","MICROSCOPE","MILK","MIST","MONSTER","NAVY","NECKLACE","NEEDLE","ONION","PAINT"
				  ,"PANTS","PARACHUTE","PASSPORT","PEBBLE","PENDULUM","PEPPER","PERFUME","PILLOW","PLANE","PLANET","POCKET",
				  "POTATO","PRINTER","PRISON","PYRAMID","RADAR","RAINBOW","RECORD","RESTAURANT","RING","ROBOT","ROCK","ROCKET"
				  ,"ROOF","ROOM","ROPE","SADDLE","SALT","SANDPAPER","SANDWICH","SATELLITE","SCHOOL","SHIP","SHOES","SHOP",
				  "SHOWER","SIGNATURE","SKELETON","SOFTWARE","SOLID","SPACE","SPECTRUM","SPHERE","SPICE","SPIRAL","SPOON",
				  "SQUARE","STAIRCASE","STAR","STOMACH","SUN","SUNGLASSES","SWIM","SWORD","TABLE","TEETH","TELESCOPE",
				  "TELEVISION","TENNIS","THERMOMETER","TIGER","TOILET","TONGUE","TORCH","TORPEDO","TRAIN","TREADMILL",
				  "TRIANGLE","TUNNEL","TYPEWRITER","UMBRELLA","VACUUM","VAMPIRE","VIDEO","VULTURE","WATER","WEB","WINDOW"}; 
		 
		 word = possibleWords[(int)(Math.random()*(189))]; 
		  
		//separate all the letters into an array
		String [] array = new String [word.length()];
		for (int i = 0; i<word.length(); i++ ){
			array[i] = word.substring(i,i+1);
		}
		
		wordArray = array; 
		
	}

	
	public int getWordLength (){
		return wordArray.length; 
	}
	
	//creates the array list for displaying the dashes
	public void createDashArray (){
		ArrayList <String> arrayList  = new ArrayList <String>(); 
		for (int i = 0; i< word.length(); i++)
			arrayList.add("_" + " "); 
		display = arrayList; 
	}
	
	public void displayDashes(){
		System.out.println("Guess this word:");
		for (int j = 0; j<display.size(); j++)
			System.out.print(display.get(j)); 
		System.out.println("\n"); 

		}
	
	public void printGallows(){
		System.out.println("***********************************************");
		System.out.println("Lives: " +lives);
		System.out.println("          ______");
		System.out.println("	  |    |");
		System.out.println("	  |    ");
		System.out.println("	  |       ");
		System.out.println("	  |     "); 
		System.out.println("	  |       ");
		System.out.println("	  |        ");
		System.out.println("	  |");
		System.out.println("	-----");  
		displayDashes();
	}
	
	public void printHead(){
		System.out.println("***********************************************");
		System.out.println("Lives: " +lives);
		System.out.println("          ______");
		System.out.println("	  |    |");
		System.out.println("	  |    O");
		System.out.println("	  |       ");
		System.out.println("	  |     "); 
		System.out.println("	  |       ");
		System.out.println("	  |        ");
		System.out.println("	  |");
		System.out.println("	-----"); 
		displayDashes();

	}
	public void printBody(){
		System.out.println("***********************************************");
		System.out.println("Lives: "+lives);
		System.out.println("          ______");
		System.out.println("	  |    |");
		System.out.println("	  |    O");
		System.out.println("	  |    |");
		System.out.println("	  |    |"); 
		System.out.println("	  |   ");
		System.out.println("	  |   ");
		System.out.println("	  |");
		System.out.println("	-----"); 
		displayDashes();

	}
	public void printLeftArm (){
		System.out.println("***********************************************");
		System.out.println("Lives: "+lives);
		System.out.println("          ______");
		System.out.println("	  |    |");
		System.out.println("	  |    O");
		System.out.println("	  |  __|");
		System.out.println("	  |    |"); 
		System.out.println("	  |    ");
		System.out.println("	  |    ");
		System.out.println("	  |");
		System.out.println("	-----"); 
		displayDashes();

	}
	public void printRightArm (){
		System.out.println("***********************************************");
		System.out.println("Lives: " +lives);
		System.out.println("          ______");
		System.out.println("	  |    |");
		System.out.println("	  |    O");
		System.out.println("	  |  __|__");
		System.out.println("	  |    |"); 
		System.out.println("	  |    ");  
		System.out.println("	  |    ");
		System.out.println("	  |");
		System.out.println("	-----"); 
		displayDashes();

	}
	public void printLeftLeg (){
		System.out.println("***********************************************");
		System.out.println("Lives: "+ lives);
		System.out.println("          ______");
		System.out.println("	  |    |");
		System.out.println("	  |    O");
		System.out.println("	  |  __|__");
		System.out.println("	  |    |"); 
		System.out.println("	  |   / ");
		System.out.println("	  |  /   ");
		System.out.println("	  |");
		System.out.println("	-----");
		displayDashes();

	}
	public void printRightLeg(){
		System.out.println("***********************************************");
		System.out.println("YOU LOSE");
		System.out.println("          ______");
		System.out.println("	  |    |");
		System.out.println("	  |    O");
		System.out.println("	  |  __|__");
		System.out.println("	  |    |"); 
		System.out.println("	  |   / \\");
		System.out.println("	  |  /   \\");
		System.out.println("	  |");
		System.out.println("	-----"); 
		System.out.println("The correct answer was: " + word);

	}
	
	public void checkGuess (String guess){

		boolean containsGuess = false;  
		switch (lives) {
			case 6:
				for (int j=0; j< wordArray.length;j++){
					if (guess.equals(wordArray[j])){
						containsGuess = true; 
						display.set(j, guess +" ");
						correctGuesses++;
					}
				}
				
				if (containsGuess ==false){
					lives--;
					printHead();
				}
				
				else 
					printGallows();
				break;
				
			case 5:	
				for (int j=0; j< wordArray.length;j++){
					if (guess.equals(wordArray[j])){
						containsGuess = true; 
						display.set(j, guess);
						correctGuesses++;
					}
				}
				
				if (containsGuess ==false){
					lives--;
					printBody();
				}
				else 
					printHead();
				break;
				
			case 4:	
				for (int j=0; j< wordArray.length;j++){
					if (guess.equals(wordArray[j])){
						containsGuess = true; 
						display.set(j, guess);
						correctGuesses++;

					}
				}
				
				if (containsGuess ==false){
					lives--;
					printLeftArm();
				}
				else 
					printBody();
				break;
				
			case 3:	
				for (int j=0; j< wordArray.length;j++){
					if (guess.equals(wordArray[j])){
						containsGuess = true; 
						display.set(j, guess);
						correctGuesses++;
					}
				}
				
				if (containsGuess ==false){
					lives--;
					printRightArm();
				}
				else 
					printLeftArm();
				break;
				
			case 2:	
				for (int j=0; j< wordArray.length;j++){
					if (guess.equals(wordArray[j])){
						containsGuess = true; 
						display.set(j, guess);
						correctGuesses++;
					}
				}
				
				if (containsGuess ==false){
					lives--;
					printLeftLeg();
				}
				else 
					printRightArm();
				break;
				
			case 1:	
				for (int j=0; j< wordArray.length;j++){
					if (guess.equals(wordArray[j])){
						containsGuess = true; 
						display.set(j, guess);
						correctGuesses++;
					}
				}
				
				if (containsGuess ==false){
					lives--;
					printRightLeg();
				}
				else 
					printLeftLeg();
				break;
		}		
	}
}	

