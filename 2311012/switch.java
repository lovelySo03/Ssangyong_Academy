// 조건문(switch)

switch (조건식) // 조건식을 계산한 값을 분기 
{ 
    case 값1: // 값에 변수, 실수 불가 (문자열, 리터럴 가능 JDK1.7부터) 
      // 조건식의 결과와 값1이 같은 경우 실행 
      break;
    case 값2:
      // 조건식의 결과와 값2이 같은 경우 실행 
      break;   
    default:   
      // 조건식의 결과와 일치하는 값이 없을 때 실행한다  
}
/*******************************************************************/
/*
// switch문

switch(기준값) {
case 비교값1:
     수행문1;
case 비교값2:
     수행문2;
default:
     기본 수행문;
}
*/
/*******************************************************************/
/*
public class MyClass {
    public static void main(String args[]) {

      char grade = 'B';
      
      switch(grade){
          case 'A':
              System.out.println("A등급은 90~100점 사이.");
          case 'B':
              System.out.println("B등급은 80~89점 사이.");
          case 'C':
              System.out.println("C등급은 70~79점 사이.");
          case 'D':
              System.out.println("D등급은 60~69점 사이.");
          default:
              System.out.println("존재하지 않는 등급입니다");
      }
      
    }
}
*/
/*
public class MyClass {
    public static void main(String args[]) {

      char grade = 'B';
      
      switch(grade){
          case 'A':
              System.out.println("A등급은 90~100점 사이.");
              break;
          case 'B':
              System.out.println("B등급은 80~89점 사이.");
              break;
          case 'C':
              System.out.println("C등급은 70~79점 사이.");
              break;
          case 'D':
              System.out.println("D등급은 60~69점 사이.");
              break;
          default:
              System.out.println("존재하지 않는 등급입니다");
      }
      
    }
}
*/
/*******************************************************************/
/*

public class Hello {

	public static void main(String[] args) {
		// switch~case 문
		int a = 3;

		switch (a) 
		{
			case 3:
				System.out.println("3 입니다.");
		//		break;
			default:
				System.out.println("default 입니다.");				
		}

		System.out.println("Hello");
	}
}

*/
/*******************************************************************/
/*

public class Hello {

	public static void main(String[] args) {
		// switch~case 문
		int a = 2;

		switch (a) 
		{
			default:
				System.out.println("default 입니다.");
			case 3:
				System.out.println("3 입니다.");
		//		break;
		}

		System.out.println("Hello");
	}
}

*/
/*******************************************************************/
/*

public class Hello {

	public static void main(String[] args) {
		// switch~case 문
		int a = 5;
		
		// 1, 2, 3이 아닌 숫자는 다 default로 감 !! 
		// 그니까 case는 투입구 같은 거라고 생각하면 됨 
		// 투입구에 동전 넣어서 break 만날때까지 하는거 
		// 투입구가 맞지 않으면, 맞는거 만날때까지, 아니면 default를 만날 때까지 동전 안넣는거.. 

		switch (a) 
		{
			case 1:
			System.out.println("1 입니다.");
			break;
			
			default:
				System.out.println("default 입니다.");
			
			case 2:
			System.out.println("2 입니다.");

			case 3:
				System.out.println("3 입니다.");
				break;
		
		}

		System.out.println("Hello");
	}
}

*/
/*******************************************************************/
/*
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		// switch를 if문으로 변경 
		Scanner sc = new Scanner(System.in);
		System.out.println("1.추가\n2.수정\n3.삭제\n메뉴번호를 선택하세요");
		int n = sc.nextInt();
		
		switch(n){
			case 1:
				System.out.println("추가를");
				break;
			case 2:
				System.out.println("수정을");
				break;
			case 3:
				System.out.println("삭제를");
				break;
			default:
				System.out.println("잘못");
				break;

		}

		System.out.println("선택하셨습니다");


		
	}
}

*/
