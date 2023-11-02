import java.util.Scanner;

public class MySample1031 {
	
	public static void main(String[] args) {
		
		
       // 삼항연산자 
	   // (조건)?참:거짓
		
		int x = 10, y = 5;
		int result = (x >= y) ? x : y;
		
		System.out.println("x와 y값 중 큰 값은"+ result + "입니다");
		
	}
}
/*******************************************************************/
/*

import java.util.Scanner;

public class MySample1031 {
	
	public static void main(String[] args) {
		
		
       // 삼항연산자 
	   // (조건)?참:거짓
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 : ");
		int a = sc.nextInt();
        System.out.println("a="+a);
        //String memo = "";
        String memo1 = "성인";
        String memo2 = "청소년";
		
		String result = (a >= 19) ? memo1 : memo2;
		
		System.out.println("당신은 "+ result + "입니다");
		
	}
}


*/
/*******************************************************************/
/*
import java.util.Scanner;

public class MySample1031 {
	
	public static void main(String[] args) {
       // 삼항연산자 (조건)?참:거짓
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요 : ");
		int kor = sc.nextInt();
        System.out.println("국어="+kor);
        
		System.out.println("영어점수를 입력해주세요: ");
		int eng = sc.nextInt();
        System.out.println("영어="+eng);
        
		System.out.println("수학점수를 입력해주세요 : ");
		int math = sc.nextInt();
        System.out.println("수학="+math);
        
        int avg = (kor + eng + math)/3;
        
        //String memo = "";
        String memo1 = "통과";
        String memo2 = "미통과";
		String result = (avg >= 70) ? memo1 : memo2;
		System.out.println("당신의 평균은 "+ avg + "점이고, " + result + "하셨습니다.");
	}
}

*/
