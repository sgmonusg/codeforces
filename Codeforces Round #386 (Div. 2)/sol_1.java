import java.io.*;
import java.lang.*;
import java.util.*;

public class sol_1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int lemon=sc.nextInt();
		int apple = sc.nextInt();
		int pear =sc.nextInt();
		apple =apple/2;
		pear =pear/4;
		int min =lemon;
		if(min>apple){
			min=apple;
		}
		if(min>pear){
			min= pear;
		}
		int sum = min+(2*min)+(4*min);
		System.out.println(sum);		
	}
}