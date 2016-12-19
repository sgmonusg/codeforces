import java.io.*;
import java.lang.*;
import java.util.*;

public class sol_1{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String y =sc.next();
		int len =y.length();
		StringBuffer sen =new StringBuffer(y);
		int i=0;
		int temp=0;
		while(sen.length()!=1){
			if(sen.charAt(i)=='D'){
				int x = sen.indexOf("R",i);
				if(x==-1){
					x=sen.indexOf("R");
					if(x==-1){
						temp=1;
						System.out.println('D');
						break;
					}
				}
				sen.deleteCharAt(x);
				//System.out.println(sen);
				len--;
				//System.out.println("len"+len);
				//System.out.println("oldi"+i);
				
				if(i>=len-1){
					i=0;
				}
				else{
					i++;
				}
			//i=(i+1)%len;
			//System.out.println(i);
			}
			else{
				int x = sen.indexOf("D",i);
				if(x==-1){
					x=sen.indexOf("D");
					if(x==-1){
						temp=1;
						System.out.println('R');
						break;
					}
				}
				sen.deleteCharAt(x);
			//	System.out.println(sen);

				len --;
			//	System.out.println("len"+len);
			//	System.out.println("oldi"+i);
				if(i>=len-1){
					i=0;
				}
				else{
					i++;
				}
			//i=(i+1)%len;
			//System.out.println(i);
			}
		}
		if(temp==0){
			System.out.println(sen);
		}
		

	}
}