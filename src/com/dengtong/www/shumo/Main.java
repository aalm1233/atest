package com.dengtong.www.shumo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Main {
	/*
	static int[] v = {8,5,3};
	static int[] s = {8,0,0};
	static int[] s1 = {4,4,0};
	static int N =3;
	*/
	
	static int[] v = { 12,10,6,3 };
	static int[] s = { 12,0,0 ,0};
	static int[] s1 = { 4, 4,4, 0 };
	static int[] s2 = { 3, 3, 3, 3 };
	static int[] s3 = { 5, 3, 2, 2 };
	static int[] s4 = { 12, 0, 0, 0 };
	static int N = 4;
	
	/*
	static int[] v = {50,25,17,4};
	static int[] s = {30,0,0,0};
	static int[] s1 = {14,6,6,4};
	static int N =4;
	*/
	/*
	static int[] v = {50,25,17,4,3};
	static int[] s = {50,0,0,0,0};
	static int[] s1 = {25,13,8,1,3};
	static int N =5;
	*/
	/*
	static int[] v = {13,8,7,6,3,1};
	static int[] s = {13,0,0,0,0,0};
	static int[] s1 = {4, 4, 2, 2, 1, 0};
	static int N =6;
	*/
	/*
	static int[] v = {15,13,8,7,6,3,1};
	static int[] s = {15,0,0,0,0,0,0};
	static int[] s1 = {4, 2, 4, 2, 2, 1, 0};
	static int N =7;
	*/
	/*
	static int[] v = {25,23,17,13,9,6,4,3};
	static int[] s = {25,0,0,0,0,0,0,0};
	static int[] s1 = {25,1,0,0,0,0,0,0};
	static int N =8;
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long time1=System.currentTimeMillis();
			String result = "";//输出结果
			int r = 0;
			int[] d = s1;//目标状态
			int[] V = v;
			Main m = new Main();
			Map map = m.new Map();
			Node n = m.new Node(s);//初始节点
			map.add(n);
			map.addpath(n, m.new Node(V));
			Node n2 = m.new Node(d);//终止节点
			boolean flag = false;//是否出现终止解
			zuiwai: for (int x = 0;; x++) {
				if (x == map.size()) {
					break zuiwai;
				}
				for (int i = 0; i < N; i++) {
					if (map.get(x).getS()[i] == 0)
						continue;
					for (int j = 0; j < N; j++) {
						// r++;
						int[] c = map.get(x).getS();
						int l = (V[j] - c[j]) < c[i] ? (V[j] - c[j]) : c[i];
						int[] b = new int[N];
						for (int m1 = 0; m1 < N; m1++) {
							b[m1] = c[m1];
						}
						b[i] = b[i] - l;
						b[j] = b[j] + l;
						if(!flag){
							if (quchong(map, b)) {
								if (equals(d, b)) {
									if(r == 0){
										flag = true;
										r++;
										map.add(n2);
										map.addpath(n2, map.get(x));
									}		
								} else {
									Node n1 = m.new Node(b);
									map.add(n1);
									map.addpath(n1, map.get(x));
								}
							}
						}else{
							if (equals(d, b)) {
								if(r == 0){
									flag = true;
									r++;
									map.add(n2);
									map.addpath(n2, map.get(x));
								}
							}
						}
					}
				}
			}
			if (flag) {
				//存在解，递归散列表求解最短路径
				Node n3 = map.getH().get(n2).get(0);
				//r++;
				result = n3.toString() + "->" + n2.toString();
				for (;;) {
					n3 = map.getH().get(n3).get(0);
					result = n3.toString() + "->" + result;
					r++;
					if (r % 5 == 1) {
						result = "\n" + result;
					}
					if (equals(V, map.getH().get(n3).get(0).getS())) {
						break;
					} 
				}
				//System.out.println(map.getH().get(n2).size());
				System.out.println("一共走了" + r + "步");
				System.out.println(result);
			} else if (!flag) {
				System.out.println("无解");
				System.out.println(map.getAa().toString());
			}
			long time2=System.currentTimeMillis();
			long interval=time2-time1;
			System.out.println(interval+"ms");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("as");
		}
	}
	/**
	 * 
	 * @param aa 记录了所有的路径
	 * @param b 目标节点状态
	 * @return 该状态出现过则返回 false，没出现过返回 true
	 */
	public static boolean quchong(Map aa, int[] b) {
		for (int i = 0; i < aa.size(); i++) {
			if (equals(aa.get(i).getS(), b)) {
				return false;
			}
		}
		return true;
	}
	/**
	 * @param s 被比较的一组状态
	 * @param b 用以比较的一组状态
	 * @return 相等返回true，不相等返回false
	 */
	private static boolean equals(int[] s, int[] b) {
		// TODO Auto-generated method stub
		for (int i = 0; i < N; i++) {
			if (s[i] != b[i])
				return false;
		}
		return true;
	}
	/**
	 *记录了所有的有效节点以及所有有效节点的父节点
	 * @author DengTong
	 */
	class Map {
		private ArrayList<Node> aa = new ArrayList<>();
		private Hashtable<Node, ArrayList<Node>> h = new Hashtable<Node, ArrayList<Node>>();

		@Override
		public String toString() {
			return Arrays.toString(aa.toArray());
		}

		public int size() {
			// TODO Auto-generated method stub
			return aa.size();
		}

		public void add(Node n) {
			aa.add(n);
		}

		public Node get(int x) {
			return aa.get(x);
		}

		public void addpath(Node n1, Node n2) {
			ArrayList<Node> a = new ArrayList<>();
			a.add(n2);
			h.put(n1, a);
		}

		public void father(Node n1, Node n2) {
			h.get(n1).add(n2);
		}

		public Hashtable<Node, ArrayList<Node>> getH() {
			return h;
		}

		public ArrayList<Node> getAa() {
			return aa;
		}

	}

	/**
	 * 存储每次分酒的状态
	 * 
	 * @author DengTong
	 *
	 */
	class Node {
		private int s[] = new int[N];

		public Node(int[] s) {
			for (int i = 0; i < N; i++) {
				this.s[i] = s[i];
			}
		}

		public int[] getS() {
			return this.s;
		}

		public boolean equals(Node obj) {
			for (int i = 0; i < N; i++) {
				if (obj.getS()[i] != s[i])
					return false;
			}
			return true;
		}

		@Override
		public String toString() {
			return Arrays.toString(s);
		}

		public int haseCode() {
			return s.hashCode();
		}
	}
}
