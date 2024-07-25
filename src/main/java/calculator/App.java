package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: "); //+,-,*,/
        char operator = sc.next().charAt(0);
        // sc.next 변수뒤 charAt 메서드를 적용하여 인덱스 번호에 있는 문자를  char 로 변환
        System.out.println("operator = " + operator);

        int result = 0;


// if 조건문을 사용하여 사칙연산 기호에 따라 연산을 하였고
// 사칙연산의 경우가 여러개 여서 else if 중첩문을 사용하였다
        if (operator == '+'){
            result = num1 + num2;
        } else if (operator == '-'){
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
            if (num2 == 0){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        } else{
            System.out.println("사칙연산 기호를 올바르게 입력해주세요 (+,-,*,/) ");
        }
        System.out.println("결과: " + result);



    }
}
