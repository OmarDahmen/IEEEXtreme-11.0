// Score : 100%

import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    
	     Map<Integer,List<String>> hm=new HashMap<Integer,List<String>>();  
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i=0; i<n; i++){
		    String s = in.next();
		    int    h=in.nextInt();
	
	//remplissage
	  if (hm.containsKey(h))    //if (hm.key==h  exist)
	   {
	        List<String> nameList =new ArrayList<String>();
	        nameList  = hm.get(h); 
	        nameList.add(s);
	        hm.put(h,nameList);
	   }     
	   
        else {
            List<String> nameList = new ArrayList<String>();
            nameList.add(s);
            hm.put(h,nameList); 
        }
             
    

		}
        
	    //end for
	    
	   Map<Integer, List<String>> hms = new TreeMap<Integer, List<String>> (hm);
	   
	   
	   //affichage
	   
	    int count=0;
	   for(Map.Entry  m:hms.entrySet()){
	   
	   List<String> nameList = (ArrayList<String>)m.getValue();
	   Collections.sort(nameList);
       for(int i=0; i<nameList.size(); i++)
                System.out.print(nameList.get(i)+" ");
	       
	   System.out.println((++count)+" "+(count+nameList.size()-1));
	   count+= nameList.size()-1;
	       
	   }
	}
}