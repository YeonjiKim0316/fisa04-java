package scheduleEx;

import java.util.Scanner;

public interface Schedule {
    void getNextCall();
    void sendCallToAgent();

    // 템플릿메서드(바뀌지 않을 순서를 정의하는 메서드)로 기능
    // 클래스를 통해서 접근 가능한 클래스 메서드
    public static void run() {

        while (true) {

            // Scanner 객체를 사용하여
            System.out.println("연결방식 선택 R, P, L / 종료는 Q");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().toUpperCase().charAt(0);

            // 자료형 변수명 = new 구현방식을의미하는생성자();
            Schedule sch = null; // NullPointerException - 변수에 메모리가 할당되지 않았는데 명령을 시키고 있어서
            // 1. if null -> 값을 대입하는 것
            if (sch == null) {
                sch = new LeastJob();
            }

//             2. Schedule 클래스로 된 객체를 만들때 초기값으로 무언가를 넣어주는 것
//               Schedule sch = new LeastJob();
            // R, r 을 입력시 sch에 new RoundRobin()
            // L, l - LeastJob
            // P, p - Priority로 인스턴스를 생성하도록 조건문을 만들어주세요
            // Q, q - 시스템을 종료합니다
            if (c == 'Q') {
                System.out.println("프로그램 종료");
                sc.close(); // 자원 반납 후 종료
                break;
            }
            else if ( c == 'R') { // char은 작은따옴표로 감싸줍니다. - 단일문자이므로 문자열인 String(" ")과 다름
                System.out.println("Round Robin");
                sch = new RoundRobin();
                // R의 방식으로 고객을 대기열에서 받아서 상담원에게 넘기는 순서를 구현해주십시오.
            } else if (c == 'P') {
                System.out.println("Priority");
                sch = new Priority();
            } else if (c == 'L') {
                System.out.println("Least Job");
                sch = new LeastJob();
            }

            sch.getNextCall();
            sch.sendCallToAgent();
        }
    }
}
