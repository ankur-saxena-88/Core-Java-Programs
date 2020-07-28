/*
Java Program To Calculate And Display The Surface Area Of A Cube.
Date: Monday, 15 June, 2020
@author: Ankur Saxena
Platform: Linux Mint 18/x86/Jdk 8/Atom text editor

Algorithm:
-------------

1. Start the program.
2. Get the length of edge of cube.
3. Calculate the Surface Area of the Cube.
4. Print the Surface Area of Cube.
5. Stop
*/

/*
A cube is a three-dimensional geometrical figure, having all its surfaces with equal sides.

Formula to calculate the Surface Area of a Cube = 6 x (side x side) = 6 x (a x a)
where,
=======
'a' is the length of any edge of the Cube.
a (side) = length = breadth = height
*/

//Program 1: Using Java Scanner Class
//import java package
import java.util.Scanner;

public class SurfaceAreaOfCube1{
  public static void main (String[] args){

    //creating new Scanner
    Scanner sc = new Scanner (System.in);

    System.out.println ("*** SURFACE AREA OF CUBE CALCULATOR ***\n");

    System.out.println ("Please enter the length of edge of Cube :");
    double length = sc.nextDouble ();

    //calculate the surface area of cube
    double cubeSArea = 6 * (length * length);

    //print the surface area of cube
    System.out.printf ("Surface Area of Cube :: %.4f\n", cubeSArea);
  }
}

/*
Save this file as 'SurfaceAreaOfCube1.java'
Compile: $javac SurfaceAreaOfCube1.java <press the Enter key>
Execute: $java SurfaceAreaOfCube1 <press the Enter key>
Output:

*** SURFACE AREA OF CUBE CALCULATOR ***

Please enter the length of edge of Cube :
5.12
Surface Area of Cube :: 157.2864
*/
