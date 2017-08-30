package com.dengtong.www;

import java.util.ArrayList;
import java.util.Scanner;

public class shusushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int M = sc.nextInt();
			int N = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			for(int i = 2;a.size() <10000;i++){
				boolean flag = false;
				for(int j = 2;j <= Math.sqrt(i);j++){
					if(i%j == 0){
						flag = true;
					}
				}if(flag == false){
					a.add(i);
				}
			}
			int n = 0;
			int m = M-1;
			a: while(true){
				for(int i = 0;i <10;i++){
					if(((i+n*10) <(N-M))){
						System.out.print(a.get(m));
						m++;
						if(i != 9)System.out.print(" ");
					}else {
						System.out.print(a.get(m));
						System.out.println();
						break a;
					}
				}
				System.out.println();
				n++;
			}
		}

	}

}
