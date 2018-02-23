package com.rt.exceptionexamples;

class Exception5 {
public static void main(String args[]) {
try {
int a = args.length;

int b = 42 / a;
System.out.println("a = " + a);

if(a==1) a = a/(a-a); 
if(a==2) {
int c[] = { 1 };
c[42] = 99; 
}
} catch(Exception e) {
System.out.println("Array index Out-of-bounds: " + e);

} 
}
}