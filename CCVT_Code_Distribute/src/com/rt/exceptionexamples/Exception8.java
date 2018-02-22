package com.rt.exceptionexamples;

class Exception8 {
static void throwOne() throws IllegalAccessException {
System.out.println("Inside throwOne.");
throw new IllegalAccessException("demo");
//throw new ArithmeticException();
}
public static void main(String args[]) {
try {
	throwOne();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	System.out.println("Got it"+e.getMessage());
}
}
}