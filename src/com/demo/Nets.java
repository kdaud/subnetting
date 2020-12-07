package com.demo;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Nets {
	
	public static void myData() throws UnknownHostException {
		Inet4Address inet4Address = (Inet4Address) Inet4Address.getLocalHost();
		System.out
		        .println(inet4Address.getHostAddress() + " " + inet4Address.getHostName() + " "
		                + inet4Address.getAddress().toString());
	}
	
	public static void main(String[] args) throws UnknownHostException {
		myData();
	}
	
}
