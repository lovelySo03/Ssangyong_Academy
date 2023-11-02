/*
아스키코드 활용 

if (opt == ' ')
{
System.out.println("");
}
A는 65로 시작. 
a는 97로 시작. 
*/

import java.util.*;

public class MyClass {
    public static void main(String args[]) {

        char grade = 'A';
        System.out.printf("grade 숫자 %d, 값 %c\n", Integer.valueOf(grade), grade);

        char grade2 = 'a';
        System.out.printf("grade 숫자 %d, 값 %c\n", Integer.valueOf(grade2), grade2);
        
        // 유일하게 char타입은 숫자로 변환가능
        // char 타입 영문자는 유일하게 1대 1 매칭이 된다 
        // 문자이지만 정수값으로 불러오는 옵션
        
    }
}
​
