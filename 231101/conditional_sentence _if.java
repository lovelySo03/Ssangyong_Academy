import java.util.Scanner;

public class Mysample1101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 : ");
		int a = sc.nextInt();
        
      
        if(a!=0) {
            System.out.println("입력하신 정수는 0이 아닙니다");  
            System.out.println("입력하신 정수는 "+ a+"입니다");   
        }
        
        if(a==0) {
            System.out.println("입력하신 정수는 0입니다");   
        }
        
  
        }

	}
/*******************************************************************/
/*
import java.util.Scanner;

public class Mysample1101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println(a);
      
        if(a<0) {
            System.out.println("minus");    
        }
        
        }
	}
*/
/*******************************************************************/
/*
  if( a > 0 && ++b > a)
        
        // &&나 || 연산자에서는 ++a, --b와 같은 증감연산자를 넣지 않는 것이 좋다. 
        // 오류를 발생시킬 수 있기 때문에 
        	
        // && 앞에 내용이 false이면, 아예 if문이 거기서 실행되지 않는다. 
        // &&는 왼쪽도 참, 오른쪽도 참이어야 실행된다는 특징을 가지고 있기 때문에 
        
        // 그래서 프로그래머들은 시간을 단축하기 위해 false가 될 것 같은 걸 && 앞에 두는 경우가 많다. 
        
        if( a > 0 || ++b > a)
        // Or은 앞에 것이 참이면, 뒤에꺼 실행할 필요도 없이 참으로 간주한다. 
        // 반대로 Or 연산자는 앞에서 true인 확률이 높은 걸 둔다. 
        논리연산자의 규칙을 잘 알아야하고, 

컴파일이 어떤 순서로 되는지 잘 알아야한다. 
*/
/*******************************************************************/
/*
import java.util.Scanner;

public class Mysample1101 {

	public static void main(String[] args) {
		
		int temp=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("크기가 다른 정수 2개를 입력해주세요");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a);
		System.out.println(b);

        if(a>b) {
            System.out.println("입력받은 수 중 큰 수는 "+a+"이며, 작은 수는"+b+"입니다");    
        }
        
        if(a==0) {
            System.out.println("값을 다시 입력하세요");    
        }
        if(a<b) {
        	
        	temp = a;
        	a = b;
        	b = temp;
            System.out.println("입력받은 수 중 큰 수는 "+a+"이며, 작은 수는"+b+"입니다");  
        }
        

        
        }
	}
*/
/*******************************************************************/
/*
import java.util.Scanner;

public class Mysample1101 {

	public static void main(String[] args) {
		
		int temp=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("크기가 다른 정수 2개를 입력해주세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
        if(a<b) {
        	
        	temp = a;
        	a = b;
        	b = temp;
        }
        System.out.println("입력받은 수 중 큰 수는 "+a+"이며, 작은 수는"+b+"입니다");    
        
        }
	}

*/
