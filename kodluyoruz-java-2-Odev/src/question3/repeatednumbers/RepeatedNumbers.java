package question3.repeatednumbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class RepeatedNumbers 
{

	public static void main(String[] args)
	{
		
		ArrayList<Integer> liste = new ArrayList<Integer>() ;
		
		liste.add(2);
		liste.add(4);
		liste.add(5);
		liste.add(11);
		liste.add(33);
		liste.add(2);
		liste.add(5);
		liste.add(55);
		liste.add(100);
		liste.add(1);
		liste.add(1);
	    
		System.out.println(liste+ " ");
	     
		for(int i =0 ; i< liste.size(); i++) 
		{
			
			for(int j = i+1 ;j < liste.size(); j++) 
			{
				
				 if(liste.get(i) == liste.get(j))
				 {
					System.out.print(liste.get(i)+" ");
				 }
			}
		 }
			
	}
}

	





