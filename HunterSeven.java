//ST10033578
import java.util.Scanner;

public class HunterSeven{  
	
	have the abbity for the player to searchg up on the enmy theyre facing
	
	
	Scanner scan = new Scanner(System.in); //for user input
	public int ambition = 100;   //represnts the useer's will
	public int love = 100;       //represnts the user's desire
	public int damageMin;
	public int damageMax;  
	public int distance;         // measures how far to combatants are from eachother
	public int accuarcy;         // shows hopw easy it is for ther user toi hiut its target
	public int evasion;          // shows how hard it is to hit yoiu
	public int optimalDistance;  // shows where the weapon's best distance is for the best reslkts
	public String inputStr;      // used to get user input
	public int inputInt;         //used to get user input

	Scanner scan = new Scanner(System.in); //for user input
		  
  static void theAdventureBegins() 
	{ System.out.println("You are Hunter Seven, an adventurer of the Feyrun Kingdom and you  quest for love." 
	    + "\n You have varios stats that are used throughout your quest named: "
	    + "\n LOVE: This shows how much you desire for LOVE and if it drops to 0 you die" 
	    + "\n Ambiton: Which is used to bring your own desires into reality and if it drops to 0 then you drown into hopelessness" 
	    + "\n"  
	    + "\n As you go throughh this quest you will be able a  descrtiotpn of the area, people and people will talk then you can choose one of 2 options. "
	    + "In combat you will have more options to defeat your foes but do not expect them to die easily"
	    + "\n"
	    + "\n In the darkness of your sleep steadily aproaches a floating figure, "
	    + "as it draws nearer you see its somewhat humanoid details. "
	    + "It wears an eerie teal open jacket from its right sleeve three tenatckes lash out, two bloody red and a disgusting purple tenctale holding a cane"
	    + "and its left sleeve covers whatever is under utterly. "
	    + "Its head simply does not exist instead there's a hat above its shoulders roughly where a hat should go if it had a head, "
	    + "a sly, arrogantly glowly smile drips below an ever winking pair of eyes"
	    + " but the strangesdt part is that its legs are the most unordinary ever. A pair of plain, bland pants adn hugh heels."
	    + "\n \"What is it that you LOVE?\" "
	    + "\n \" What is it that you desire?\" Its unwinking eye stares directly over you as its words crash into your being" 
	    + "\n 1) I wish to fell gods" 
	    + "\n 2) I wish to fall in love");
	
	 inputStr = scan.next();
	 inputInt = Integer.parseInt(inputStr); 
	 
	if( inputInt == 1) 
	  {ambition = ambition + 10;
	   System.out.prinln("Your ambition grows" + "\n Ambition is now " + ambition);}
	 else 
	   {love = love + 10;
		System.out.prinln("Your Love grows" + "\n Love is now " + love);}
	  
	 System.out.println("\"Very good adventurer, let your quest begin.\"");}
  
  static void wakeUp() {
	  
  System.out.println("You are rudely awoken by banging on your door and the smell of pee from you are nearly certain the overly cheap inn room your staying in. "
  		+ "\n \"HUNTER!! WAKE UP!\" The voice is a blasting command that rocks the wooden room. "
  		+ "\n \"WAKE UP! HUNTER SEVEN!\" "
  		+ "\n What do you do?"
  		+ "\n 1) Answer the door."
  		+ "\n 2) Go back to sleep.");
	  
  System.out.println("You don't exactly get out of bed, more fall but at least the visitor doesnt seem to hear the thud as you hit the floor. "
  		+ "Nearly ripping the barely door off its hinges you open it "
  		+ "and see a towering noble lady, built like a fort, glaring at you"
  		+ "her shining armour carvbed with magical runes makes you squint  "
  		+ "Behind her a sea blue cape billows, it has symbols of swords and myraid of weaponary. "
  		+ "You have to crane your neck see her face. Her eyes."
  		+ "\"I am Lady Roson of the Fluxblast Clan \" ");
  }
  
	
public static void main(String args[])
{ 
   
	
	theAdventureBegins();
//So the basic idea of hunter7 is that ur an adventurer on a quest and depeneding on ur actions
// u may die, fall in love or kill god. 
	
        
}}
