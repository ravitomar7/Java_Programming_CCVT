package com.rt.string;
import java.util.StringTokenizer;

import com.rt.cloning.Employee;


public class forStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ch[]={'h','e','l','l','o'};
		
		System.out.println(ch);

		String str=new String(ch);
		System.out.println(str);

		System.out.println(str.equals(ch));

		
		String s1="Example of being immutable";
		String s2="Example of being immutable";//
		System.out.println("Checking s1 & s2 "+(s1==s2));
		
		String s3=new String("Example of being immutable");//
		System.out.println("checking s1 & s3 "+(s1==s3));
		System.out.println("Checking s1 & s2"+s1.equals(s2)+"\nchecking s1 & s3"+s1.equals(s3));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		
		s3=s3.intern();
		System.out.println("checking s1 & s3 "+(s1==s3));
		
		String s41="abc";
		String s51="abc";
		String s61="abcdef";
		System.out.println(s41==s51);//true
		String s71=new String("abc");
		s71=s71+"def";
		System.out.println(s71);//abcdef
		System.out.println(s61);//abcdef
//		s71=s71.intern();
		System.out.println(s61==s71);//false
		//s51.concat("def");System.out.println("hghgj"+s51);
		StringBuffer tt=new StringBuffer("abc");
		tt.append("defssss");
		
		System.out.println(tt);
		
		
		
		
		
		
		//String s1="Example of being immutable";
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.format("Hey there %d and %d results in %d", 2,3,5));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 9));
		System.out.println(s2.substring(0, 1));//start index end index
		System.out.println(s1.contains("bein"));
		System.out.println(s1.isEmpty());
		
		String s4="Hi this is";
		String s5="CCVT at UPES";
		String s6=s4+s5;//	String s6=(new StringBuilder()).append(s4).append(s5).toString();  
		System.out.println(s6);
		s4.concat(s5);//being immutable
		System.out.println(s4);
		s4=s4.concat(s5);
		System.out.println(s4);
		
		s1.replace('o', 'q');
		System.out.println(s1);
		
		s1=s1.replace("being", "not");
		System.out.println(s1);
		String s7="    after 5 space";
		System.out.println(s7);
		System.out.println(s7.trim());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.startsWith("Ex"));
		System.out.println(s1.endsWith("le"));
		
		int a=10;
		String s8=String.valueOf(a);
		
		System.out.println(s8+12);
		
		
		////******************STRING BUFFER
		/*
		*/
		System.out.println("****************STRING BUFFER NOW***************");
		StringBuffer sf1=new StringBuffer();//can be passed with int or string
//sf1.append("aaaaaaaaaaaaaaaaa");
		System.out.println(sf1.capacity()+""+sf1);
		sf1.append("few string to append");
		System.out.println(sf1);
		sf1.insert(0, "see more appended ");
		System.out.println(sf1);
		sf1.replace(0, 8, "deleted");
		System.out.println(sf1);
		sf1.delete(0, 7);
		System.out.println(sf1);
		sf1.reverse();
		System.out.println(sf1);
//		sf1.ensureCapacity(50);
		System.out.println(sf1.capacity());
		
		StringBuilder sb1=new StringBuilder();//can be passed with int or string
		
		sb1.reverse();
		System.out.println(sb1.capacity()+""+sb1);
		sb1.append("few string to append");
		System.out.println(sb1);
		sb1.insert(0, "see more appended ");
		System.out.println(sb1);
		sb1.replace(0, 8, "deleted");
		System.out.println(sb1);
		sb1.delete(0, 7);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
//		sb1.ensureCapacity(500);
		System.out.println(sb1.capacity());
		
		
		//	toString method tgo be explained
		String s9="This, string, will, be, tokenized";
		StringTokenizer stk=new StringTokenizer(s9,"s");
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
		
		String s10[]=s9.split(",");
		System.out.println(s10.length);
		System.out.println(s10[0]+" XX"+s10[1]+" XX"+s10[2]);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
