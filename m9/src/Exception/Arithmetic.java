package Exception;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.zerodivision error 2.Buffered 3.arrayIndexout 4.nointialisation 5.finally 6.trycatch");
			System.out.println("enetre your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				try {
					int num=50;
					int demon=50/0;
					//throw new ArithmeticException("not valid");
				}catch(Exception e) {
					System.out.println ("oops!!! Exception occured");
					//System.out.println(e.getMessage());
					
				}
				break;
			case 2:
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				try {
					
					    int x = Integer.parseInt(bf.readLine());
					    
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					int c[]=new int[1];
					c[42]=99;
				}catch(Exception e) {
					System.out.println("oops!!! Exception occured");
					e.printStackTrace();
				}
				break;
			case 4:

				try {
					String m;
					//System.out.println(m);
				}catch(NullPointerException e) {
					System.out.println("oops!!!");
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					int num=50;
					int demon=50/0;
					//throw new ArithmeticException("not valid");
				}catch(Exception e) {
					System.out.println ("oops!!! Exception occured");
					System.out.println(e.getMessage());
					}
				break;
			case 6:
				try {
					int c[]=new int[1];
					c[42]=99;
				}catch(Exception e) {
					System.out.println("oops!!! Exception occured");
					e.printStackTrace();
				}
				finally {
					System.out.println("please check the error!!!");
				}
			}
			
	}while(ch!=7);

}
}
