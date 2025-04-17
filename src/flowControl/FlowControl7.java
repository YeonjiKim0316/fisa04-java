package flowControl;

import java.util.Scanner;

public class FlowControl7 {
    public static void main(String[] args) {
//        // 1. 소문자 또는 대문자 q를 입력하면 "입력 없음", 숫자를 입력하면 짝수/홀수를 구분하는 조건문을 만들어보세요.
//        // String은 참조자료형입니다.
//        String num = "q";
//
//        if (num == "q" || num == "Q") {
//            System.out.println("입력 없음");
//        } else {
//            int num2 = Integer.valueOf(num); // String -> int로 형변환 Integer Wrapper 클래스 안의 형변환 함수를 사용
//            String check = (num2 % 2 == 0) ? "짝수" : "홀수";
//            System.out.println(check);
//        }

//        // 2. 소문자 또는 대문자 q를 입력하면 "입력 없음", 숫자를 입력하면 짝수/홀수를 구분하는 조건문을 만들어보세요.
//        // String은 참조자료형입니다.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("q 눌러서 종료할 때까지 짝수/홀수 판별");
//        String num = sc.next(); // String으로 저장
//
//        // == 은 같은 메모리주소에서 나왔는지를 확인. 파이썬 is
//        // 문자열 비교를 equals() 값과 자료형만 일치하는지 비교  파이썬의 ==
//        if (num.equals("q") || num.equals("Q")) {
//            System.out.println("입력 없음");
//        } else {
//            int num2 = Integer.valueOf(num); // String -> int로 형변환 Integer Wrapper 클래스 안의 형변환 함수를 사용
//            String check = (num2 % 2 == 0) ? "짝수" : "홀수";
//            System.out.println(check);
//        }

        // 3. q 눌러서 종료할 때까지 짝수/홀수 판별하는 while문으로 변경
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("q 눌러서 종료할 때까지 짝수/홀수 판별");
            String num = sc.next(); // String으로 저장

            // == 은 같은 메모리주소에서 나왔는지를 확인. 파이썬 is
            // 문자열 비교를 equals() 값과 자료형만 일치하는지 비교  파이썬의 ==
            if (num.equals("q") || num.equals("Q")) {
                System.out.println("종료");
                break;
            } else {
                int num2 = Integer.valueOf(num); // String -> int로 형변환 Integer Wrapper 클래스 안의 형변환 함수를 사용
                String check = (num2 % 2 == 0) ? "짝수" : "홀수";
                System.out.println(check);
            }

        }
    }
}
