import java.util.Scanner;
// 스캐너는 얘를 import 해줘야함 

public class MySample1031 {
	
	public static void main(String[] args) {
	
		// 산술연산자 
		int a = 5;
		int b = a +2;
		
		a = 7;
		b = 5; 
		
		int plus = a + b;
		int minus = a - b;
		int multi = a*b;
		int div = a/b;
		int rest = a%b;
		
		System.out.printf("%d + %d = %d \n", a, b, plus);
		System.out.printf("%d - %d = %d \n", a, b, minus);
		System.out.printf("%d * %d = %d \n", a, b, multi);
		System.out.printf("%d / %d = %d \n", a, b, div);
		System.out.printf("%d %% %d = %d \n", a, b, rest);
		

	}
}

/*******************************************************************/
/*

public class MySample1031 {
	
	public static void main(String[] args) {

		/*
		 
		 증감연산자 (++, --)
		 ++a / a = a+1; / a 자신에 1증가 
		 a++ / a = a+1;
		 --a / a = a-1; / a 자신에 1감소 
		 a-- / a = a-1;

		 */

		int a = 0;
		System.out.println("a="+a); //0
		
		a++;                        // 후치증가자
		System.out.println("a=" + a); //1
		
		++a;                        // 전치증가자
		System.out.println("a=" + a); //2
		
		System.out.println("************************");
		
		a = 0; 
		System.out.println("a="+a); //0
		System.out.println("a="+ a++); //0
		System.out.println("a="+ ++a); //2
		

	}
}

*/
/*******************************************************************/
/*
  public class MySample1031 {
	
	public static void main(String[] args) {

		/*
		 
		 증감연산자 (++, --)
		 ++a / a = a+1; / a 자신에 1증가 
		 a++ / a = a+1;
		 --a / a = a-1; / a 자신에 1감소 
		 a-- / a = a-1;

		 */
		
		int a = 10;
		int b = 10;
		System.out.println("a++ =" + a++ +", ++b ="+ ++b); 
		System.out.println("실행후 a =" + a +", b ="+ b); 
		System.out.println("a-- =" + a-- +", --b ="+ --b); 
		System.out.println("실행후 a =" + a +", b ="+ b); 
	}
	
}
*/
/*******************************************************************/
/*
import java.util.Scanner;

public class MySample1031 {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println("정수 변수 a의 값을 입력해주세요 : ");
		int a = sc.nextInt();
        ++a; // 전치 증감연산자
        System.out.println(a);
        
		System.out.println("정수 변수 b의 값을 입력해주세요 : ");
		int b = sc.nextInt();
        System.out.println(b);
        b--; // 후치 증감연산자
        
        int c = a+b;
        System.out.println(c);
		System.out.printf("a=%d, b=%d, c=%d \n",a, b, c);
	}
}
*/
