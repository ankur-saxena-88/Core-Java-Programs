/*
Java Program To Calculate And Display The Area Of A Ellipse.

Date: Friday, 01-05-2020
@author: Ankur Saxena
Platform : Windows 8.1 32-bit/Jdk 8/VS Code text edtor

Formula of Area of Ellipse = pi * a * b

where:
---------
--> a is the distance from the center to a vertex.
--> b is the distance from the center to a co-vertex.
*/

/*
Program 2: Using Java BufferedReader Class

Algorithm:
-------------
1. Get the value of a from the user.
2. Get the value of b from the user.
3. Calculate the Area of a Ellipse.
4. Print the Area.
*/

// importhing java packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AreaOfEllipse2{
    public static void main (String[] args)
    throws IOException{

        //creating new InputSreamReader
        InputStreamReader is = new InputStreamReader (System.in);

        //creating new BufferedReader
        BufferedReader br = new BufferedReader (is);

        System.out.println ("Please enter the value of a: ");
        double a = Double.parseDouble (br.readLine());

        System.out.println ("Please enter the value of b: ");
        double b = Double.parseDouble (br.readLine());

        //calculate the area of ellipse
        double pi = 3.14;
        double area = pi * a * b;

        //print the area
        System.out.println ("Area of the Ellipse :: "+area);
    }
}

/*
Save this file as 'AreaOfEllipse2.java'
Compile: $javac AreaOfEllipse2.java
Execute: $java AreaOfEllipse2
Output:

Please enter the value of a:
12.10
Please enter the value of b:
6.15
Area of the Ellipse :: 233.66310000000001

*/
