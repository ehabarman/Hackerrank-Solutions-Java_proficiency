//Date 8-7-2018
package Java_Proficiency.easy;

import java.util.Scanner;

public class JavaInterface {

	public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        @SuppressWarnings("rawtypes")
		Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}




interface AdvancedArithmetic{
	  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    public int divisorSum(int n) {
        // System.out.println("I implemented: AdvancedArithmetic");
        int answer = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if ((n % i) == 0) {
                answer += i;
            }
        }
        answer += n;
        return answer;
    }

	@Override
	public int divisor_sum(int n) {
		if (n==1)
			return 1;

		int sum = 0;
		for(int i=1;i<= Math.sqrt(n);i++)
			if(n%i==0)
				sum+= i+ n/i;
		return sum;
	}
}