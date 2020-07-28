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

//Program 2: Using Java BufferedReader Class

//import java packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LsaOfCuboid2{
    public static void main (String [] args)
    throws IOException{

        //creating new InputStreamReader
        InputStreamReader is = new InputStreamReader (System.in);

        //creating new BufferedReader
        BufferedReader br = new BufferedReader (is);

        System.out.println ("Please enter the length of the cuboid:");
        double length = Double.parseDouble (br.readLine());

        System.out.println ("Please enter the width of the cuboid:");
        double width = Double.parseDouble (br.readLine());

        System.out.println ("Please enter the height of the cuboid:");
        double height = Double.parseDouble (br.readLine());

        //calculate the lateral surface area (lsa) of the cuboid
        double lsa = 2*height*(length+width);

        //print the lateral surface area (lsa) of the cuboid
        System.out.printf ("Lateral surface area of the cuboid is : %.2f\n",lsa);
    }
}

/*
Save this file as 'LsaOfCuboid2.java'
Compile: $javac LsaOfCuboid2.java
Execute: $java LsaOfCuboid2
Output:

Please enter the length of the cuboid:
5
Please enter the width of the cuboid:
4
Please enter the height of the cuboid:
3
Lateral surface area of the cuboid is : 54.00
*/