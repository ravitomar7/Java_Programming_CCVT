package com.rt.exceptionexamples;

class Exception2 {
public static void main(String args[]) {
int d, a;

try { // monitor a block of code.
d = 1;
a = 42 / d;
int a1[]=new int[10];
a1[11]=21;
System.out.println("This will not be printed.");
//throw new IllegalAccessException();
} catch (ArithmeticException e) { // catch divide-by-zero error
System.out.println("Division by zero.");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Array error");
}

catch(Exception o)
{
	System.out.println("Super Exception");
}

System.out.println("After catch statement.");
}
}