/*
Java Program To Calculate And Display The Total Surface Area Of A Cylinder.
Date: Friday, 22-05-2020
@author: Ankur Saxena
Platform: Ubuntu Linux 12.04 LTS/Jdk 8/Atom Text Editor

Formula to calculate the Total Surface Area of a Cylinder = (2*pi*r*r)+(2*pi*r*h)

Where,
r is the radius of the cylinder
h is the height of the cylinder

Algorithm:
------------
1. Get the radius of the cylinder from the user.
2. Get the height of the cylinder from the user.
3. Calculate the Total Surface Area of the Cylinder.
4. Print the Total Surface Area of the Cylinder.

*/

//Program 1: Using Java Scanner Class
//importing java scanner class
import java.util.Scanner;

public class TSAOfCylinder1{
  public static void main (String[] args){

    //creating new Scanner
    Scanner sc = new Scanner (System.in);

    System.out.println ("Please enter the radius of the cylinder :");
    double radius = sc.nextDouble();

    System.out.println ("Please enter the height of the cylinder :");
    double height = sc.nextDouble();

    //calculate tsa of the cylinder
    double pi = 3.14;
    double tsa = ((2*pi*radius*radius)+(2*pi*radius*height));

    System.out.println ("Total Surface Area of the Cylinder is : "+tsa);
  }
}

/*
Save this file as 'TSAOfCylinder1.java'
Compile: $javac TSAOfCylinder1.java
Execute: $java TSAOfCylinder1
Output:

Please enter the radius of the cylinder :
3
Please enter the height of the cylinder :
8
Total Surface Area of the Cylinder is : 207.24
*/
