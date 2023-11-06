
public class MySample_1102 {

	public static void main(String[] args) {
		
		int[] scoreList = {10, 20, 30, 40, 50};
		
		for (int i=0; i<5; i++) {
			System.out.println("scoreList ["+i+"] ="+scoreList[i]);
		}

	}

}

/*
public class MySample_1102 {

	public static void main(String[] args) {
		
		int[] scoreList = {10, 20, 30, 40, 50};
		
		// 향상된 for문
		for (int score : scoreList) {
			System.out.println("score :" + score);
		}

	}

}
*/
/*
배열은 생성되는 순간, 
저장할 수 있는 데이터의 개수가 결정된다. 

예를 들어, new int[3]; 
총 3개의 변수를 저장할 수 있는 배열 객체가 생성된다

그런데 만약 생성된 배열 객체를 사용할 때, 
존재하지 않는 인덱스에 접근하려고 하면 문제가 발생한다. 

​*/
