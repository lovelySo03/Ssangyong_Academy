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
