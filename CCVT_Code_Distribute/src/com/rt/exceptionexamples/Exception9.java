package com.rt.exceptionexamples;

class Exception9 {
static void throwOne() {
System.out.println("Inside throwOne.");
try {
	throw new IllegalAccessException("demo");
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public static void main(String args[]) {

throwOne();

}}