public class MySample1103 {

	public static void main(String[] args) {
	
		// 공백은 탭 't' 사용 
		int i = 0;
		int j = 10;
		
		for(i=0, j=10; i<10; i++, j--) {
			System.out.printf("%d \t %d \n",i+1,j);		}
	}
}

/*
import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {

		int i, j;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

*/

/*
import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {

		int i, j;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}

*/
/*
import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {

		int i, j;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}

*/
/*
import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {
		// 구구단 만드는 문제 
		int i, j;
		for(i=2;i<5;i++) { 
			for(j=1;j<=9;j++) {
			
		              System.out.printf("%2d * %2d = %2d\n",i,j,i*j);	            
			}
			System.out.print("\n");
		}
	}
}
*/

/*
import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {
		// 구구단 만드는 문제 
		int i, j;
		for(i=2;i<=9;i++) { 
			for(j=1;j<=9;j++) {
			
		              System.out.printf("%2d * %2d = %2d\n",i,j,i*j);	            
			}
			System.out.print("\n");
		}
	}
}

*/

/*
import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {
		// 구구단 만드는 문제 
		int i, j;
		for(i=2;i<=9;i++) { 
			for(j=1;j<=9;j++) {
			
		              System.out.printf("%2d * %2d = %2d\t",i,j,i*j);	            
			}
			System.out.print("\n");
		}
	}
}
*/
/*
import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {

		// 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int i = 0;
		int j = 0;
		
		int n = sc.nextInt();
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print("["+(i+1)+","+(j+1)+"]");
			}
			
			System.out.println();
		}

		
	}
}
​*/
