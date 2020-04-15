import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] score;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here


    public Student(String firstname,String lastname,int id,int[] testScores){
        super(firstname,lastname,id);
        score = testScores;  
    }
    
  
      

   public String calculate(){
     
       String grade ="p";
      int sum=0,avg;
      for(int i=0;i<score.length;i++){
          sum=sum+score[i];
      }
      avg=sum/score.length;

    if(avg>=90 && avg<=100){
        grade= "O";
    }
    else if(avg>=80 && avg<90){
        grade= "E";
    }
    else if(avg>=70 && avg<80){
         grade= "A";
    }
    else if(avg>=55 && avg<70){
        grade= "P";
    }
    else if(avg>=40 && avg<55){
         grade="D";
    }
    else if(avg<40){
         grade= "T";
    }

   return grade;
   }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}