package flowControl;

public class FlowControl3 {
    public static void main(String[] args) {

//        // ++, -- 증감연산자 있음. 전위 / 후위식으로 사용됩.
//        int a = 1;
//        int b = 2;
////        System.out.println(a++); // 쓰고 하나 더해서 집어넣어. 증가연산자를 후위식
////        System.out.println(++a); // 쓰기 전에 1더해서 써. 증가연산자를 전위식
//
//        // 논리연산자 and(&&)  or(||)  not(!) - circuit evalution 앞의 조건이 만족되면 뒤는 보지도 않고 넘어갑니다.
//        int c = 3;
//        System.out.println( (a < b) && (b < c)); // true
//        System.out.println( (b > c) || (a < b) ); // true
//        System.out.println( !(b > c)); //true
//
//        System.out.println("------------------------------------");
//        // 비트연산자  and(&) or(|) not(~) - 모든 조건을 확인합니다.
//        System.out.println( (a < b) & (b < c)); // true
//        System.out.println( (b > c) | (a < b)); // true
//        System.out.println( ~b ); // -3   true/false를 반환하지 않는다
//
//        System.out.println("--------------------------");
//        boolean a1 = false;
//        boolean a2 = true;
//        boolean a3 = false;
//
//        // 논리연산자 - 앞이 참이면 뒤는 보지 않고 끝
//        System.out.println(a1 && (a3 = true) );
//        System.out.println(a3);
//
//        System.out.println("-------------------------------");
//        a3 = false;
//        // 비트연산자 - 모든 조건을 확인
//        System.out.println(a1 & (a3 = true) );
//        System.out.println(a3);

        // q를 입력하면 "입력 없음", 숫자를 입력하면 짝수/홀수를 구분하는 조건문을 만들어보세요.
        // String은 참조자료형입니다.
        String num = "150";

        if (num == "q") {
            System.out.println("입력 없음");
        } else {
            int num2 = Integer.valueOf(num); // String -> int로 형변환 Integer Wrapper 클래스 안의 형변환 함수를 사용
            String check = (num2 % 2 == 0) ? "짝수" : "홀수";
            System.out.println(check);
         }
        }

    }

