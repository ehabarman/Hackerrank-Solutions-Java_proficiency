//Date 8-7-2018
package Java_Proficiency.easy;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		String[] a=cin.nextLine().trim().split("[ !,?\\._'@]+",0);
		if(a.length==1&&a[0].equals("")){
			System.out.println(0);
		}else{
			System.out.println(a.length);
			for(String s:a)System.out.println(s);
		}
		cin.close();
	}
}
