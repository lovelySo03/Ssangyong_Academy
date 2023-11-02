import java.util.Scanner;
// 스캐너는 얘를 import 해줘야함 

public class MySample1031 {
	
	public static void main(String[] args) {
	
		// 상수 (중간에 final 키워드가 들어감)
		// 컴파일러에게 상수라는 걸 알려주는 것 
		// 상수는 full로 대문자. 단어와 단어 사이를 _로 표시 
		// 상수는 선언하면서, 초기값 설정을 해줘야함 (자바 버전에 따라 다르긴 함)
		
		final int MAX_SPEED ;
		final int MAX_VALUE = 10;
		
		MAX_SPEED = 200;
		
		System.out.println(MAX_SPEED);
		System.out.println(MAX_VALUE);		
	}
}
