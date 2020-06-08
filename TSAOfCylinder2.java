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

//Program 2: Using Java BufferedReader Class
//importing java bufferedreaderclass
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TSAOfCylinder2{
  public static void main (String[] args)
  throws IOException{

    //creating new InputStreamReader
    InputStreamReader is = new InputStreamReader (System.in);

    //creating new BufferedReader
    BufferedReader br = new BufferedReader (is);

    System.out.println ("Please enter the radius of the cylinder :");
    double radius = Double.parseDouble (br.readLine());

    System.out.println ("Please enter the height of the cylinder :");
    double height = Double.parseDouble (br.readLine());

    //calculate tsa of the cylinder
    double pi = 3.14;
    double tsa = ((2*pi*radius*radius)+(2*pi*radius*height));

    System.out.println ("Total Surface Area of the Cylinder is : "+tsa);
  }
}

/*
Save this file as 'TSAOfCylinder2.java'
Compile: $javac TSAOfCylinder2.java
Execute: $java TSAOfCylinder2
Output:

Please enter the radius of the cylinder :
4
Please enter the height of the cylinder :
3
Total Surface Area of the Cylinder is : 175.84
*/
