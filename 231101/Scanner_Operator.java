import java.util.Scanner;

public class Mysample1101 {

	public static void main(String[] args) {
					
				Scanner sc = new Scanner(System.in);
				System.out.println("국어점수를 입력해주세요 : ");
				int kor = sc.nextInt();
		        
				System.out.println("영어점수를 입력해주세요: ");
				int eng = sc.nextInt();
		        
				System.out.println("수학점수를 입력해주세요 : ");
				int math = sc.nextInt();

				System.out.println("컴퓨터점수를 입력해주세요 : ");
				int com = sc.nextInt();

		        int avg = (kor + eng + math+ com)/4;
		        
		        //String memo = "";
		        String memo1 = "합격";
		        String memo2 = "불합격";
		        
				String result = (kor<60||eng<60||math<60||com<60||avg<70) ? memo2 : memo1;
				System.out.println("당신의 평균은 "+ avg + "점이고, " + result + "하셨습니다.");

        }
	}
/*******************************************************************/

/*
import java.util.Scanner;

public class Mysample1101 {

	public static void main(String[] args) {
		
				String msg = "합격";			
				Scanner sc = new Scanner(System.in);
				System.out.println("국어점수를 입력해주세요 : ");
				int kor = sc.nextInt();  
				System.out.println("영어점수를 입력해주세요: ");
				int eng = sc.nextInt(); 
				System.out.println("수학점수를 입력해주세요 : ");
				int math = sc.nextInt();
				System.out.println("컴퓨터점수를 입력해주세요 : ");
				int com = sc.nextInt();

		        int avg = (kor + eng + math+ com)/4;
		        
		        if (kor<60 || eng<60 || math<60 || com<60 || avg<70) {
		        	msg = "불합격";
		        }
		        //String memo = "";

				System.out.println("당신의 평균은 "+ avg + "점이고, " + msg + "하셨습니다.");

        }
	}

*/
/*******************************************************************/
