import java.util.Scanner;
public class SphereVolume 
{ 
public static void main(String[] args) 
{
	
	System.out.println("This Program will calculate the volume of a sphere." + "\n" + "What is the diameter of the sphere?" + "\n");
	
	double diameter;
	double radius;
	double volume;
	
	Scanner input = new Scanner (System.in);
	
	diameter = input.nextDouble();
	System.out.println("Diameter = " + diameter + "\n");
	
	radius = diameter / 2;
	
	volume = (1.3333) * ((Math.PI) * (Math.pow(radius, 3)));
	
	System.out.println("Volume = " + volume + "\n");
	
	input.close();
	
} 
} 