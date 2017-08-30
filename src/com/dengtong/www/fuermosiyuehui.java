package com.dengtong.www;

import java.util.Scanner;

public class fuermosiyuehui {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String answer = "";
			StringBuffer s1 = new StringBuffer();
			s1.append(sc.nextLine());
			StringBuffer s2 = new StringBuffer();
			s2.append(sc.nextLine());
			StringBuffer s3 = new StringBuffer();
			s3.append(sc.nextLine());
			StringBuffer s4 = new StringBuffer();
			s4.append(sc.nextLine());
			boolean flag1 = false;
			boolean flag2 = false;
			char c1 = 0;
			char c2 = 0;
			a: for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
					for (int j = 0; j < s2.length(); j++) {
						if (s1.charAt(i) == s2.charAt(j)) {
							c1 = s1.charAt(i);
							s1.deleteCharAt(i);
							s2.deleteCharAt(j);
							break a;
						}
					}

				}
			}
			if (c1 == 'A')
				answer += "MON ";
			else if (c1 == 'B')
				answer += "TUE ";
			else if (c1 == 'C')
				answer += "WED ";
			else if (c1 == 'D')
				answer += "THU ";
			else if (c1 == 'E')
				answer += "FRI ";
			else if (c1 == 'F')
				answer += "SAT ";
			else if (c1 == 'G')
				answer += "SUN ";
			a: for (int i = 0; i < s1.length(); i++) {
					for (int j = 0; j < s2.length(); j++) {
						if (s1.charAt(i) == s2.charAt(j)) {
							if((s1.charAt(i) >= '0'&&s1.charAt(i) <= '9')
									|| (s1.charAt(i) >= 'A'&&s1.charAt(i) <= 'Z')
									)
							c2 = s1.charAt(i);
							break a;
						}
					}
			}
			if(c2 == '0')answer += "0:";
			else if(c2 == '1')answer+= "01:";
			else if(c2 == '2')answer+= "02:";
			else if(c2 == '3')answer+= "03:";
			else if(c2 == '4')answer+= "04:";
			else if(c2 == '5')answer+= "05:";
			else if(c2 == '6')answer+= "06:";
			else if(c2 == '7')answer+= "07:";
			else if(c2 == '8')answer+= "08:";
			else if(c2 == '9')answer+= "09:";
			else if (c2 == 'A')
				answer += "10:";
			else if (c2 == 'B')
				answer += "11:";
			else if (c2 == 'C')
				answer += "12:";
			else if (c2 == 'D')
				answer += "13:";
			else if (c2 == 'E')
				answer += "14:";
			else if (c2 == 'F')
				answer += "15:";
			else if (c2 == 'G')
				answer += "16:";
			else if (c2 == 'H')
				answer += "17:";
			else if (c2 == 'I')
				answer += "18:";
			else if (c2 == 'J')
				answer += "19:";
			else if (c2 == 'K')
				answer += "20:";
			else if (c2 == 'L')
				answer += "21:";
			else if (c2 == 'M')
				answer += "22:";
			else if (c2 == 'N')
				answer += "23:";
			int min = 0;
			for(;min < ((s3.length()>s4.length())? s3.length() :s4.length());min++){
				if((s3.charAt(min) >= 'A'&&s3.charAt(min) <= 'Z')
									||(s3.charAt(min) >= 'a'&&s3.charAt(min) <= 'z'))
				if(s3.charAt(min) == s4.charAt(min)) break;
			}
			System.out.print(answer);
			if(min <10)
			System.out.format("0%d", min);
			else System.out.format("%d", min);
			s1.setLength(0);
			s2.setLength(0);
			s3.setLength(0);
			s4.setLength(0);
			
		}
	}
}
/**
 * import java.util.Scanner;

public class Main {
	private final static String[] DAY = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		Scanner in = new Scanner(System.in);

		String l1 = in.nextLine();

		String l2 = in.nextLine();

		String l3 = in.nextLine();
		String l4 = in.nextLine();
		int len1 = Math.min(l1.length(), l2.length());
		int len2 = Math.min(l3.length(), l4.length());
		boolean flag1 = true;
		for(int i = 0;i<len1;i++){
			char c = l1.charAt(i);
			if(flag1&&c>='A'&&c<='G'){
				if(c==l2.charAt(i)){
					flag1 = !flag1;
					System.out.print(DAY[c-65]+" ");
					}
				}else if (!flag1&&c==l2.charAt(i)) {
					if(c>='0'&&c<='9'){
						System.out.print("0"+c+":");
						break;
						}else if (c>='A'&&c<='N') {
							System.out.print((c-55)+":");
							break;
							}
					}
			}
		for(int i = 0;i<len2;i++)
		{
			char c = l3.charAt(i);
			if(c>='a'&&c<='z'&&c==l4.charAt(i))
			{
				if(i<10)
				System.out.print("0"+i);
				else
				System.out.print(i);
				break;
				}
			}
		in.close();
		}
}
 */


