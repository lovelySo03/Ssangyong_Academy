public class Hello4 {
	
	public static void main(String[] args) {
		
		/* 
		 출력예) subject     score
		      ==================
		         korea        90
		       english       100
		      computer        80
		      
		  단, printf 매서드를 이용하여 ""에는 서식문자와 줄바꿈만 포함
		  subject와 score 사이에 공백 5개 포함
		  subject는 문자 3자리(%8s), score 숫자6자리(%6d)로 고정
		  예 : System.out.printf("%s \n","==================");
		 */
		
		System.out.printf("%8s%5s%6s","subject"," ","score\n");
		System.out.printf("%19s","===================\n");
		System.out.printf("%8s%5s%6s","korea"," ","90\n");
		System.out.printf("%8s%5s%6s","english"," ","100\n");
		System.out.printf("%8s%5s%6s","computer"," ","80\n");
	}
	
}
