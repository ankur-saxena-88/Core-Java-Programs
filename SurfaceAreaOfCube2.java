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

//Program 2: Using Java BufferedReader Class
//import java packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SurfaceAreaOfCube2{
  public static void main (String [] args)
  throws IOException{

    //creating new InputStreamReader
    InputStreamReader is = new InputStreamReader (System.in);
    //creating new BufferedReader
    BufferedReader br = new BufferedReader (is);

    System.out.println ("*** SURFACE AREA OF CUBE CALCULATOR ***\n");

    System.out.println ("Please enter the length of edge of Cube :");
    double length = Double.parseDouble (br.readLine());

    //calculate the surface area of cube
    double cubeSArea = 6 * (length * length);

    //print the surface area of cube
    System.out.printf ("Surface Area of Cube :: %.4f\n", cubeSArea);
  }
}

/*
Save this file as 'SurfaceAreaOfCube2.java'
Compile: $javac SurfaceAreaOfCube2.java <press the Enter key>
Execute: $java SurfaceAreaOfCube2 <press the Enter key>
Output:

*** SURFACE AREA OF CUBE CALCULATOR ***

Please enter the length of edge of Cube :
15
Surface Area of Cube :: 1350.0000
*/
