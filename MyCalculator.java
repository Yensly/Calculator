//: Yensly Castellanos
//: Youtube Link https://youtu.be/Nd1XMZkpL6o 
//: 91 code

 import java.util.Scanner;
public class MyCalculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner (System.in); // Scanner named scnr this will take in the users input 
		String ans="y"; // String variable that takes in the calculator mode
		boolean valid = false; // this checks if the user inputs a valid operation, if not it keeps looping
	while(ans.equalsIgnoreCase("y")) { //this gives the green light to keep going in the while loop 
		System.out.println("Enter the calculator mode: Standard/Scientific?");//: Asks user to choose Mode
		String y = scnr.next(); //: Takes user input
		if (y.equalsIgnoreCase("Standard")) { // If it's Standard mode, it prints this:
		System.out.println("The calculator will operate in standard mode.\n"
				           + "Enter '+' for addition,"
				           + " '-' for subtractions, '*' "
			               + "for multiplication, '/' for division");
		
	    String word = scnr.next(); //: Takes the user input
	    
	    if(word.equals("-") ||  // If the user input is valid, the code continues
	    		(word.equals ("+")) ||
	    		(word.equals("*")) ||
	    		(word.equals("/"))) {
	    	
	    	valid = true;
	    	
	    }
	    
	    while (valid == false) {// If not, the code loops until there is a valid operation chosen
	    	System.out.println("Invalid operator "+word);
	    	System.out.println("Enter '+' for addition,"
			           + " '-' for subtractions, '*' "
		               + "for multiplication, '/' for division");
	    	
		     word = scnr.next(); //: Processes user input 
	    	
	    	if(word.equals("-") || 
		    		(word.equals ("+")) ||
		    		(word.equals("*")) ||
		    		(word.equals("/"))) {
		    	
		    	valid = true;
		    	
	    	}
	    	
	    	break;
	  
	    }
	   
	    if ( word.equals( "-")) { //Initiates the subtract operation
	    	valid = true;
	    	System.out.println ("How many numbers do you want to subtract?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;++i) { //: Chosen "i=2" the first input is already existing 
		    	 holder -= scnr.nextDouble (); //;  Enter chosen amount of numbers
		    	//String ans=scnr.next();
		     } 
		     System.out.println ("Result: " + holder);    	
	    }
	    
	     else if ( word.equals( "+")) {//Initiates the addition operation
		    	valid = true;
	    	 System.out.println ("How many numbers do you want to add?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder += scnr.nextDouble (); //;  Enter chosen amount of numbers
		     } 
		     System.out.println ("Result: " + holder);
	    	 
		}else if ( word.equals( "*")) {//Initiates the multiplication operation
	    	valid = true;
			System.out.println ("How many numbers do you want to multiply?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder *= scnr.nextDouble (); //;  Enter chosen amount of numbers
		    	 
		}
		     System.out.println ("Result: " + holder);
		}
		 else if ( word.equals( "/")) { //Initiates the division operation
		    	valid = true;
			 System.out.println ("How many numbers do you want to divide?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder /= scnr.nextDouble (); //;  Enter chosen amount of numbers
		     } 
		     System.out.println ("Result: " + holder);
		}else { //: close off with "else"
			  System.out.println("Invalid operator "+word);
		}
	    
		}
		else if(y.equalsIgnoreCase("Scientific")){
			System.out.println ("The calculator will operate in scientific mode.");
			System.out.println    ("Enter '+' for addition, '-' for subtractions, '*'"
					               + " for multiplication, '/' for division, 'sin' for sin x, "
					               + "'cos' for cos x, 'tan' for tan x:"); 
            String word = scnr.next(); //: Processes user input 
            
            
        if ( word.equals( "-")) { //: Calls for the subtract method
	    	valid = true;
        	System.out.println ("How many numbers do you want to subtract?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;++i) { //: Chosen "i=2" the first input is already existing 
		    	 holder -= scnr.nextDouble (); //;  Enter chosen amount of numbers
		    	//String ans=scnr.next();
		     } 
		     System.out.println ("Result: " + holder);    
    	    }
    	    
        else if ( word.equals( "+")) {
	    	valid = true;
        	System.out.println ("How many numbers do you want to add?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder += scnr.nextDouble (); //;  Enter chosen amount of numbers
		     } 
		     System.out.println ("Result: " + holder);
       }else if ( word.equals( "*")) {
	    	valid = true;
    	   System.out.println ("How many numbers do you want to multiply?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder *= scnr.nextDouble (); //;  Enter chosen amount of numbers
		    	 
       }
        System.out.println ("Result: " + holder);
       }
        else if ( word.equals( "/")) {
	    	valid = true;
        	System.out.println ("How many numbers do you want to divide?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder /= scnr.nextDouble (); //;  Enter chosen amount of numbers
		     } 
		     System.out.println ("Result: " + holder);
                       }
        
        
        else if ( word.equals( "sin")) {
        	System.out.print ("Enter a number in radians to find the sine"); 
	    	valid = true;
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter a number
		     System.out.println ("Result: " + Math.sin(Num)); // performs the sine operation on the number
	
       }else if ( word.equals( "cos")) {
	    	valid = true;
    	   System.out.print ("Enter a number in radians to find the cosine"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter A number
		     System.out.println ("Result: " + Math.cos (Num)); // performs the cosine operation on the number
       }
        else if ( word.equals( "tan")) {
	    	valid = true;
        	System.out.println ("Enter a number in radians to find the tangent"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter A number
		     System.out.println ("Result: " + Math.tan(Num)); // performs the tan operation on the number
	
       }else {
    	   System.out.println("Invalid operator"+word); // if the operator is invalid, it will state so
    		
    		}
		}System.out.println("Do you want to start over? (Y/N)");//This prints out and ask the user if they will want to start over if yes the while loop will keep going 
	   		ans =  scnr.next();
 	   		
		  if (ans.equalsIgnoreCase("N")){// if the user puts N the calculator will 
	             System.out.println("Goodbye");//it will print out good bye after the user puts N for no 
	             break;}//breaks and stop the while loop 
		
	           
		}
	
	}
		//:start to subtraction
		 public static void subtract () {  
			 Scanner scnr = new Scanner (System.in);
			 System.out.println ("How many numbers do you want to subtract?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;++i) { //: Chosen "i=2" the first input is already existing 
		    	 holder -= scnr.nextDouble (); //;  Enter chosen amount of numbers
		    	//String ans=scnr.next();
		     } 
		     System.out.println ("Result: " + holder);    
}
		 //:Start to addition 
		 public static void add() { 
			 Scanner scnr = new Scanner (System.in);
			 System.out.println ("How many numbers do you want to add?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder += scnr.nextDouble (); //;  Enter chosen amount of numbers
		     } 
		     System.out.println ("Result: " + holder);
		    
		 }
		 
		 //:start to division method 
		 public static void div() {	
			 Scanner scnr = new Scanner (System.in);
			 System.out.println ("How many numbers do you want to divide?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder /= scnr.nextDouble (); //;  Enter chosen amount of numbers
		     } 
		     System.out.println ("Result: " + holder);
		 }
		 //: the start to the multiply method 
		   public static void mult() {
			 Scanner scnr = new Scanner (System.in);
			 System.out.println ("How many numbers do you want to multiply?"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Enter " + Num + " numbers");
		     double holder = scnr.nextDouble();  //: The "double" initializes the variable with the first input
		     for(int i = 2; i <= Num;i++) { //: Chosen "i=2" the first input is already existing 
		    	 holder *= scnr.nextDouble (); //;  Enter chosen amount of numbers
		    	 
		     } 
		     System.out.println ("Result: " + holder);
			 
		 }
		    public static void sin () {  
			 Scanner scnr = new Scanner (System.in);
			 System.out.print ("Enter a number in radians to find the sine"); 
			 int Num;
		     Num = scnr.nextInt(); //: asks you to enter numbers
		     System.out.println ("Result: " + Math.sin(Num));
	
		     } 
		    public static void cos () {  
				 Scanner scnr = new Scanner (System.in);
				 System.out.print ("Enter a number in radians to find the cosine"); 
				 int Num;
			     Num = scnr.nextInt(); //: asks you to enter numbers
			     System.out.println ("Result: " + Math.cos (Num));
		
			     } 
		    public static void tan () { 
				 Scanner scnr = new Scanner (System.in);
				 System.out.print ("Enter a number in radians to find the tangent"); 
				 int Num;
			     Num = scnr.nextInt(); //: asks you to enter numbers
			     System.out.println ("Result: " + Math.tan(Num));
		
			     } 
		 
}


	
