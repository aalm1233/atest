package com.dengtong.www;

import java.util.Scanner;

public class qishui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[10];
		Scanner sc = new Scanner(System.in);
				int c = sc.nextInt();
				int num =0;
				while(true){
					int d =c;
					d %= 3;
					if(c == 0||c == 1){
						num = num+(d/3);
						break;
					}else if(c == 2){
						num = num+(d/3);
						num++; 
						break;
					}
			}System.out.println(num);
			
	}
}
