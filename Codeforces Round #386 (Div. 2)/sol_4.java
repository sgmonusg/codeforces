import java.io.*;
import java.lang.*;
import java.util.*;

public class sol_4{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int k =sc.nextInt();
		int a =sc.nextInt();
		int b =sc.nextInt();
		StringBuffer sen = new StringBuffer();
		int x =0;
		int y=0;
		char x_label;
		char y_label;
		if(a>b){
			x=a;
			x_label ='G';
			y=b;
			y_label ='B';
		}
		else{
			x=b;
			x_label='B';
			y=a;
			y_label='G';
		}
				int holes =y+1;
		if (x/holes>k){
			System.out.println("NO");
			return ;
		}

		int count =0;
		while(count<n){
			int temp = x-k;
			if(temp >=holes-1){
				for(int i=0;i<k ;i++){
				sen.append(x_label);
				}
				x=x-k;
				sen.append(y_label);
				holes--;
				y--;
				count =count +k +1;
			}
			else{
				sen.append(x_label);
				x--;
				sen.append(y_label);
				y--;
				count =count +2;
			}

		}
		sen.deleteCharAt(n);
		System.out.println(sen);
	}
}