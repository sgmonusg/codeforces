import java.io.*;
import java.lang.*;
import java.util.*;

public class sol_2{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int x =sc.nextInt();
		String s =sc.next();
		StringBuffer sen =new StringBuffer(s);
		StringBuffer s1 =new StringBuffer();
		for (int i =0 ;i< x ;i++ ) {
			s1.append("1");
			
		}
		//System.out.println(s1);
		char mid ;
		int original =x;
		x--;
		for (int i=0;i<original ;i++ ) {
			mid =s.charAt(i);
			int temp =x/2;
			if(s1.charAt(temp)=='1'){
				s1.setCharAt(temp, mid);
			}
			else{
				s1.setCharAt(original-1-temp, mid);
			}
			x--;
		}
		System.out.println(s1);
		
	}
}