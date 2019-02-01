import java.util.Scanner;

class Addition
{
    public static void main (String[] args) // main or static method
    {
        // main or static method area
        System.out.println ("Please enter any two numbers :\n");
        // creating new Scanner object
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        // output result
        System.out.println ("\n\nSum of "+num1+" and "+num2+" is "+sum);
    }
}
