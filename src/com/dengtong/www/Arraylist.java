package com.dengtong.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				int N = sc.nextInt();
				ArrayList<Integer> a = new ArrayList<>();
				for(int i = 0;i<N;i++){
					a.add(sc.nextInt());
				}
				Collections.sort(a);
				for(int i = 0;i <a.size()-1;i++){
					if(a.get(i) == a.get(i+1)){
						a.remove(i);
						i--;
					}
				}
				for(int i = 0;i <a.size();i++){
					System.out.println(a.get(i));
				}
			}
	}

}
