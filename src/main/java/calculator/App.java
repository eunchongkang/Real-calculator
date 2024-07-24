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

    }
}
