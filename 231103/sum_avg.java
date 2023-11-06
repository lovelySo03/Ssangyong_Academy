import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
// 5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램 

		System.out.println("5명의 성적을 입력하세요");
		int num = 0;
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			sum = sum + num;
			}
		avg = (double)sum/5.0;
		
		System.out.println("\n총점 :" + sum + " 평균 :"+avg);
	}
}
