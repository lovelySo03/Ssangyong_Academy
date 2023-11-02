public class MySample1031 {
	
	public static void main(String[] args) {
		
		// 비교연산자 결과가 true나 false
		int a = 10;
		int b = 20;
		int c = 20;
		System.out.println("a==b "+(a==b)); // false
		System.out.println("b==c "+(a==b));	// true
		System.out.println("a!=c "+(a!=b));	// true 
		System.out.println("b!=c "+(b!=c)); // false
		System.out.println("a>b "+(a>b)); // false
	}
}

/*******************************************************************/
/*
import java.util.Scanner;

public class MySample1031 {
	
	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
		System.out.println("정수 변수 a의 값을 입력해주세요 : ");
		int a = sc.nextInt();
        System.out.println("a="+a);
        
		System.out.println("정수 변수 b의 값을 입력해주세요 : ");
		int b = sc.nextInt();
        System.out.println("b="+b);
        
		System.out.println("정수 변수 c의 값을 입력해주세요 : ");
		int c = sc.nextInt();
        System.out.println("c="+c);

        
		System.out.println("a==b "+(a==b)); 
		System.out.println("b==c "+(a==b));	
		System.out.println("a!=b "+(a==b)); 
		System.out.println("b!=c "+(a==b));	

	}
}

*/
/*******************************************************************/
/*

import java.util.Scanner;

public class MySample1031 {
	
	public static void main(String[] args) {
		
		
       // 논리연산자 (&&, ||)
       // 순서가 비교연산 다음에 논리연산이다 
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println("(a>b && b<c):"+(a>b && b<c));
		System.out.println("(a>b || b<c):"+(a>b || b<c));
	}
}
*/
/*******************************************************************/
/*
import java.util.Scanner;

public class MySample1031 {
	
	public static void main(String[] args) {
		
		
       // 논리연산자 (&&, ||)
       // 순서가 비교연산 다음에 논리연산이다 
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("(a>b && a<=b)"+(a>b && a<=b));
		System.out.println("(a>b || a<=b)"+(a>b || a<=b));
		System.out.println("(b<c && a<c)"+(b<c && a<c));
		System.out.println("!(a>b && a<=b)"+!(a>b && a<=b));
	}
}

*/
/*******************************************************************/


