import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하는 프로그램");
		System.out.println("단, 3의 배수이면서 5의 배수인 경우는 3의 배수에만 포함");

		int num = 1;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < 10; i++) {

			num = sc.nextInt();
			if (num % 3 == 0) {
				count1++;
			}

			if ((num % 5 == 0) && (num % 3 != 0)) {
				count2++;
			}
		}
		System.out.println("3의 배수 " + count1 + "    5의 배수 "+count2);
	}
}

/*
import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하는 프로그램");
		System.out.println("단, 3의 배수이면서 5의 배수인 경우는 3의 배수에만 포함");

		int num = 1;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < 10; i++) {

			num = sc.nextInt();
			
			switch(num % 3)
			{
				case 0:
					count1++;
					break;
			}
			
			switch(num % 5)
			{
				case 0:
					count2++;
					switch(num%3)
					{
						case 0:
							count2--;
							break;
					}
			}
		}
		System.out.println("3의 배수 " + count1 + "    5의 배수 "+count2);
	}
}

*/

