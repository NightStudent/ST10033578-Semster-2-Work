import java.util.Scanner;
import java.util.Random;

public class battle extends fighter {
	  
		Scanner scan = new Scanner(System.in); //for user input
		int ambition = 100;   //represnts the useer's will
		int love = 100;       //represnts the user's desire
		
	 	String [] battleDescribtions; 
	 	
	    int [] banditKickstats = {100, 50, 0}; 
	        // element 0 = Health (100)
	        // element 1 = Mana (50)
	        // element 2 = Evasion  (0%)
	    
	 	int actionPoints; 
	    String inputStr;      
	        // used to get user input
	    int inputInt;      
	        //used to get user input
	    int distance = 5;  
	       // measures the distance you are from your f
	    int toHitMax = 100; 
	 	   // MJax value for any random to hit so that there are noit any weird huge values.
	   int accuracy;
	       // AValie to store random numbers generated
	   int damage;
		   // value to stor3e randomly genrated damage value.
		
		String [] distanceDisplay = { "E", "." , "." , ".", ".", ".",  "7"};
		int playerPostion = 6;        
	        // measures what postion the player is at
		int enemyPostion = 0;    
		    // Measdures what postion the enemy is at
		int playerLastPostion;
		String playerRep = "7";
		String enemyRep = "E";
			
	while(banditHealth >= 1) {  
		
	  actionPoints = 2;
	  for (int counter = 0; counter <= 4; counter++) 
	  {System.out.print(distanceDisplay[counter] + " ");}
	  
	 while(actionPoints > 0) { 
		   System.out.println("\n actionPoints: " + actionPoints);

		 System.out.println("\n 1Bandit Health: " + banditHealth);
	    
	     System.out.println("\n 1) Move Forward "
	     		+ "\n 2) Attack"
	     		+ "\n 3) Ambition Spells"
	     		+ "\n 4) Look at enemy Glossary");
		 inputStr = scan.next();
		 inputInt = Integer.parseInt(inputStr); 
		  
	     switch (inputInt) {
	     case 1:
	    	  System.out.println("\n 1) Move Forward"
	    	 		           +"\n 2) Move Back");
	     inputStr = scan.next();
	     inputInt = Integer.parseInt(inputStr); 
	       
	       if (inputInt == 1)
	       { playerLastPostion = playerPostion;
	    	 playerPostion = playerPostion - 1;   
	    	 distanceDisplay[playerPostion] = playerRep;
	    	 distanceDisplay[playerLastPostion] = playerLastPostionStr;
	    	 distance = playerPostion - enemyPostion;

	    	 for (int counter = 0; counter <= 6; counter++) 
	    	     {System.out.print(distanceDisplay[counter] + " ");}}
	              
	       
	     else{
	    	 
	    	 playerLastPostion = playerPostion;
	    	 playerPostion = playerPostion + 1; 
	    	 distanceDisplay[playerPostion] = playerRep;
	    	 distanceDisplay[playerLastPostion] = playerLastPostionStr;
	     }
	     
	    	 break;

	     case 2:
	    	 System.out.print(" Select what weapon you wsih t use"
	    	 		+ "\n 1) Sword"
	    	 		+ "\n 20 Spear");
	    	 inputStr = scan.next();
	         inputInt = Integer.parseInt(inputStr); 
	         
	           if (inputInt == 1) {
	    	 
	    	     if(distance == 1) 
	    	     { 
	    	    	 accuracy
	    	    	 swordStats[3]
	    	    	 toHitMax
	    	    	 
	    	    	 
	    	    if(TEST)	 
	    	    	 {damage = (int)(Math.random()*(swordStats[1] + swordStats[0] + 1 )+ swordStats[0]);  
	    	   banditHealth = banditHealth - damage;  
	    	   System.out.println("Damage = " + damage);}}  
	    	     else {System.out.println("Out of range");}}
	           
	           
	           else 
	           {  if(distance == 3) 
	    	     { 
		    	      
	    	    	
	    	    if(TEST)	 
	    	    	 {damage = (int)(Math.random()*(spearStats[1] + spearStats[0] + 1 )+ spearStats[0]);  
	    	   banditHealth = banditHealth - damage;  
	    	   System.out.println("Damage = " + damage);}}  
	    	     else {System.out.println("Out of range");}}
	     break;	   
	     
	    case 3:
	    	System.out.print(" Select what spell you wsih t use"
	    	 		+ "\n 1) Dash (Cost: 10)"
	    	 		+ "\n 2) Fire Lash (Cost: 20)"
	    	 		+ "\n 3) Reality Rip (cost: 50)");
	    	 inputStr = scan.next();
	         inputInt = Integer.parseInt(inputStr); 
	         
	        if (inputInt == 1) {
	             System.out.print("\n Used Dash");
	            
	             playerLastPostion = playerPostion;
	        	 playerPostion = playerPostion - 2;   
	        	 distanceDisplay[playerPostion] = playerRep;
	        	 distanceDisplay[playerLastPostion] = playerLastPostionStr;
	        	 distance = playerPostion - enemyPostion;

	        	 for (int counter = 0; counter <= 4; counter++) 
	        	     {System.out.print(distanceDisplay[counter] + " ");}
	            System.out.print("Your abition drains by 20");
	            ambition = ambition - 20;}
	        
	        else if(inputInt == 2) {
	             {if (distance == 2) 
	              { {System.out.print(" Used Fire Lash");}}
	               else {System.out.print("\n No Fire Lash");}}}
	        	      
	        else {System.out.print(" Used Reality Rip");}
	              {if (distance == 4) {
		          {System.out.print("\n Used Reality Rip");}}
	              else {System.out.print("\n No Reality Rip");}
	    break;}
	              
	    case 4:
	              
	    	System.out.print("Viewed Glosaary");
	              
	    break;}
	  
	    actionPoints--;}
	System.out.println("\n Your foe hasfallen and lies dead on the floor");
	}
  
}}
