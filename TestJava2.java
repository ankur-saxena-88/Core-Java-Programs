// program start

class Ttx2
{
    public void m1()
    {
        String str = "I'm coming back to the race.";

        System.out.println(str);
    }
}
public class TestJava2
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

// save this file as 'TestJava2.java'
// compile: $ javac TestJava2.java [Hit Enter]
// execute: $ java TestJava2 [Hit Enter]

/*
output:

Hello, Java World!

I'm coming back to the race.
*/
