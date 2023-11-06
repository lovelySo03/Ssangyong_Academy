public class MySample1103 {

	public static void main(String[] args) {
	
		// 대문제를 'A'부터 'Z'까지 차례대로 출력 
		// 단, char 타입의 i 변수만 사용
		// #char 타입은 ASCII 코드로 인해 1씩 증가가 가능합
		
		char i;
		
		for(i='A';i<='Z';i++)
		{
			System.out.print(i);
		}
		
		char letter = 'A';
		System.out.print(letter+"\t");
		System.out.println((int)letter);
		
		char letter2 = 'Z';
		System.out.print(letter2+"\t");
		System.out.println((int)letter2+"\n");
	}
}

/*

public class MySample1103 {

	public static void main(String[] args) {
	
		// 대문제를 'A'부터 'Z'까지 차례대로 출력 
		// 단, char 타입의 i 변수만 사용
		// #char 타입은 ASCII 코드로 인해 1씩 증가가 가능합
		
		char i;
		
		for(i='A';i<='Z';i++)
			System.out.print(i);

		
		System.out.println("\nA\t" + (int)'A');
		System.out.println("Z\t" + (int)'Z');
	}
}

*/
