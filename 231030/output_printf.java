public class Hello {
	
	public static void main(String[] args) {
		
		// printf는 엔터를 포함하고 있지 않다. 
		System.out.printf("정수 첫번째 %d, 정수 두번째 %d입니다. %d", 10, 20, 30);
 		System.out.printf("실수 %f 입니다.", 26.123456);
 		// 실수를 소수점 둘째자리까지만 출력하고 싶을 때
		System.out.printf("소숫점 둘째자리 실수 %.2f입니다.",26.123456); 
		System.out.println();
		System.out.printf("문자 %c입니다\n",'A');
		System.out.printf("문자 %c입니다\n",'가');
		System.out.printf("문자열 %s입니다","테스트");
		System.out.println();

	}
	
}
