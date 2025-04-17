package flowControl;

public class FlowControl4 {
    public static void main(String[] args) {
//        // 자료형 변환
//        // 기본 자료형을 참조 자료형(String, ArrayList, List, Map, Set)등으로 변환할 때는
//        // Integer / Byte / Boolean 처럼 기본 자료형을 감싸서 메모리 주소를 돌려주는 Wrapper Class를 거칩니다.
//
//        // 웹에서 들어오는 데이터는 String입니다.
//        int int1 = 123;
//        double double1 = 123.7;
//        String str = "123";
//
//        // 정수 -> 실수
//        System.out.println((double)int1);
//
//        // 실수 -> 정수
//        System.out.println((int)double1); // 소수점 이하 부분을 버린다 - 데이터의 손실에 대해 고려
//
//        // 문자열 -> 정수
//        // 개발시 참조자료형을 기본자료형으로 변환하는 경우가 많은데
//        // 참조자료형은 메모리주소를 간직해야 하기 때문에
//        // 편의를 제공하기 위해 Wrapper Class Integer -> int 로 사용합니다.
////        System.out.println((int)str);
//        System.out.println(Integer.valueOf(str) + 10);
//
//        // 문자열 -> 실수
//        System.out.println(Double.valueOf(str)); // 123.0
//
//        // 정수 -> String으로 변환
//        System.out.println(String.valueOf(int1) + "가나다");
//
//        // 실수 -> String으로 변환
//        System.out.println(String.valueOf(double1) + "가나다");
//        System.out.println(double1 + "가나다");

        // 소문자 또는 대문자 q를 입력하면 "입력 없음", 숫자를 입력하면 짝수/홀수를 구분하는 조건문을 만들어보세요.
        // String은 참조자료형입니다.
        String num = "q";

        if (num == "q" || num == "Q") {
            System.out.println("입력 없음");
        } else {
            int num2 = Integer.valueOf(num); // String -> int로 형변환 Integer Wrapper 클래스 안의 형변환 함수를 사용
            String check = (num2 % 2 == 0) ? "짝수" : "홀수";
            System.out.println(check);
        }
    }


}
