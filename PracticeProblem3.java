import java.util.*;
public class PracticeProblem3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 Num:");
		int a = sc.nextInt();
		System.out.print("Enter 2 Num:");
		int b = sc.nextInt();
		System.out.print("Enter 3 Num:");
		int c = sc.nextInt();
		System.out.print("Enter 4 Num:");
		int d = sc.nextInt();
		System.out.print("Enter 5 Num:");
		int e = sc.nextInt();
		System.out.print(Math.max(a,Math.max(b,Math.max(c,Math.max(d,e)))));
		System.out.print(Math.min(a,Math.min(b,Math.min(c,Math.min(d,e)))));
	}
}
