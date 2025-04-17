import java.util.ArrayList;
import java.util.Arrays;

public class FlowControl6 {
    public static void main(String[] args) {
//        // 1. 알아보기 좋은 코드
//        // 2. 필요한 동작만 하는 코드
//
//        // for - 횟수가 정해진 반복문    1, 10 사이에서 2씩 건너뛰는 for문 1개
///*        for (초기값; 조건식; 증감식) {
//            끝날때까지 동작할 실행문
//        }*/
//        for (int i=1; i <=10; i=i+2) {
//            System.out.println(i);
//        }
//
//        // while - 횟수가 정해져있지 않은 반복문
//        System.out.println("----------------------");
//        int num = 1;
//
//        while (num <=10) {
//            System.out.println(num);
//            num += 2;
//        }

        // 배열(Array)의 경우에 length 가변참조형 .size() 라는 메서드로 길이를 확인할 수 있습니다.
        String[] cheese = {"cheddar", "gouda", "edam", "provolone", "parmesan"};

        for (int i =0; i < cheese.length ; i++) {
            System.out.println(cheese[i]);
        }

        ArrayList<String> cheeseList = new ArrayList<>(Arrays.asList("cheddar", "gouda", "edam", "provolone", "parmesan"));
        // cheese에 들어있는 모든 치즈 / cheeseList에 들어있는 모든 치즈들을 각각 돌면서 출력해주세요.
        for (int i =0; i < cheeseList.size() ; i++) {
            System.out.println(cheeseList.get(i)); // get(인덱스번호)
        }

        System.out.println("-----------------------------------");
        // for ~ each - 집합자료형이면 어떤 자료형이건 무관하게 직접 값을 꺼내서 사용할 수 있습니다.
        // i = i+2처럼 조건식을 일부 건너뛰거나 할 수 없이 모든 원소에 적용할 때 사용합니다.
        for (String chees : cheese) {
            System.out.println(chees+"먹고 싶다");
        }

        // break - 만나면 전체 반복문을 종료
        // continue - 만나면 이번 한번만 반복문을 skip

        // -- 짝수일 때는 출력, 홀수일 때는 skip: continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // 홀수
                continue;
            }
            System.out.println(i);
        }


        //  while - 횟수가 정해져있지 않은 반복문
        // -- i=7이면 무한반복을 종료 하는 반복문 : break
        System.out.println("----------------------");
//        int num = 1;
//
//        while (true) {
//            System.out.println(num);
//            if (num == 7) {
//                break;
//            }
//            num++;
//        }
        
        // 무조건 한번은 조건 판단 없이 실행하고 나서 그 조건을 판별  do ~ while
//        int num = 11;
        int num = 9;
        do {
            System.out.println(num);
            num++;
        } while (num <= 7);

    }
}
