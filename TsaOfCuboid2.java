//Program 2: Using Java BufferedReader Class

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

//import java packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TsaOfCuboid2{
  public static void main (String[] args)
  throws IOException{

    //creating new InputStreamReader
    InputStreamReader is = new InputStreamReader (System.in);

    //creating new BufferedReader
    BufferedReader br = new BufferedReader (is);

/*
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
*/

    System.out.println ("***** TOTAL SURFACE AREA OF THE CUBOID CALCULATOR *****\n");

    System.out.println ("Please enter the height of the cuboid : ");
    double height = Double.parseDouble (br.readLine());

    System.out.println ("Please enter the width of the cuboid : ");
    double width = Double.parseDouble (br.readLine());

    System.out.println ("Please enter the length of the cuboid : ");
    double length = Double.parseDouble (br.readLine());

    //calculate the tsa of cuboid
    double tsaCuboid = 2*(length*width+width*height+height*length);

    //print tsa of cuboid
    System.out.printf ("Total surface area (TSA) of cuboid is :: %.2f\n",tsaCuboid);
  }
}

/*
Save this file as 'TsaOfCuboid2.java'
Compile: $javac TsaOfCuboid2.java <press the Enter key>
Execute: $java TsaOfCuboid2 <press the Enter key>
Output:

***** TOTAL SURFACE AREA OF THE CUBOID CALCULATOR *****

Please enter the height of the cuboid :
7.2
Please enter the width of the cuboid :
3.4
Please enter the length of the cuboid :
4.8
Total surface area (TSA) of cuboid is :: 150.72
*/
