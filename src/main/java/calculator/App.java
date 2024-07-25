package calculator;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: "); //+,-,*,/
            char operator1 = sc.next().charAt(0);

            // sc.next 변수뒤 charAt 메서드를 적용하여 인덱스 번호에 있는 문자를  char 로 변환



            // exit 의 문자열을 작성하기 위해 String을 사용
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String operator = sc.next();
            if (operator.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int result = 0;

// if 조건문을 사용하여 사칙연산 기호에 따라 연산을 하였고
// 사칙연산의 경우가 여러개 여서 else if 중첩문을 사용하였다
            if (operator1 == '+') {
                result = num1 + num2;
            } else if (operator1 == '-') {
                result = num1 - num2;
            } else if (operator1 == '*') {
                result = num1 * num2;
            } else if (operator1 == '/') {
                if (num2 != 0) {
                    result = num1 / num2;}
                else{
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    }
            } else {
                System.out.println("사칙연산 기호를 올바르게 입력해주세요 (+,-,*,/) ");
            }
            System.out.println("결과: " + result);

            // /* exit 을 입력 받으면 반복 종료 */

        }
    }
}


// while (true) {  //  /* 반복문 사용 해서 연산을 반복 */
//if (operator == 'E') {
//                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
//            }