package com.rt.exceptionexamples;

class MyException extends RuntimeException {
private int detail;
MyException(int a) {
detail = a;
}
public String toString() {
return "MyException[" + detail + "]should be less than 10";
}
}
class Exception11 {
static void compute(int a)  {
System.out.println("Called compute(" + a + ")");
if(a > 10)
throw new MyException(a);
System.out.println("Normal exit");
}
public static void main(String args[]) {

compute(1);
compute(20);
}
}