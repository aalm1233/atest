package com.dengtong.www.pat;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		t1008();
	}
	/**
	 * 一个数组A中存有N（N>0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（M>=0）个位置，即将A中的数据由（A0 A1……AN-1）变换为（AN-M …… AN-1 A0 A1……AN-M-1）（最后M个数循环移至最前面的M个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？
	 * 输入格式：每个输入包含一个测试用例，第1行输入N ( 1<=N<=100)、M（M>=0）；第2行输入N个整数，之间用空格分隔。
	 * 输出格式：在一行中输出循环右移M位以后的整数序列，之间用空格分隔，序列结尾不能有多余空格。
	 * 输入样例：
	 * 6 2
	 * 1 2 3 4 5 6
	 * 输出样例：
	 * 5 6 1 2 3 4
	 * 
	 * 通过测试
	 */
	private static void t1008() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int M = sc.nextInt();
			int c = M%N;
			int d = N-c;
			ArrayList<Integer> a = new ArrayList<>();
			StringBuffer s1 = new StringBuffer();
			StringBuffer s2 = new StringBuffer();
			for(int i = 0;i<N;i++){
				a.add(sc.nextInt());
			}
			for(int i = d;i<a.size();i++){
				System.out.print(a.get(i)+" ");
			}
			for(int i = 0;i<d;i++){
				System.out.print(a.get(i));
				if(i <d-1)System.out.print(" ");
			}
		}
	}
	/**
	 * 
	 * 1007. 素数对猜想 (20)
	 * 让我们定义 dn 为：dn = pn+1 - pn，其中 pi 是第i个素数。显然有 d1=1 且对于n>1有 dn 是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
	 * 现给定任意正整数N (< 105)，请计算不超过N的满足猜想的素数对的个数。
	 * 输入格式：每个测试输入包含1个测试用例，给出正整数N。
	 * 输出格式：每个测试用例的输出占一行，不超过N的满足猜想的素数对的个数.
	 * 输入样例：
	 * 20
	 * 输出样例：
	 * 4
	 * 
	 * 通过测试
	 */
	private static void t1007() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int n = 0;
			ArrayList<Integer> a = new ArrayList<>();		
			for(int i = 2;i <= N;i++){
				boolean flag = false;
				for(int j = 2;j <= Math.sqrt(i);j++){
					if(i%j == 0){
						flag = true;
					}
				}if(flag == false){
					a.add(i);
				}
			}
			for(int i = 0;i<a.size()-1;i++){
				if((a.get(i+1)-a.get(i)) == 2){
					n++;
				}
			}
			System.out.println(n);
		}
	}
	/**
	 * 
	 * 1006. 换个格式输出整数 (15)
	 * 让我们用字母B来表示“百”、字母S表示“十”，用“12...n”来表示个位数字n（<10），换个格式来输出任一个不超过3位的正整数。例如234应该被输出为BBSSS1234，因为它有2个“百”、3个“十”、以及个位的4。
	 * 输入格式：每个测试输入包含1个测试用例，给出正整数n（<1000）。
	 * 输出格式：每个测试用例的输出占一行，用规定的格式输出n。
	 * 输入样例1：
	 * 234
	 * 输出样例1：
	 * BBSSS1234
	 * 输入样例2：
	 * 23
	 * 输出样例2：
	 * SS123
	 * 
	 * 通过测试
	 */
	private static void t1006(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			StringBuffer output = new StringBuffer();
			int lenth = input.length();
			switch (lenth) {
			case 1:
				int gewei1 = input.charAt(0) - '0';
				for(int i = 1;i<=gewei1;i++){
					output.append(i);
				}
				break;
			case 2:
				int gewei2 =input.charAt(1)-'0';
				int shiwei2 = input.charAt(0)-'0';
				for(int i = 1;i<=shiwei2;i++){
					output.append('S');
				}
				if(gewei2 == 0);else{
					for(int i = 1;i<=gewei2;i++){
					output.append(i);
				}
				}
				break;
			case 3:
				int baiwei3 = input.charAt(0)-'0';
				int gewei3 =input.charAt(2)-'0';
				int shiwei3 = input.charAt(1)-'0';
				for(int i = 1;i<=baiwei3;i++){
					output.append('B');
				}if(shiwei3 == 0);else{
					for(int i = 1;i<=shiwei3;i++){
					output.append('S');
				}
				}
				if(gewei3 == 0);else{
					for(int i = 1;i<=gewei3;i++){
					output.append(i);
				}
				}
				break;

			default:
				break;
			}
			System.out.println(output.toString());
		}
	}
	/**
	 * 
	 * 1005. 继续(3n+1)猜想 (25)
	 * 卡拉兹(Callatz)猜想已经在1001中给出了描述。在这个题目里，情况稍微有些复杂。
	 * 当我们验证卡拉兹猜想的时候，为了避免重复计算，可以记录下递推过程中遇到的每一个数。例如对n=3进行验证的时候，我们需要计算3、5、8、4、2、1，则当我们对n=5、8、4、2进行验证的时候，就可以直接判定卡拉兹猜想的真伪，而不需要重复计算，因为这4个数已经在验证3的时候遇到过了，我们称5、8、4、2是被3“覆盖”的数。我们称一个数列中的某个数n为“关键数”，如果n不能被数列中的其他数字所覆盖。
	 * 现在给定一系列待验证的数字，我们只需要验证其中的几个关键数，就可以不必再重复验证余下的数字。你的任务就是找出这些关键数字，并按从大到小的顺序输出它们。
	 * 输入格式：每个测试输入包含1个测试用例，第1行给出一个正整数K(<100)，第2行给出K个互不相同的待验证的正整数n(1<n<=100)的值，数字间用空格隔开。
	 * 输出格式：每个测试用例的输出占一行，按从大到小的顺序输出关键数字。数字间用1个空格隔开，但一行中最后一个数字后没有空格。
	 * 输入样例：
	 * 6
	 * 3 5 6 7 8 11
	 * 输出样例：
	 * 7 6
	 * 
	 * 通过测试
	 */
	private static void t1005(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			ArrayList<Integer> a =  new ArrayList<>();
			HashSet<Integer> hs = new HashSet<>();
			int K = sc.nextInt();
			for(int i = 0;i<K;i++){
				a.add(sc.nextInt());
			}
			for(int i = 0;i<a.size();i++){
				int n = a.get(i);
				if(hs.contains(n)) continue;
				while (true) {
					if (n == 1){
						break;						
					}	
					if (n % 2 == 0){
						n /= 2;
					}
					else if (n % 2 == 1) {
						n = 3 * n + 1;
						n /= 2;
					}
					if(a.contains(n)){
						hs.add(n);
					}
				}
			}
			StringBuffer out =new StringBuffer();
			Collections.sort(a);
			for(int i =a.size()-1;i>=0;i--){
				if(!hs.contains(a.get(i))){
					out.append(a.get(i)+" ");
				}
			}
			out.deleteCharAt(out.length()-1);
			System.out.println(out.toString());
		}
	}
	/**
	 * 
	 * 1004. 成绩排名 (20)
	 * 读入n名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
	 * 输入格式：每个测试输入包含1个测试用例，格式为
	 * 第1行：正整数n
	 * 第2行：第1个学生的姓名 学号 成绩
	 * 第3行：第2个学生的姓名 学号 成绩
	 * ... ... ...
	 * 第n+1行：第n个学生的姓名 学号 成绩
	 * 其中姓名和学号均为不超过10个字符的字符串，成绩为0到100之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
	 * 输出格式：对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。
	 * 输入样例：
	 * 3
	 * Joe Math990112 89
	 * Mike CS991301 100
	 * Mary EE990830 95
	 * 输出样例：
	 * Mike CS991301
	 * Joe Math990112
	 * 
	 * 通过测试
	 *  
	 */
	private static void t1004() throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			HashMap<String, String> hm = new HashMap<>();
			TreeMap<Integer,String> tm = new TreeMap<>();
			String sn =sc.nextLine();
			int n = Integer.parseInt(sn);
			for(int i = 0;i<n;i++){
				String line = sc.nextLine();
				hm.put(line.split(" ")[1], line.split(" ")[0]);
				int chengji = Integer.parseInt(line.split(" ")[2]);
				tm.put(chengji,line.split(" ")[1]);
			}
			System.out.println(hm.get(tm.get(tm.lastKey()))+" "+tm.get(tm.lastKey()));
			System.out.println(hm.get(tm.get(tm.firstKey()))+" "+tm.get(tm.firstKey()));
		}
	}
	
	/**
	 * 
	 * 1001. 害死人不偿命的(3n+1)猜想 (15) 
	 * 卡拉兹(Callatz)猜想：
	 * 对任何一个自然数n，如果它是偶数，那么把它砍掉一半；如果它是奇数，那么把(3n+1)砍掉一半。这样一直反复砍下去，最后一定在某一步得到n=1。卡拉兹在1950年的世界数学家大会上公布了这个猜想，传说当时耶鲁大学师生齐动员，拼命想证明这个貌似很傻很天真的命题，结果闹得学生们无心学业，一心只证(3n+1)，以至于有人说这是一个阴谋，卡拉兹是在蓄意延缓美国数学界教学与科研的进展……
	 * 我们今天的题目不是证明卡拉兹猜想，而是对给定的任一不超过1000的正整数n，简单地数一下，需要多少步（砍几下）才能得到n=1？
	 * 输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。 输出格式：输出从n计算到1需要的步数。 输入样例： 3 输出样例： 5
	 * 
	 * 通过测试
	 */
	private static void t1001() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			if (N >= 1000 || N <= 0)
				;
			else {
				int n = N;
				int step = 0;
				while (true) {
					if (n == 1)
						break;
					if (n % 2 == 0)
						n /= 2;
					else if (n % 2 == 1) {
						n = 3 * n + 1;
						n /= 2;
					}
					step++;
				}
				System.out.println(step);
			}
		}
	}

	/**
	 * 
	 * 1002. 写出这个数 (20) 
	 * 读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
	 * 输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10^100。
	 * 输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。 输入样例：
	 * 1234567890987654321123456789 输出样例： yi san wu
	 * 
	 * 通过测试
	 */
	private static void t1002() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			ArrayList<Integer> a = new ArrayList<>();
			for (int i = 0; i < line.length(); i++) {
				int b = line.charAt(i) - '0';
				a.add(b);
			}
			BigInteger d = new BigInteger("0");
			for (int i = 0; i < a.size(); i++) {
				BigInteger e = BigInteger.valueOf(a.get(i));
				d = d.add(e);
			}
			String out = d.toString();
			for (int i = 0; i < out.length(); i++) {
				switch (out.charAt(i)) {
				case '1':
					System.out.print("yi");
					break;
				case '2':
					System.out.print("er");
					break;
				case '3':
					System.out.print("san");
					break;
				case '4':
					System.out.print("si");
					break;
				case '5':
					System.out.print("wu");
					break;
				case '6':
					System.out.print("liu");
					break;
				case '7':
					System.out.print("qi");
					break;
				case '8':
					System.out.print("ba");
					break;
				case '9':
					System.out.print("jiu");
					break;
				case '0':
					System.out.print("ling");
					break;

				default:
					break;
				}
				if(i <out.length()-1)System.out.print(" ");
			}
		}
	}
	/**
	 * 
	 *1003. 我要通过！(20)
	 * “答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于PAT的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。
	 * 得到“答案正确”的条件是：
	 * 1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
	 * 2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
	 * 3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
	 * 现在就请你为PAT写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
	 * 输入格式： 每个测试输入包含1个测试用例。第1行给出一个自然数n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过100，且不包含空格。
	 * 输出格式：每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出YES，否则输出NO。
	 * 输入样例：
	 * 8
	 * PAT
	 * PAAT
	 * AAPATAA
	 * AAPAATAAAA
	 * xPATx
	 * PT
	 * Whatever
	 * APAAATAA
	 * 输出样例：
	 * YES
	 * YES
	 * YES
	 * YES
	 * NO
	 * NO
	 * NO
	 * NO
	 * 
	 * 通过测试
	 */
	private static void t1003() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String sn =sc.nextLine();
			int n = sn.charAt(0) - '0';
			ArrayList<String> a = new ArrayList<>();
			for(int i = 0;i < n;i++){
				a.add(sc.nextLine());
			}
			a :for(int i = 0;i < n;i++){
				String line = a.get(i);
				int PCount,ACount,TCount;
				PCount = ACount = TCount = 0;
				for(int j =0;j<line.length();j++){
					if(line.charAt(j) == 'P'){
						PCount++;
					}else if(line.charAt(j) == 'A'){
						ACount++;
					}else if(line.charAt(j) == 'T'){
						TCount++;
					}else{
						System.out.println("NO");
						continue a ;
					}
				}
				if(!(PCount == 1&&TCount == 1&&ACount >=1)){
					System.out.println("NO");
					continue a ;
				}
				int indexP = line.indexOf('P');
				int indexT = line.indexOf('T');
				int leftA = indexP; 
				int rightA = line.length() - indexT - 1; 
				int middleA = indexT - indexP - 1; 
				int N = middleA -1;
				if(rightA != N*leftA+leftA){
					System.out.println("NO");
					continue a ;
				}
				System.out.println("YES");
			}
		}
	}

}
