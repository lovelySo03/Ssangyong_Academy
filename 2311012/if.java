/*
%가 쓰이는 용도
① if와 함께 짝수, 홀수를 구할 때
② 어떤 수의 배수를 구할 때 

비교연산자 
값이 ture인지, false인지로 나뉜다 

! true  -> false
! false -> true 

대입연산자 
변수명 = 값 
*/
/*******************************************************************/
import java.util.*;

public class MySample1031 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("주사위 던진 결과를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if ( 6>a && a> 4 && 6>b && b> 4) {
			System.out.println("이겼습니다.");
		} else if ((6>a && a > 4) || (6>b && b > 4)) {
			System.out.println("비겼습니다.");
		} else if (a>=1 && a < 4 && b>=1&& b < 4) {
			System.out.println("졌습니다.");
		} else {
			System.out.println("1에서 6사이의 값을 입력하세요");
		}
		
	}
}
/*******************************************************************/
/*
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 월을 입력하세요");
		int month = sc.nextInt();

		switch (month) 
		{
		    case 3: case 4: case 5:
			System.out.println("현재 계절은 봄 입니다.");
			break;
			
		    case 6: case 7: case 8:
			System.out.println("현재 계절은 여름 입니다.");
			break;
			
		    case 9: case 10: case 11:
			System.out.println("현재 계절은 가을 입니다.");
			break;
			
		    case 12: case 1: case 2:
			System.out.println("현재 계절은 겨울 입니다.");
			break;
			
			default:
				System.out.println("월을 잘못 입력하셨습니다.");
			break;
		}
	}
}
/*******************************************************************/

*/
/*
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 월을 입력하세요");
		int month = sc.nextInt();

		switch (month) 
		{
		    case 3: 
            case 4: 
		    case 5: 
			System.out.println("현재 계절은 봄 입니다.");
			break;
			
		    case 6: 
		    case 7:
		    case 8:  
			System.out.println("현재 계절은 여름 입니다.");
			break;
			
		    case 9: 
		    case 10: 
		    case 11: 
			System.out.println("현재 계절은 가을 입니다.");
			break;
			
		    case 12:
		    case 1:
		    case 2:   
			System.out.println("현재 계절은 겨울 입니다.");
			break;
			
			default:
				System.out.println("월을 잘못 입력하셨습니다.");
			break;
		}
	}
}

*/
