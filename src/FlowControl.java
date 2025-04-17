import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
//        1. if (조건) {
//            조건을 만족할 때의 수행문
//        } else if (두번째 조건) {
//            두번째 조건을 만족할 때의 수행문
//        } else {
//            앞의 내용이 거짓일 때
//        }
// age라는 변수에 입력된 나이가 18세보다 크거나 같을 경우 ‘어른입니다’를 콘솔창에 출력하는 조건문을 만들어주세요
        // 파이썬의 input 처럼 표준 입력(키보드)로 값을 입력받는 Scanner라는 객체로
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int age = sc.nextInt();

        // 딱 18세인 경우 생일이 지났으면 어른입니다.
//        if (age > 18) {
//            System.out.println("어른입니다");
//        } else if ( age == 18) {
//            System.out.println("생일이 지났으면 어른입니다");
//        } else {
//            System.out.println("어른이 아닙니다");
//        }

        // 2. switch는 정해진 값(정수, Enum, String)을 가지고 분기를 만들 때 사용됩니다.
        // GET / POST 로 요청을 받아서 구분할 때
        // 사용자 권한에 따라 특정 주소에 접근할 수 있게 할 때
        // 에러코드를 미리 ENUM으로 만들어놓고 에러코드를 돌려줄 때

//        switch (age) {
//            case 18: // 참1
//                System.out.println("생일이 지났으면 어른입니다.");
//                break;
//            default: // 참1도 참2도 아닌 경우
//                if (age > 18) {
//                    System.out.println("어른입니다.");
//                } else {
//                    System.out.println("어른이 아닙니다.");
//                }
//
//                break;
//        }

        // 3. 삼항연산자로 18살보다 어리면 어른이 아닙니다, 18보다 크거나 같으면 어른입니다.를 콘솔에 출력해보세요.
//        (판단식) ? 참 : 거짓

        String check = (age >= 18) ? "어른입니다" : "어른이 아닙니다";
        System.out.println(check);
    }
}
