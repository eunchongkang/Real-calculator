package calculator;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 연산결과값을 저장 할 수있도록 int배열을 통해 10개까지 저장할 수있도록 선언 및
        // 생성을 하였음
        int[] results = new int[10];
        int count = 0;

        //반복을 위해 while () {} 사용 if문에 break를 넣어 exit 할때 반복중지
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: "); //+,-,*,/
            char operator1 = sc.next().charAt(0);
            // sc.next 변수뒤 charAt 메서드를 적용하여 인덱스 번호에 있는 문자를  char 로 변환

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


            // exit 의 문자열을 작성하기 위해 String을 사용
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) 다시 시작하시려면 타이핑 해주세요");
            String operator = sc.next();
            if (operator.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 배열에 저장된 결과값이 나올때마다 하나씩 늘어날 수 있도록 지정 하였고
            // for문을 통해 정해진 배열 10까지 계속 반복 할 수 있도록 설정
            results[count] = result;
            count++;
            System.out.println("저장결과:");
            for (int i = 0; i < count; i++) {
                System.out.println(results[i]);
            }

        }
    }
}


