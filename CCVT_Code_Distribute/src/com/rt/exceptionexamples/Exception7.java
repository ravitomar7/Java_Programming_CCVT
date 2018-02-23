package com.rt.exceptionexamples;

import java.io.IOException;

class Exception7 {
static void demoproc() throws IOException {
throw new IOException();//("demo");

}

public static void main(String args[]) throws IOException {

demoproc();

}
}