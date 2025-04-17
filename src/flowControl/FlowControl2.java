package flowControl;

import java.util.Scanner;

public class FlowControl2 {
    public static void main(String[] args) {
//  특정 int로 입력받은 값이 짝수이면 짝수 / 홀수이면 홀수를 출력하도록
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하면 짝수/홀수를 판별해줄겁니다: ");
        int num = sc.nextInt();
        
//        1. if문
//        if (num % 2 == 0) {
//            System.out.println("짝수입니다");
//        } else {
//            System.out.println("홀수입니다");
//        }
                
//        2. switch문
//        switch (num % 2) {
//            case 0:
//                System.out.println("짝수입니다");
//                System.out.println("짝수입니다2");
//                break;
//            default:
//                System.out.println("홀수입니다");
//                break;
//        }

        // switch문에 -> 케이스로도 쓸 수 있습니다. 21
        switch (num % 2) {
            case 0 -> {  // 실행문이 여러개일 때는 { 안에 여러개 } 넣어줍니다.
                System.out.println("짝수입니다");
                System.out.println("짝수입니다2");
            }
            default -> System.out.println("홀수입니다");
        }
            
//        3. 삼항연산자
        String check = (num % 2 == 0) ? "짝수입니다" : "홀수입니다";
        System.out.println(check);
        }

    }

