// program start

class Ttx2
{
    public void m1()
    {
        String str = "I'm coming back to the race.";

        System.out.println(str);
    }
}

public class HelloWorld2
{
    public static void main (String[] args)
    {
        System.out.println("Hello, Java World!\n");

        Ttx2 obj = new Ttx2();

        // call the m1() method
        obj.m1();
    }
}

// program end

// save this file as 'HelloWorld2.java'
// compile: $ javac HelloWorld2.java [Hit Enter]
// execute: $ java HelloWorld2 [Hit Enter]

/*
output:

Hello, Java World!

I'm coming back to the race.
*/
