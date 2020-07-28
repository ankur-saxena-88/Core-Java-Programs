/*
In this tutorial, we will learn how to create a Java program to calculate and display the total surface
area (TSA) of the Cuboid.

The total surface area (TSA) of a cuboid is the sum of the areas of its six faces. i.e.

Total Surface Area (TSA) of a cuboid = 2*(lw+wh+hl)

//image here

where,
h is the height of the cuboid
w is the width of the cuboid
l is the length of the cuboid
*/

//Program 1: Using Java Scanner Class

/*
Java Program to calculate and display the total surface area (TSA) of the cuboid.
Date: Monday, June 29, 2020
@author: Ankur Saxena
Platform: Linux Mint 18/64-bit/Jdk 8/Atom text edotor
*/

/*
Algorithm:
-------------
1. Start
2. Get the height of the cuboid from the user.
3. Get the width of the cuboid from the user.
4. Get the length of the cuboid from the user.
5. Calculate the TSA of cuboid.
6. Print TSA of cuboid.
7. Stop
*/

//import java package
import java.util.Scanner;

public class TsaOfCuboid1{
  public static void main (String[] args){

    //creating new Scanner
    Scanner sc = new Scanner (System.in);

    System.out.println ("***** TOTAL SURFACE AREA OF THE CUBOID CALCULATOR *****\n");

    System.out.println ("Please enter the height of the cuboid : ");
    double height = sc.nextDouble ();

    System.out.println ("Please enter the width of the cuboid : ");
    double width = sc.nextDouble ();

    System.out.println ("Please enter the length of the cuboid : ");
    double length = sc.nextDouble ();

    //calculate the tsa of cuboid
    double tsaCuboid = 2*(length*width+width*height+height*length);

    //print tsa of cuboid
    System.out.printf ("Total surface area (TSA) of cuboid is :: %.2f\n",tsaCuboid);
  }
}

/*
Save this file as 'TsaOfCuboid1.java'
Compile: $javac TsaOfCuboid1.java <press the Enter key>
Execute: $java TsaOfCuboid1 <press the Enter key>
Output:

***** TOTAL SURFACE AREA OF THE CUBOID CALCULATOR *****

Please enter the height of the cuboid :
5
Please enter the width of the cuboid :
6
Please enter the length of the cuboid :
8
Total surface area (TSA) of cuboid is :: 236.00
*/
