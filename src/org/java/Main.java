package org.java;

public class Main {
public static void main(String[] args) {
	
	Smartphone Iphone = new Smartphone("Iphone", "Ottimo", 125, 22, "2VXXT-JDXTX-2GVP3-XPXVX-V42GV" , 256);
	System.out.println(Iphone);
	
	System.out.println("------------------------------------");
	
	Televisore Samsung = new Televisore("samsung", "Ottimo", 125, 22, 48, true);
	System.out.println(Samsung);
	
	System.out.println("------------------------------------");
	
	Cuffie Bose = new Cuffie("Bose", "Ottimo", 125, 22, "Nere", true);
	System.out.println(Bose);
}
}
