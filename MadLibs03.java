/**
 * @student.info
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import java.util.Scanner;  
 
public class MadLibs03
{
	String adj01;
	String food01;
	int number01;
	String units01;
	String liquid01;
	String container01;
	int number02;
	String units02;
	String food02;
	String adj02;
	int number03;
	String units03;
	String food03;
	String houseApp;
	int number04;
	String unitTime;
	String verb;
	
	public void getWords()
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter an adjective ---> ");
		adj01 = Input.next();
		System.out.print("Enter a food ---> ");
		food01 = Input.next();
		System.out.print("Enter a number(integer) ---> ");
		number01 = Input.nextInt();
		System.out.print("Enter a unit of measurement ---> ");
		units01 = Input.next();
		System.out.print("Enter a liquid ---> ");
		liquid01 = Input.next();
		System.out.print("Enter a type of container ---> ");
		container01 = Input.next();
		System.out.print("Enter a number(integer) ---> ");
		number02 = Input.nextInt();
		System.out.print("Enter a unit of measurement ---> ");
		units02 = Input.next();
		System.out.print("Enter a food ---> ");
		food02 = Input.next();
		System.out.print("Enter an adjective ---> ");
		adj02 = Input.next();
		System.out.print("Enter a number(integer) ---> ");
		number03 = Input.nextInt();
		System.out.print("Enter a unit of measurement ---> ");
		units03 = Input.next();
		System.out.print("Enter a food ---> ");
		food03 = Input.next();
		System.out.print("Enter a household appliance ---> ");
		houseApp = Input.next();
		System.out.print("Enter a number(integer) ---> ");
		number04 = Input.nextInt();
		System.out.print("Enter a unit of time ---> ");
		unitTime = Input.next();
		System.out.print("Enter a verb ---> ");
		verb = Input.next();
	}
	
	public void printMadLib03()
	{
		System.out.println();
		System.out.println("Recipe");
		System.out.println("Today I'm going to tell you how to make " 
		+ adj01 + " " + food01 + " pie. First, you need to boil " 
		+ number01 + " " + units01 + " of " + liquid01 
		+ " in a large " + container01 + 
		". Then, turn off the heat and stir in " + number02 
		+ " " + units02 + " of " + food02 + 
		". Keep mixing until it is very " + adj02 
		+ ". Next, add " + number03 + " " + units03 + " of " + food03
		+ ". When it is all mixed, place it in the " 
		+ houseApp + " for " + number04 + " " + unitTime 
		+ ". Take it out, cut it up, and " + verb + ".");
	}
}

/*
RUN OUTPUT:

*/