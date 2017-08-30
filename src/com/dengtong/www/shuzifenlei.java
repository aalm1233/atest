package com.dengtong.www;

import java.util.ArrayList;
import java.util.Scanner;
//ÕýÈ·´úÂë
public class shuzifenlei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int n =0;
			ArrayList<Integer> a = new ArrayList<>();
			while(true){
				n++;
				a.add(sc.nextInt());
				if(n == N){
					break;
				}
			}
			int A1 = 0;
			for(int i = 0;i <a.size();i++){
				if(((a.get(i)%5) ==0)&&(a.get(i)%2) == 0){
					A1 += a.get(i);
				}
			}
			if(A1 == 0)System.out.print('N'+" ");
			else System.out.print(A1+" ");
			int A2 = 0;
			int m = 0;
			for(int i = 0;i <a.size();i++){
				if((a.get(i)%5) == 1){
					A2 += a.get(i)*(Math.pow(-1, m));
					m++;
				}
			}if(A2 == 0)System.out.print('N'+" ");
			else System.out.print(A2+" ");
			int A3 = 0;
			for(int i = 0;i <a.size();i++){
				if((a.get(i)%5) == 2){
					A3 ++;
				}
			}if(A3 == 0)System.out.print('N'+" ");
			else System.out.print(A3+" ");
			float A4 = 0.0f;
			float num = 0.0f;
			float all = 0.0f;
			for(int i = 0;i <a.size();i++){
				if((a.get(i)%5) == 3){
					all+=a.get(i);
					num = num +1.0f;
				}
			}
			if(num != 0.0f)
			A4 = all/num;
			if(A4 == 0.0f)System.out.print('N'+" ");
			else {System.out.format("%.1f", A4);System.out.print(" ");}
			int A5 = 0;
			for(int i = 0;i <a.size();i++){
				if((a.get(i)%5) == 4){
					if(a.get(i) > A5){
						A5 = a.get(i);
					}
				}
			}if(A5 == 0)System.out.print('N');
			else System.out.print(A5);
			a.clear();
		}
	}
}
