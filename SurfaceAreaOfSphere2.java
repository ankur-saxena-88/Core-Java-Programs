/*
Java Program To Calculate And Display The Surface Area Of A Sphere.
Date: Tuesday, 28-July-2020
@author: Ankur Saxena
Platform: Linux Ubuntu 18.04 Lts/x64/Jdk 8/Atom text ediror
*/

//Program 2: Using Java BufferedReader Class

/*
Algorithm:
1. Start the program.
2. Get the value of the radius from the user.
3. Calculate the surface area of a sphere.
4. Print the surface area of a sphere.
5. Stop
*/

//import java packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SurfaceAreaOfSphere2{
  public static void main (String[] args)
  throws IOException{

    //creating new InputStreamReader
    InputStreamReader is = new InputStreamReader (System.in);

    //creating new BufferedReader
    BufferedReader br = new BufferedReader (is);

    System.out.println ("Please enter the radius of the sphere: ");
    double radius = Double.parseDouble (br.readLine ());

    //calculate the surface area of a sphere
    double pi = 3.14;
    double surfacearea = 4 * pi * (radius * radius);

    //print the surface area of a sphere
    System.out.printf ("Surface area of a Sphere is :: %.2f\n",surfacearea);
  }
}

/*
Save this file as "SurfaceAreaOfSphere2.java"
Compile: $javac SurfaceAreaOfSphere2.java <press the Enter key>
Execute: $java SurfaceAreaOfSphere2 <press the Enter key>
Output:

Please enter the radius of the sphere:
15.6
Surface area of a Sphere is :: 3056.60
*/
