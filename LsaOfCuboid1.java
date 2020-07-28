/*
In this tutorial we will learn how to create a java program to find the lateral surface area
of a cuboid.

// image of the cuboid
Formula for finding the lateral surface area of a cuboid:

LSA = 2h (l+w)

where,

l is the length of the cuboid
w is the width of the cuboid
h is the height of the cuboid
*/

/*
Java program to calculate and display the lateral surface area of a cuboid.
Date: Thursday, July 16, 2020
@author: Ankur Saxena
Platform: Linux Mint 18/x64/Jdk 8/Atom text editor

Algorithm:

1. Start
2. Get the length of the cuboid from the user.
3. Get the width of the cuboid from the user.
4. Get the height of the cuboid from the user.
5. Calculate the lateral surface area (lsa) of the cuboid.
6. Print the lateral surface area (lsa) of the cuboid.
7.End
*/

//Program 1: Using Java Scanner Class

//import java class
import java.util.Scanner;

public class LsaOfCuboid1{
    public static void main (String [] args){

        //creating new scanner
        Scanner sc = new Scanner (System.in);

        System.out.println ("Please enter the length of the cuboid:");
        double length = sc.nextDouble();

        System.out.println ("Please enter the width of the cuboid:");
        double width = sc.nextDouble();

        System.out.println ("Please enter the height of the cuboid:");
        double height = sc.nextDouble();

        //calculate the lateral surface area (lsa) of the cuboid
        double lsa = 2*height*(length+width);

        //print the lateral surface area (lsa) of the cuboid
        System.out.printf ("Lateral surface area of the cuboid is : %.2f\n",lsa);
    }
}

/*
Save this file as 'LsaOfCuboid1.java'
Compile: $javac LsaOfCuboid1.java
Execute: $java LsaOfCuboid1
Output:

Please enter the length of the cuboid:
8.6
Please enter the width of the cuboid:
5.4
Please enter the height of the cuboid:
4
Lateral surface area of the cuboid is : 112.00
*/