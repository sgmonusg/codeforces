import java.io.*;
import java.lang.*;
import java.util.*;

public class sol_3{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int s =sc.nextInt();
		int x1= sc.nextInt();
		int x2 = sc.nextInt();
		int t1 =sc.nextInt();
		int t2 =sc.nextInt();
		int p =sc.nextInt();
		int d = sc.nextInt();
		int right =0;
		int left =0;
		if(x1>x2){
			right = x1;
			left =x2;
			fd =-1;
		}
		else{
			right =x2;
			left =x1;
			fd =1;
		}
		int t_walk = (Math.abs(x1-x2))*t2;
		int t_tram =0;
		// case when x2> x1
		if(d==fd){
			if(p<x1){

			}
			t_tram = s*t1;

		}

	}
}