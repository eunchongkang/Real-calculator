package calculator;

import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
       private ArrayList<Integer> results = new ArrayList<Integer>();
       //private 를 통해 같은 클래스 내에서만 접근이 가능 하도록 캡슐화

    public int calculate(String operator, int num1, int num2) {
        int result=0;   //계산결과 변수값 초기화
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */


        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                result =  num1 / num2;
            } else {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return 0;
            }
        } else {
            System.out.println("사칙연산 기호를 올바르게 입력해주세요 (+,-,*,/) ");
            return 0;
        }
        results.add(result);
        //결과값 list 저장
        return result;
        // 연산 결과 반환
    }

    public ArrayList<Integer> getResults() {
        return results;
    }

    public void setResults(ArrayList<Integer> results) {
        this.results.clear();       // 결과를 모두 삭제
        this.results.addAll(results); // 새로운 결과 추가
    }

    }


