package calculator;


import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(); //Calculator 객체 생성

        Scanner sc = new Scanner(System.in);


        // 값을 무한히 저장하기 위해 동적 배열인 ArrayList 사용을 위해 선언 및 생성 하였음
        ArrayList<Integer> results = new ArrayList<>();


        //반복을 위해 while () {} 사용 if문에 break를 넣어 exit 할때 반복중지

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: "); //+,-,*,/
            String operator = sc.next();



// if 조건문을 사용하여 사칙연산 기호에 따라 연산을 하였고
// 사칙연산의 경우가 여러개 여서 else if 중첩문을 사용하였다
//            if (operator1 == '+') {
//                result = num1 + num2;
//            } else if (operator1 == '-') {
//                result = num1 - num2;
//            } else if (operator1 == '*') {
//                result = num1 * num2;
//            } else if (operator1 == '/') {
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                    continue;
//                }
//            } else {
//                System.out.println("사칙연산 기호를 올바르게 입력해주세요 (+,-,*,/) ");
//            }
//
//
//            results.add(result); // results 에 연산결과 값을 추가
//
//            System.out.println("결과: " + result);
//
//
//            System.out.println("저장결과:");
//            for (int rst : results) {
//                System.out.println(rst);   // for 문을 통해 연산결과를 rst 변수명으로 지정후 프린트
//            }

            int result=0;
            try {
                result = calculator.calculate(operator, num1, num2);
            } catch (Exception m){
                System.out.println(m.getMessage()); // 예외 후 처리
            }
            System.out.println("결과: " + result);
            //calculator 클래스의 calculate 매서드 호출, 연산실행

            calculator.getResults().add(result);


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeChat = sc.next();
            if (removeChat.equals("remove") && !calculator.getResults().isEmpty()) { //calculator 클래스의 결과값을 가져옴
                calculator.removeResult(0);
            } // remove를 타이핑하고 결과값이 비어있지 않은경우 0번째 요소를 삭제

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                calculator.inquiryResults();
//                results = calculator.getResults(); // Calculator 클래스의 결과값을 resluts 변수에 저장
//                for (int rst : calculator.getResults()) {   //향상된 for문을 사용하여 저장결과값 rst를 반복하여 조회 할 수 있도록 함
//                    System.out.println(rst);
//                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) 다시 시작하시려면 타이핑 해주세요");
            String exit = sc.next();
            if (exit.equals("exit")) { //equals 메서드를 사용해 두 문자열의 동일한 값을 가짐을 확인
                System.out.println("프로그램을 종료합니다.");
                break;
            }


        }
    }
}








