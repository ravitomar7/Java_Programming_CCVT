package com.rt.exceptionexamples;

class Exception4 {
public static void main(String args[]) {
try {
int a = 0;
int b = 42 / a;
} catch(ArithmeticException e) { // ERROR - unreachable
	System.out.println("This is never reached.");
	}
catch(Exception e) {
System.out.println("Generic Exception catch.");
}

}
}