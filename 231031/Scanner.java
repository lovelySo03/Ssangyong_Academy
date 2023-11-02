/* 스캐너 
String input = scn.nextLine();
문자를 입력받을 때 

String input = scn.nextInt();
숫자를 입력받을 때 */

/*******************************************************************/
import java.util.Scanner;
// 스캐너는 얘를 import 해줘야함 

public class MySample1031 {
	
	public static void main(String[] args) {
	
		// **** 스캐너 ****
		
		Scanner scn = new Scanner(System.in);
		// 빨간색 밑줄 : 문제가 생겼다는 것 
		// 노란색 밑줄 : 변수 선언을 했는데, 쓰는 곳이 없오
		
		System.out.print("정수를 하나 입력하세요.>");
		String input = scn.nextLine();
		// 입력받은 값을 문자열로 반환해주는 애 
		// 엔터를 칠 때까지 값을 입력받는다 
		
		int num = Integer.parseInt(input);
		System.out.println("입력받은 값 :" + input);
		System.out.printf("num = %d \n", num);
		
	}
}
/*******************************************************************/
/*
import java.util.Scanner;
// 스캐너는 얘를 import 해줘야함 

public class MySample1031 {
	
	public static void main(String[] args) {
	
		// 나이를 입력 받아 출력하는 프로그램 

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		String input = sc.nextLine();
		
		int num = Integer.parseInt(input);
		System.out.println("당신의 나이는 " + input + "입니다");
	}
}
*/

/*******************************************************************/
/*
import java.util.Scanner;
// 스캐너는 얘를 import 해줘야함 

public class MySample1031 {
	
	public static void main(String[] args) {
	
		// 나이를 입력 받아 출력하는 프로그램 

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("당신의 나이는 " + input + "살 입니다");
		System.out.println("당신의 나이는 " + num + "살 입니다");		
		System.out.printf("당신의 나이는 %d살 입니다", num);
		System.out.printf("당신의 나이는 %s살 입니다", input);
	}
}
*/
