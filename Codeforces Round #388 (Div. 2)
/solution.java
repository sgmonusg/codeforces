import java.io.*;
import java.lang.*;
import java.util.*;


public class solution{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int x =n/2;
		int y= n%2;
		if(y==0){
			System.out.println(x);
			for(int i=0;i<x;i++){
				System.out.print("2 ");
			}
			System.out.println();
		}
		else{
			System.out.println(x);
			for (int i=0;i<x-1 ;i++ ) {
				System.out.print("2 ");
			}
			System.out.println("3");
		}
	}
}