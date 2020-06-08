/*
Java Program To Calculate And Display The Total Surface Area Of A Cone.
Date: Saturday, 23-05-2020
@author: Ankur Saxena
Platform: Ubuntu Linux 12.04 Lts/32-bit/Jdk 8/Atom text editor
*/

/*
Formula to calculate the Total Surface Area of the Cone is 'Circle area + Cone Area'

Formula: Total Surface Area of the Cone = pi*r*r+pi*r*l

where,
r is the radius of the cone
l is the slant height of the cone
h is the height of the cone
*/

/*
Algorithm:
-------------
1. Start
2. Get the radius of the cone from the user.
3. Get the height of the cone from the user.
4. Calculate the slant height (l) of the cone.
5. Print the slant height (l).
6. Calculate the total surface area of the cone (tsa).
7. Print the total surface area of the cone (tsa).
8. Stop
*/

//Program 2: Using Java BufferedReader Class
//importing java packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class TSAOfCone2{
  public static void main (String[] args)
  throws IOException{
    //creating new InputStreamReader
    InputStreamReader is = new InputStreamReader (System.in);

    //creating new BufferedReader
    BufferedReader br = new BufferedReader (is);

    System.out.println ("Please enter the radius of the cone :");
    double radius = Double.parseDouble (br.readLine());

    System.out.println ("Please enter the height of the cone :");
    double height = Double.parseDouble (br.readLine());

    //calculate slant height of the cone
    //using pythagoras theorem
    double slantHeight = Math.sqrt ((height*height)+(radius*radius));

    //print the value of the slant height of the cone
    System.out.printf ("Slant Height of the Cone is : %.2f",slantHeight);

    //calculate the total surface area of the cone
    double pi = 3.14;
    double tsa = (pi*radius*radius)+(pi*radius*slantHeight);

    //print the value of the total surface area of the cone
    System.out.printf ("\nTotal Surface Area of the Cone is : %.2f",tsa);
  }
}

/*
Save this file as 'TSAOfCone2.java'
Compile: $javac TSAOfCone2.java
Execute: $java TSAOfCone2
Output:

Please enter the radius of the cone :
3
Please enter the height of the cone :
8
Slant Height of the Cone is : 8.54
Total Surface Area of the Cone is : 108.74
*/
