/*
 * Name: DeJonte July
 * Date: 09/18/2019
 * Section: 1115
 * Homework Week 3
 * JulyProblem3a
 */

import java.util.Scanner;
public class JulyProblem3a {
	//Class name
	
	public static void main(String[] args) {
		//This is the main method
		
		Scanner input = new Scanner(System.in);
		//Here I initialize my scanner
		
		System.out.println("Enter the coordiantes of point 1");
		System.out.println("Enter x1: ");
		System.out.println("Enter y1: ");
		//Here I ask the user for the x and y coordinates of the first point 
		
		System.out.println("Enter the coordinates of point 2");
		System.out.println("Enter x2: ");
		System.out.println("Enter y2: ");
		//Here I ask the user for the x and y coordinates of the second point 
		
		
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		//Here I define my variables for the coordinates x1,x2,y1,y2 and allow the to be set to the numbers that the user enters
		
		int coor1 = (x2 - x1);
		//Here I create a variable named coor1 to store the value of x2-x1
		int coor2 = (y2 - y1);
		//Here I create a variable named coor2 to store the value of y2-y1
		double square1 = Math.pow(coor1, 2);
		//The variable square1 is created to store the value of coor1 squared 
		double square2 = Math.pow(coor2, 2);
		//The variable square2 is created to store the value of coor2 squared
		double add = square1 + square2;
		//Variable add adds square1 and square2 
		double answer = Math.pow(add, 0.5);
		//Variable answer finds the square root of the variable add
		
		System.out.printf("The distance between point 1 and point 2 is %.3f ", answer);
		// This print line prints the final answer
		
		input.close();
		//This closes off the scanner 
		
	}

}
