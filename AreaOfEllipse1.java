/*
Java Program To Calculate And Display The Area Of A Ellipse.

Area of an ellipse: The formula to find the area of an ellipse is given below:
Area = pi * a * b

where:
---------
--> a is the distance from the center to a vertex.
--> b is the distance from the center to a co-vertex.

Example of Area of an Ellipse:
In the ellipse below a is 6 and b is 2, so the area of ellipse is 12*3.14
Area = 37.68

Date: Friday, 01-05-2020
@author: Ankur Saxena
Platform: Windows 8.1 32-bit/Jdk 8/VS Code text editor
*/

/*
Program 1: Using Java Scanner Class

Algorithm:
-------------
1. Get the value of a from the user.
2. Get the value of b from the user.
3. Calculate the Area of a Ellipse.
4. Print the Area.
*/

//importing java Scanner package
import java.util.Scanner;

public class AreaOfEllipse1{
    public static void main (String[] args){
        
        //creating new Scanner
        Scanner sc = new Scanner (System.in);

        System.out.println ("Please enter the value of a: ");
        double a = sc.nextDouble();

        System.out.println ("Please enter the value of b: ");
        double b = sc.nextDouble();

        //calculate the area of ellipse
        double pi = 3.14;
        double area = pi * a * b;

        //print the area
        System.out.println ("Area of Ellipse :: "+area);
    }
}

/*
Save this file as 'AreaOfEllipse1.java'
Compile: $javac AreaOfEllipse1.java
Execute: $java AreaOfEllipse1
Output:

Please enter the value of a:
6
Please enter the value of b:
2
Area of Ellipse :: 37.68

*/
