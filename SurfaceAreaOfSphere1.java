/*
Java Program To Calculate And Display The Surface Area Of A Sphere.
Date: Tuesday, 28-July-2020
@author: Ankur Saxena
Platform: Linux Ubuntu 18.04 Lts/x64/Jdk 8/Atom text ediror

Surface area of a sphere:
---------------------------
A sphere is a perfectly round geometrical 3-dimensional object. It can be characterized as the set of
all points located distance rr (radius) away from a given point (center). It is perfectly symmetrical,
and has no edges or vertices.

// Image here

Foemula to calculate the Surface area of a Sphere = 4*pi*(r*r)
*/

//Program 1: Using Java Scanner Class

/*
Algorithm:
1. Start the program.
2. Get the value of the radius from the user.
3. Calculate the surface area of a sphere.
4. Print the surface area of a sphere.
5. Stop
*/

//import java package
import java.util.Scanner;

public class SurfaceAreaOfSphere1{
  public static void main (String[] args){

    //creating new Scanner
    Scanner sc = new Scanner (System.in);

    System.out.println ("Please enter the radius of the sphere: ");
    double radius = sc.nextDouble ();

    //calculate the surface area of a sphere
    double pi = 3.14;
    double surfacearea = 4 * pi * (radius * radius);

    //print the surface area of a sphere
    System.out.printf ("Surface area of a Sphere is :: %.2f\n",surfacearea);
  }
}

/*
Save this file as "SurfaceAreaOfSphere1.java"
Compile: $javac SurfaceAreaOfSphere1.java <press the Enter key>
Execute: $java SurfaceAreaOfSphere1 <press the Enter key>
Output:

Please enter the radius of the sphere:
5
Surface area of a Sphere is :: 314.00
*/
