package com.exercise14oopmathematics.app;
import java.util.Scanner;
import com.exercise14oopmathematics.model.MathematicsOperations;
public class MathematicsApp {
	public static void main(String[] args) {
		//Variables Declaration
		double base = 0;
		double height = 0;
		double radio = 0;
		double side = 0;
		double result = 0;
		
		Scanner input = new Scanner(System.in);
		//MathematicsOperations math = new MathematicsOperations();
		
		System.out.println("Input the base: ");
		base = input.nextDouble();
		System.out.println("Input the height");
		height = input.nextDouble();
		
		result = MathematicsOperations.areaTriangle(base,height);
		System.out.println("The result of the Triangle area is: "+result);
		
		//System.out.println(MathematicsOperations.PI);
	}
}
