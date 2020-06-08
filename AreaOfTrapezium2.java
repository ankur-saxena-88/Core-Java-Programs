/*
Java Program To Calculate And Display The Area Of The Trapezium.
Date: Monday, 01-06-2020
@author: Ankur Saxena
Platform: Linux Mint 18/32-bit/Jdk 8/Atom text editor

Algorithm:
-------------
1. Start the Program.
2. Get the length of the two parallel sides of the trapezium from the user.
3. Get the height of the trapezium from the user.
4. Calculate the Area of the Trapezium.
5. Print Area of the Trapezium.
6. Stop.

Example: Find the area of the following Trapezium
length1 = 20
length2 = 14
height = 12

Area of the Trapezium = (lenght1 + length2) * h /2

= (20+14)*12/2
= 34x12/2
= 408/2 = 204
*/

//Program 2: Using Java BufferedReader Class
//import java packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AreaOfTrapezium2{
  public static void main (String[] args)
  throws IOException{

    //creating new InputSreamReader
    InputStreamReader is = new InputStreamReader (System.in);

    //creating new BufferedReader
    BufferedReader br = new BufferedReader (is);

    /*
    OR
    BufferedReader br = new BufferedReader (new InputSreamReader (System.in));
    */

    System.out.println ("****** AREA OF A TRAPEZIUM CALCULATOR ******\n");
    System.out.println ("Please enter the length of the two parallel sides of the Trapezium :");
    double lenght1 = Double.parseDouble (br.readLine());
    double length2 = Double.parseDouble (br.readLine());
    System.out.println ("Please enter the height of the Trapezium :");
    double height = Double.parseDouble (br.readLine());

    //calculate the area of the trapezium
    double trapeziumArea = (lenght1 + length2) * height / 2;

    //print area of the trapezium
    System.out.println ("Area of the Trapezium is :: "+trapeziumArea);
  }
}

/*
Save this file as 'AreaOfTrapezium1.java'
Compile: $javac AreaOfTrapezium1.java
Execute: $java AreaOfTrapezium1
Output:

****** AREA OF A TRAPEZIUM CALCULATOR ******

Please enter the length of the two parallel sides of the Trapezium :
5
6
Please enter the height of the Trapezium :
8
Area of the Trapezium is :: 44.0

*/
