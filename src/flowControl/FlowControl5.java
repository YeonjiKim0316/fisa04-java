package flowControl;

import java.util.Scanner;

public class FlowControl5 {
    public static void main(String[] args) {

        // 반복문 - for 그리고 while
        // for - 횟수가 정해져 있는 경우(배열 등 길이가 있는 참조자료형에서 모든 값을 또는 특정 조건이 맞는 값을 꺼낼 때)
        // while - 횟수가 정해져 있지 않은 경우

//        // 소문자 또는 대문자 q를 입력하면 "입력 없음", 숫자를 입력하면 짝수/홀수를 구분하는 조건문을 만들어보세요.
//        // String은 참조자료형입니다.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("q 눌러서 종료할 때까지 짝수/홀수 판별");
//        String num = sc.next(); // String으로 저장
//
//        // == 은 같은 메모리주소에서 나왔는지를 확인.
//        // 문자열 비교를 equals() 값과 자료형만 일치하는지 비교
//        if (num.equals("q") || num.equals("Q")) {
//            System.out.println("입력 없음");
//        } else {
//            int num2 = Integer.valueOf(num); // String -> int로 형변환 Integer Wrapper 클래스 안의 형변환 함수를 사용
//            String check = (num2 % 2 == 0) ? "짝수" : "홀수";
//            System.out.println(check);
//        }

        // 소문자 또는 대문자 q를 입력하면 "입력 없음", 숫자를 입력하면 짝수/홀수를 구분하는 조건문을 만들어보세요.
        // String은 참조자료형입니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("q 눌러서 종료할 때까지 짝수/홀수 판별");
        String num = sc.next(); // String으로 저장

        // == 은 같은 메모리주소에서 나왔는지를 확인.
        // 문자열 비교를 equals() 값과 자료형만 일치하는지 비교
        if (num.equals("q") || num.equals("Q")) {
            System.out.println("입력 없음");
        } else {
            int num2 = Integer.valueOf(num); // String -> int로 형변환 Integer Wrapper 클래스 안의 형변환 함수를 사용
            String check = (num2 % 2 == 0) ? "짝수" : "홀수";
            System.out.println(check);
        }
    }


}
