package com.dss;

class Abc{
    void m1(){
        
        System.out.println ("Ankur Saxena Blogs!");
    }
}

class Abc1{
    public static void main (String[] args){
        
        //creating new object
        Abc t = new Abc();
        
        t.m1();
    }
}

/*
Save this file as ‘Abc1.java’
Compile: $javac –d . Abc1.java
Execute: $java com.as.Abc1

Note: where –d represents current directory.

Output:

*/
