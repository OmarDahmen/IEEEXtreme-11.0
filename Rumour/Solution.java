// Score : 70%

// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
	String a,b,aux;
		int len,difflen,count;
		int q = in.nextInt();
		for(int i=0;i<q;i++)
{		
		 a= Integer.toBinaryString(in.nextInt());
		 b= Integer.toBinaryString(in.nextInt());
		 
		if(a.length()<b.length() ){aux=a;a=b;b=aux;}
		len = b.length();
		difflen=a.length()-len;
		count=0;
		
	//	System.out.println(a+" "+b );
		while((count<len) && (a.charAt(count) == b.charAt(count))) count++;
		count=2*(len-count)+difflen;
	System.out.println(count);
	
}		
	
	}
}