package passwordGenerator;
import java.lang.Math;
import java.util.*;
import java.util.Scanner;

public class methodList {
	

public double getLowerCase() {
	char[] p = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	double randomIndex = Math.floor(Math.random() * 26);
	return randomIndex[p];
	
	}

public double getUpperCase() {
	char[] q = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	double randomIndex = Math.floor(Math.random() * 26);
	return randomIndex[q];
	
	}

public double getSymbol() {
	char[] a = {'!','(',')','"',',','_','-','{','}','[',']','~'};
	double randomIndex = Math.floor(Math.random() * 26);
	return randomIndex[a];
	}

public char getNumber() {
	char[] numbers = {'1','2','3','4','5','6','7','8','9'};
	randomIndex = Math.floor(Math.random() * 10);
	return randomIndex[numbers];
	}

	
}

	

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" This is a password generator");
		System.out.println(" your password must be 8 to 128 characters");
		System.out.println("it will include lower case");
		System.out.println("it will include upper case");
		System.out.println("it will include symbols");
		System.out.println("it will include numbers");
		
		
		boolean getLowerCaseOption;
		boolean getUpperCaseOption;
		boolean getSymbolOption;
		if(getLowerCaseOption == false && getUpperCaseOption == false && getSymbolOption == false )
	
		
	}

}
