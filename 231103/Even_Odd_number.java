
public class MySample_1102 {

	public static void main(String[] args) {
		
        // 짝홀수 체크하는 문제 
		System.out.println("Hello");
		
		int i = 0;
		
		for(i=0;i<20;i++) {
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}


/*
import java.util.Scanner;


public class MySample_1102 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int count = 0;
		System.out.println("정수를 입력하세요");
		
		for(int i=0;i<10;i++) {
		
			num[i] = sc.nextInt();
			if(num[i]%2==0){
				count++;
			}
		}
		System.out.println("입력받은 짝수는 "+count+"개 입니다");

	}
}

*/

/*
import java.util.Scanner;

public class MySample_1102 {

	public static void main(String[] args) {

		System.out.println("10개의 정수를 입력받아 그 중 짝수의 개수가 몇 개인지 출력하는 프로그램");

		Scanner sc = new Scanner(System.in);
		int num = 1;
		int count = 0;

		for (int i = 0; i < 10; i++) {

			num = sc.nextInt();
			if (num % 2 == 0) {
				count++;
			}
		}
		System.out.println("입력받은 짝수는 " + count + "개 입니다");

	}
}

*/
