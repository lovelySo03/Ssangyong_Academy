import java.util.Scanner;

public class Mysample1101 {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("점수를 입력해주세요 : ");
				int a = sc.nextInt();  
				
		        if (a>80) {
					System.out.println("축하합니다. 합격입니다. ");
		        }
		        
		        else {
					System.out.println("죄송합니다. 불합격입니다.");
		        }
		        //String memo = "";

        }
	}
/*******************************************************************/

/*
import java.util.Scanner;

public class Mysample1101 {

	public static void main(String[] args) {

				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("숫자를 입력해주세요 : ");
				int a = sc.nextInt();
		        
		      
		        if(a!=0) {
		            System.out.println("입력하신 정수는 0이 아닙니다");  
		            System.out.println("입력하신 정수는 "+ a+"입니다");   
		        }
		        
		        else {
		            System.out.println("입력하신 정수는 0입니다");   
		        }
		        

        }
	}

*/
/*******************************************************************/
/*
import java.util.*;

public class MySample1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();

		if (num > 10) {// 양수일 경우 실행
			System.out.println("10보다 큰 수를 입력하셨습니다");

		}

		else { // 양수가 아닐 경우 실행
			if (num < 0) { // 0일 경우
				System.out.println("음수를 입력하셨습니다");
			}

			else { // 0이 아닐 경우
				System.out.println("1에서 10 사이의 정수를 입력하셨습니다.");

			}

		}
	}
}

*/
/*******************************************************************/
/*
import java.util.*;

public class MySample1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();

		if (n >= 90) {
			System.out.println("판정:수");
		} else if (n >= 80) {

			System.out.println("판정:우");
		} else if (n >= 70) {
			System.out.println("판정:미");
		} else if (n >= 60) {
			System.out.println("판정:양");
		} else
			System.out.println("판정:가");

		System.out.println("종료");

	}
}
*/
/*******************************************************************/
/*
import java.util.*;

public class MySample1031 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();

		if (n<0 || n>100) {
			System.out.println("점수는 0~100점 사이 입력이 가능합니다");
		}else
			System.out.println("점수는 " + n + "점입니다.");

	}
}
*/
/*******************************************************************/
/*
import java.util.*;

public class Mysample1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수로 월을 입력받아 계절을 출력하는 프로그램입니다");
		System.out.print("정수로 월을 입력해주세요 :");
		int n = sc.nextInt();

		if (3 <= n && n <= 5) {
			System.out.println("봄 입니다");
		} else if (6 <= n && n <= 8) {
			System.out.println("여름 입니다");
		} else if (9 <= n && n <= 11) {
			System.out.println("가을 입니다");
		} else if (12 == n || n == 1 || n == 2) {
			System.out.println("겨울 입니다");
		} else {
			System.out.println("잘못 입력되었습니다. 1~12 사이를 입력하세요.");
		}

	}
}
*/


