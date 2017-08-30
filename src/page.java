import java.util.Arrays;
import java.util.Scanner;

public class page {
	class window{
		window(int maker){
			System.out.println("Window("+maker+")");
		}
	}
	class House{
		House(){
			System.out.println("House()");
			w3 = new window(33);
		}
		window w1 = new window(1);
		window w2 = new window(2);
		window w3 = new window(3);
		void f(){
			System.out.println("f()");
		}
		
	}
	public static void main(String[] args){
		page p = new page();
		House h =p.new House();
		h.f();
	}
	
}

