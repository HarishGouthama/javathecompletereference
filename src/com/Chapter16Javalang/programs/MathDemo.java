package com.Chapter16Javalang.programs;

public class MathDemo {
public static void main(String[] args) {
	
	 double arg = 60;
	 double arg2 = 60;
	 int arg1 = 3;
	 int arg3 = 6;
	 float arg4 = 5.5f;
	 
	 System.out.println(Math.sin(arg));
	 System.out.println(Math.cos(arg));
	 System.out.println(Math.tan(arg));
	 System.out.println();
	 System.out.println(Math.asin(arg));
	 System.out.println(Math.acos(arg));
	 System.out.println(Math.atan(arg));
	 System.out.println(Math.atan2(arg , arg2));
	 System.out.println();
	 System.out.println(Math.sinh(arg));
	 System.out.println(Math.cosh(arg));
	 System.out.println(Math.tanh(arg));
	 System.out.println();
	 System.out.println(Math.cbrt(arg));
	 System.out.println(Math.exp(arg));
	 System.out.println(Math.expm1(arg));
	 System.out.println(Math.log(arg));
	 System.out.println(Math.log10(arg));
	 System.out.println(Math.log1p(arg));
	 System.out.println(Math.pow(arg , arg2));
	 System.out.println(Math.scalb(arg , arg1));
	 System.out.println(Math.scalb(arg4 , arg3));
	 System.out.println(Math.sqrt(arg));
	 System.out.println();
	 System.out.println(Math.abs(arg1));
	 System.out.println(Math.ceil(arg1));
	 System.out.println(Math.floor(arg1));
	 System.out.println(Math.max( 10,  20));
	 System.out.println(Math.max(20.36, 30.456));
	 System.out.println(Math.nextAfter(3456.2546, 50456.25123));
	 System.out.println(Math.nextUp(2235.25456));
	 System.out.println(Math.rint(213.254));
	 System.out.println(Math.round(654.2546));
	 System.out.println(Math.ulp(3256.21546));
	 System.out.println();
	 System.out.println(Math.copySign(-6452.25, 1));
	 System.out.println(Math.getExponent(2025135));
	 System.out.println(Math.IEEEremainder(30, 50));
	 System.out.println(Math.hypot(3, 4));
	 System.out.println(Math.random());
	 System.out.println(Math.signum(12350125.25));
	 System.out.println(Math.toDegrees(6));
	 System.out.println(Math.toRadians(30));
}
}
