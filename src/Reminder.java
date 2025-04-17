import java.util.*;

public class Reminder {
    public static void main(String[] args) {
//        // Ctrl + D 한 줄 복사
//        // Ctrl + X 한줄 삭제하면서 클립보드에 저장
//        // Shift + F10 출력
//        // 배열 Array
//        int[] arr = {1, 2, 3}; // 값을 넣어서 arr만들었고
//        arr[1] = 11;
//
//        System.out.println(Arrays.toString(arr));
//
//        boolean[] bools =  new boolean[5]; // 방만 만들어놓고 나중에 값을 넣음
//        System.out.println(Arrays.toString(bools));
//
//        // <> 제너릭 안에 이 변수에서 관리할 자료형을 규정합니다.
//        List<String> lis = new ArrayList<>();
//        lis.add("가"); // 삽입
//        lis.add("나"); // 삽입
//
//        // 조회
//        System.out.println(lis.get(0));
//
//        lis.remove("가"); // 삭제 - 값 자체
//        System.out.println(lis);
//
//        lis.remove(0); // 삭제
//        System.out.println(lis);
//
//        lis.add("가");
//        lis.set(0, "다");  // 수정
//        System.out.println(lis);
//
//        // HashMap - DICTIONARY와 유사한 성질
//        Map<String, Integer> map = new HashMap<>();
//        // age, 11 / age2, 21 을 넣어보시고 (put)
//        // age라는 키 안에 들어있는 value를 꺼내서 출력
//        // age2라는 키 안에 들어있는 값을 31로 바꾸고
//        // age2라는 키를 삭제해보세요.
//        map.put("age", 11);
//        map.put("age2", 21);
//        System.out.println(map);
//        System.out.println(map.keySet()); // key
//        System.out.println(map.values()); // value
//        System.out.println(map.entrySet()); // k-v
//        System.out.println(map.get("age")); // k-v
//        map.put("age2", 31); // 수정과 삽입의 명령어가 동일
//        System.out.println(map);
//        map.remove("age2");
//        System.out.println(map); // 삽입,삭제,조회가 빈번한 어떤 자료들을 관리할 때는
//
//        // HashSet - 중복 불가한
//        // 기본자료형 -> 기본자료형 (int) "12";
//        // 참조자료형 <-> 기본자료형  변경할자료형의WrapperClass.valueOf(변수형)
        Set<String> set = new HashSet<>();
//        set.add("가");
//        set.add(String.valueOf(true));
//        System.out.println(set);
//        set.remove("true");
//        System.out.println(set.size()); // 방의 길이를 나타내는 명령어
//
//        // 개발자가 정해놓은 값만 들어갈 수 있도록 특정 값들을 상수처럼 고정하는 ENUM
//        DAY today = DAY.THU;
//        System.out.println(today);

        // 조건문 : if ~ else if~ else 문 / switch ~ case / 삼항연산자
        int num = 0;
        // num이 0 이상이면 양수입니다. 아니면 음수입니다. 를 출력하는 간단한 조건문을
        // 1. if문으로 작성
        if (num > 0) {
            System.out.println("양수입니다");
        } else if (num == 0 ) {
            System.out.println("0입니다.");
        } else{
            System.out.println("음수입니다");
        }

        // 2. 삼항연산자
        String check = (num >=0) ? "양수입니다" : "음수입니다";
        System.out.println(check);

        // 3. switch-case문으로 작성
        switch (num >=0 ? 1 : 0) {
            case 1:
                System.out.println("양수입니다");  // switch 문에서 처음 실행될 실행문의 자리
                break;
            default:
                System.out.println("음수입니다");
        }

    }
}

enum DAY {
    MON, TUE, WED, THU, FRI, SAT, SUN
}