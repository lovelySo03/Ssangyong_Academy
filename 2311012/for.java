import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		int i, sum = 0;
		
		for(i=1; i<=5; i++) {
			sum += i;
			System.out.println("i="+i+ ", sum"+sum);
		}

		System.out.println("\nfor문 끝!");
		System.out.println("i= "+i+" sum= "+sum);

		
	}
}

/*************************************************************************************/

/*
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("1부터 10까지의 합을 구하는 프로그램");
		int i, sum = 0;
		
		for(i=1; i<=10; i++) {
			sum += i;
		}

		System.out.println("sum= "+sum);

		
	}
}

*/

/*************************************************************************************/

/*


쌍용국비학원
23.11.02  반복제어문 for문

프로파일
 bayleaf07 ・ 16시간 전
URL 복사  통계 
본문 기타 기능
/


import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		int i, sum = 0;
		
		for(i=1; i<=5; i++) {
			sum += i;
			System.out.println("i="+i+ ", sum"+sum);
		}

		System.out.println("\nfor문 끝!");
		System.out.println("i= "+i+" sum= "+sum);

		
	}
}
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("1부터 10까지의 합을 구하는 프로그램");
		int i, sum = 0;
		
		for(i=1; i<=10; i++) {
			sum += i;
		}

		System.out.println("sum= "+sum);

		
	}
}

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상 10이하의 정수를 입력하세요");

		int num = sc.nextInt();

		for(int i=0; i<num; i++) {
			System.out.println("JAVA프로그래밍 "+(i+1));
		}
		
	}
}

*/
/*
String a = sc.nextLine();
원래 이거는 엔터를 칠 때까지 String으로 문자열을 받는다는 뜻 

★ char a = sc.nextLine().charAt(0);
이거는 엔터를 칠때까지 입력을 받고 
그 중에서 첫번째 글자만 데려오는 것 
char을 사용하기 위해서 하는 것이다.
그냥 외우기  

int i = sc.nextInt();
이게 정수를 받기 위한 것
엔터칠 때까지 정수받기 
*/
