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
	 * һ������A�д���N��N>0�����������ڲ�����ʹ�����������ǰ���£���ÿ������ѭ��������M��M>=0����λ�ã�����A�е������ɣ�A0 A1����AN-1���任Ϊ��AN-M ���� AN-1 A0 A1����AN-M-1�������M����ѭ��������ǰ���M��λ�ã��������Ҫ���ǳ����ƶ����ݵĴ��������٣�Ҫ�������ƶ��ķ�����
	 * �����ʽ��ÿ���������һ��������������1������N ( 1<=N<=100)��M��M>=0������2������N��������֮���ÿո�ָ���
	 * �����ʽ����һ�������ѭ������Mλ�Ժ���������У�֮���ÿո�ָ������н�β�����ж���ո�
	 * ����������
	 * 6 2
	 * 1 2 3 4 5 6
	 * ���������
	 * 5 6 1 2 3 4
	 * 
	 * ͨ������
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
	 * 1007. �����Բ��� (20)
	 * �����Ƕ��� dn Ϊ��dn = pn+1 - pn������ pi �ǵ�i����������Ȼ�� d1=1 �Ҷ���n>1�� dn ��ż�����������Բ��롱��Ϊ�����������������Ҳ�Ϊ2����������
	 * �ָ�������������N (< 105)������㲻����N���������������Եĸ�����
	 * �����ʽ��ÿ�������������1����������������������N��
	 * �����ʽ��ÿ���������������ռһ�У�������N���������������Եĸ���.
	 * ����������
	 * 20
	 * ���������
	 * 4
	 * 
	 * ͨ������
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
	 * 1006. ������ʽ������� (15)
	 * ����������ĸB����ʾ���١�����ĸS��ʾ��ʮ�����á�12...n������ʾ��λ����n��<10����������ʽ�������һ��������3λ��������������234Ӧ�ñ����ΪBBSSS1234����Ϊ����2�����١���3����ʮ�����Լ���λ��4��
	 * �����ʽ��ÿ�������������1����������������������n��<1000����
	 * �����ʽ��ÿ���������������ռһ�У��ù涨�ĸ�ʽ���n��
	 * ��������1��
	 * 234
	 * �������1��
	 * BBSSS1234
	 * ��������2��
	 * 23
	 * �������2��
	 * SS123
	 * 
	 * ͨ������
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
	 * 1005. ����(3n+1)���� (25)
	 * ������(Callatz)�����Ѿ���1001�и������������������Ŀ������΢��Щ���ӡ�
	 * ��������֤�����Ȳ����ʱ��Ϊ�˱����ظ����㣬���Լ�¼�µ��ƹ�����������ÿһ�����������n=3������֤��ʱ��������Ҫ����3��5��8��4��2��1�������Ƕ�n=5��8��4��2������֤��ʱ�򣬾Ϳ���ֱ���ж������Ȳ������α��������Ҫ�ظ����㣬��Ϊ��4�����Ѿ�����֤3��ʱ���������ˣ����ǳ�5��8��4��2�Ǳ�3�����ǡ����������ǳ�һ�������е�ĳ����nΪ���ؼ����������n���ܱ������е��������������ǡ�
	 * ���ڸ���һϵ�д���֤�����֣�����ֻ��Ҫ��֤���еļ����ؼ������Ϳ��Բ������ظ���֤���µ����֡������������ҳ���Щ�ؼ����֣������Ӵ�С��˳��������ǡ�
	 * �����ʽ��ÿ�������������1��������������1�и���һ��������K(<100)����2�и���K��������ͬ�Ĵ���֤��������n(1<n<=100)��ֵ�����ּ��ÿո������
	 * �����ʽ��ÿ���������������ռһ�У����Ӵ�С��˳������ؼ����֡����ּ���1���ո��������һ�������һ�����ֺ�û�пո�
	 * ����������
	 * 6
	 * 3 5 6 7 8 11
	 * ���������
	 * 7 6
	 * 
	 * ͨ������
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
	 * 1004. �ɼ����� (20)
	 * ����n��ѧ����������ѧ�š��ɼ����ֱ�����ɼ���ߺͳɼ����ѧ����������ѧ�š�
	 * �����ʽ��ÿ�������������1��������������ʽΪ
	 * ��1�У�������n
	 * ��2�У���1��ѧ�������� ѧ�� �ɼ�
	 * ��3�У���2��ѧ�������� ѧ�� �ɼ�
	 * ... ... ...
	 * ��n+1�У���n��ѧ�������� ѧ�� �ɼ�
	 * ����������ѧ�ž�Ϊ������10���ַ����ַ������ɼ�Ϊ0��100֮���һ�����������ﱣ֤��һ�����������û������ѧ���ĳɼ�����ͬ�ġ�
	 * �����ʽ����ÿ�������������2�У���1���ǳɼ����ѧ����������ѧ�ţ���2���ǳɼ����ѧ����������ѧ�ţ��ַ�������1�ո�
	 * ����������
	 * 3
	 * Joe Math990112 89
	 * Mike CS991301 100
	 * Mary EE990830 95
	 * ���������
	 * Mike CS991301
	 * Joe Math990112
	 * 
	 * ͨ������
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
	 * 1001. �����˲�������(3n+1)���� (15) 
	 * ������(Callatz)���룺
	 * ���κ�һ����Ȼ��n���������ż������ô��������һ�룻���������������ô��(3n+1)����һ�롣����һֱ��������ȥ�����һ����ĳһ���õ�n=1����������1950���������ѧ�Ҵ���Ϲ�����������룬��˵��ʱҮ³��ѧʦ���붯Ա��ƴ����֤�����ò�ƺ�ɵ����������⣬����ֵ�ѧ��������ѧҵ��һ��ֻ֤(3n+1)������������˵����һ����ı�����������������ӻ�������ѧ���ѧ����еĽ�չ����
	 * ���ǽ������Ŀ����֤�������Ȳ��룬���ǶԸ�������һ������1000��������n���򵥵���һ�£���Ҫ���ٲ��������£����ܵõ�n=1��
	 * �����ʽ��ÿ�������������1��������������������Ȼ��n��ֵ�� �����ʽ�������n���㵽1��Ҫ�Ĳ����� ���������� 3 ��������� 5
	 * 
	 * ͨ������
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
	 * 1002. д������� (20) 
	 * ����һ����Ȼ��n���������λ����֮�ͣ��ú���ƴ��д���͵�ÿһλ���֡�
	 * �����ʽ��ÿ�������������1��������������������Ȼ��n��ֵ�����ﱣ֤nС��10^100��
	 * �����ʽ����һ�������n�ĸ�λ����֮�͵�ÿһλ��ƴ�����ּ���1 �ո񣬵�һ�������һ��ƴ�����ֺ�û�пո� ����������
	 * 1234567890987654321123456789 ��������� yi san wu
	 * 
	 * ͨ������
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
	 *1003. ��Ҫͨ����(20)
	 * ������ȷ�����Զ�����ϵͳ�����������˻�ϲ�Ļظ�����������PAT�ġ�����ȷ�������� ���� ֻҪ������ַ�����������������ϵͳ�����������ȷ��������������𰸴��󡱡�
	 * �õ�������ȷ���������ǣ�
	 * 1. �ַ����б������P, A, T�������ַ��������԰��������ַ���
	 * 2. �������� xPATx ���ַ��������Ի�á�����ȷ�������� x �����ǿ��ַ����������ǽ�����ĸ A ��ɵ��ַ�����
	 * 3. ��� aPbTc ����ȷ�ģ���ô aPbATca Ҳ����ȷ�ģ����� a, b, c �������ǿ��ַ����������ǽ�����ĸ A ��ɵ��ַ�����
	 * ���ھ�����ΪPATдһ���Զ����г����ж���Щ�ַ����ǿ��Ի�á�����ȷ���ġ�
	 * �����ʽ�� ÿ�������������1��������������1�и���һ����Ȼ��n (<10)������Ҫ�����ַ���������������ÿ���ַ���ռһ�У��ַ������Ȳ�����100���Ҳ������ո�
	 * �����ʽ��ÿ���ַ����ļ����ռһ�У�������ַ������Ի�á�����ȷ���������YES���������NO��
	 * ����������
	 * 8
	 * PAT
	 * PAAT
	 * AAPATAA
	 * AAPAATAAAA
	 * xPATx
	 * PT
	 * Whatever
	 * APAAATAA
	 * ���������
	 * YES
	 * YES
	 * YES
	 * YES
	 * NO
	 * NO
	 * NO
	 * NO
	 * 
	 * ͨ������
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
