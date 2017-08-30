package com.dengtong.www.w;

import java.util.*;

/**
 * 
 * @author Dengtong
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		zhaozhengshu();
	}
	public static String parse(long num) {
			if(!(num > 0&&num <100000000)){
				return "error";
			}else{
				if(num <10){
					
				}
			}
		return null;
	}
	private static void zhaozhengshu(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int n = 0;
			int begin = a;
			int end = b;
			for(;begin <b;begin++){
				if(begin%c == 0){
					break;
				}
			}
			for(;end > a;begin--){
				if(end%c == 0){
					break;
				}
			}
			System.out.println((end-begin)/c+1);
		}
	}
	private static void zuichanggonggongzixulie(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			StringBuffer s1 = new StringBuffer(sc.nextLine());
			StringBuffer s2 = new StringBuffer(sc.nextLine());
			int n = 0;
			for(int i = 0;i <s1.length();i++){
				for(int j =0;j<s2.length();j++){
					if(s1.charAt(i) == s2.charAt(j)){
						int m = 1;
						int i1 = i+1;
						int j1 = j+1;
						while(i1<s1.length()&&j1<s2.length()){
							if(s1.charAt(i1) == s2.charAt(j1)){
								m++;
								i1++;
								j1++;
							}else break;
						}
						if(n < m){
							n = m;
						}
					}
				}
			}
			System.out.println(n);
		}
	}
	private static void maiyuebing() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int D = sc.nextInt();
			int[][] n = new int [N][2];
			float[] m = new float [N];
			for(int i = 0;i<N;i++){
				n[i][0] = sc.nextInt();
			}for(int i = 0;i<N;i++){
				n[i][1] = sc.nextInt();
			}for(int i = 0;i<N;i++){
				m[i] = (float)n[i][1]/n[i][0];
			}
			System.out.format("%.2f %.2f %.2f", m[0],m[1],m[2]);
		}
	}
	/*
	 * C代表“锤子”、
	 * J代表“剪刀”
	 * B代表“布”
	*/
	private static void zhuizijiandaobu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			//int N = sc.nextInt();
			int jiaying = 0;
			int ping = 0;
			int jiashu = 0;
			for(int i = 0;i<10;i++){
				StringBuffer sb = new StringBuffer(sc.nextLine());
				if(panduan(sb.charAt(0),sb.charAt(2)) == 0){
					ping ++;
				}else if(panduan(sb.charAt(0),sb.charAt(2)) == 1){
					jiaying++;
				}else if(panduan(sb.charAt(0),sb.charAt(2)) == -1){
					jiashu++;
				}
			}
			System.out.println(jiaying+" "+ping+ ""+jiashu);
			
		}
	}
	private static int panduan(char jia,char yi){
		if(jia == 'C'){
			if(yi == 'C'){
				return 0;
			}else if(yi == 'J'){
				return 1;
			}else if(yi == 'B'){
				return -1;
			}
		}else
		if(jia == 'J'){
			if(yi == 'C'){
				return -1;
			}else if(yi == 'J'){
				return 0;
			}else if(yi == 'B'){
				return 1;
			}
		}else
		if(jia == 'B'){
			if(yi == 'C'){
				return -1;
			}else if(yi == 'J'){
				return 1;
			}else if(yi == 'B'){
				return 0;
			}
		}
		return -3;
	}
	/*
	 * 
	 * 输入第1行给出3个正整数，分别为：N（<=105），即考生总数；
	 * L（>=60），为录取最低分数线，即德分和才分均不低于L的考生才有资格被考虑录取；
	 * H（<100），为优先录取线——德分和才分均不低于此线的被定义为“才德全尽”，此类考生按德才总分从高到低排序 ；
	 * 才分不到但德分到线的一类考生属于“德胜才”，也按总分排序，但排在第一类考生之后；
	 * 德才分均低于H，但是德分不低于才分的考生属于“才德兼亡”但尚有“德胜才”者，按总分排序，但排在第二类考生之后；
	 * 其他达到最低线L的考生也按总分排序，但排在第三类考生之后。
	 * 随后N行，每行给出一位考生的信息，包括：准考证号、德分、才分，其中准考证号为8位整数，
	 * 德才分为区间[0, 100]内的整数。数字间以空格分隔。
	 * 
	 */
	static void decailun(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			final int N = sc.nextInt();//考生总数
			final int L = sc.nextInt();//录取最低分数线
			final int H = sc.nextInt();//优先录取线
			int n = 0;
			List<KaoSheng> a = new  ArrayList<>();
			List<KaoSheng> b = new  ArrayList<>();
			List<KaoSheng> c = new  ArrayList<>();
			List<KaoSheng> d = new  ArrayList<>();
			for(int i = 0;i<N;i++){
				int zhunkaozhenghao = sc.nextInt();
				int defeng = sc.nextInt();
				int caifeng =sc.nextInt();
				if(defeng >= H&& caifeng >= H){
					a.add(new KaoSheng(zhunkaozhenghao,defeng ,caifeng ));
					n++;
				}
				else if(defeng >= H&& (caifeng >= L&&caifeng < H)){
					b.add(new KaoSheng(zhunkaozhenghao,defeng ,caifeng ));
					n++;
				}
				else if((defeng <H &&defeng >= L)&&(caifeng <H &&caifeng >= L)){
					if(defeng >= caifeng)
					c.add(new KaoSheng(zhunkaozhenghao,defeng ,caifeng ));
					else d.add(new KaoSheng(zhunkaozhenghao,defeng ,caifeng ));
					n++;
				}else if(caifeng >= H&& (defeng >= L&&defeng < H)){
					d.add(new KaoSheng(zhunkaozhenghao,defeng ,caifeng ));
					n++;
				}
			}
			Collections.sort(a, new XueshengComparator());
			Collections.sort(b, new XueshengComparator());
			Collections.sort(c, new XueshengComparator());
			Collections.sort(d, new XueshengComparator());
			System.out.println(n);
			for(int i =0;i<a.size();i++)System.out.println(a.get(i).toString());
			for(int i =0;i<b.size();i++)System.out.println(b.get(i).toString());
			for(int i =0;i<c.size();i++)System.out.println(c.get(i).toString());
			for(int i =0;i<d.size();i++)System.out.println(d.get(i).toString());
		}
	}
}
class KaoSheng{
	private int zhunkaozhenghao;
	private int defeng;
	private int caifeng;
	KaoSheng(int zhunkaozhenghao,
	int defeng,
	int caifeng){
		this.zhunkaozhenghao = zhunkaozhenghao;
		this.defeng =defeng;
		this.caifeng = caifeng;		
	}
	int getZhunkaozhenghao() {
		return this.zhunkaozhenghao;
	}
	int getDefeng() {
		return this.defeng;
	}
	int getCaifeng() {
		return this.caifeng;
	}
	public String toString(){
		return this.zhunkaozhenghao+" "+this.defeng+" "+this.caifeng;
	}
}
class XueshengComparator implements Comparator<KaoSheng>{

	@Override
	public int compare(KaoSheng o1, KaoSheng o2) {
		// TODO Auto-generated method stub
		if((o1.getCaifeng()+o1.getDefeng()) > (o2.getCaifeng()+o2.getDefeng())){
			return -1;
		}else if((o1.getCaifeng()+o1.getDefeng()) < (o2.getCaifeng()+o2.getDefeng())){
			return 1;
		}else{
			if(o1.getDefeng() > o2.getDefeng()){
				return -1;
			}else if(o1.getDefeng() < o2.getDefeng()){
				return 1;
			}else{
				if(o1.getZhunkaozhenghao() > o2.getZhunkaozhenghao()){
					return 1;
				}else if(o1.getZhunkaozhenghao() < o2.getZhunkaozhenghao()){
					return -1;
				}
			}
		}
		return 0;
	}
	
}

