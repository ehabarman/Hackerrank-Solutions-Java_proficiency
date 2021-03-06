//Date 9-7-2018
package Java_Proficiency.easy;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String []argh)
	   {
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt(); 
	      in.nextLine();
	      HashMap<String, Integer> phonebook = new HashMap<>();
	       
	      for(int i=0;i<n;i++) 
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	          phonebook.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s = in.nextLine();
	         if(phonebook.containsKey(s)) //if exists
	             System.out.println(s + "=" + phonebook.get(s));
	          else
	              System.out.println("Not found");
	      }
	      in.close();
	   }
}
