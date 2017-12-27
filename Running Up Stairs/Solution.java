// Score : 50%

import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
  public static void main (String[] args) throws java.lang.Exception {
    Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int n;
	  final double GR = (1 + Math.sqrt(5)) / 2;
    final double NGR = -GR + 1;
	    
		for(int i=0;i<t;i++){
      n = in.nextInt()+2;
      System.out.println( Math.round(1 / Math.sqrt(5) * (Math.pow(GR, n) - Math.pow(NGR, n)))); 
		}
	}
}
