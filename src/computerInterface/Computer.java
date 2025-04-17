package computerInterface;

// 점검표 역할
// 추상클래스와 마찬가지로 상속받은 자식클래스에서는
// 인터페이스에 작성된 추상 값들이 모두 구현되어야만 동작합니다.
// 생성자 정의 불가
public interface Computer {

    // 절대 바뀌지 않을 상수들
    // 아무것도 넣지 않아도 final로 취급합니다.
    String power = "off";

    // 추상 메서드들
    void powerOn();
    void powerOff(int offTime);

    // 구상 메서드들
    default void login() {
        System.out.println("인터페이스 구현 받아서 로그인 완료");
    }

    // 특정 함수들의 순서를 고정해서 사용할 때 정의하는 메서드
    // 템플릿 메서드 (순서를 정의하는 메서드)
    default void run() {
        powerOn();
        login();
        System.out.println("인터페이스 구현받아서 작업 중....");
        powerOff(10);
    }
}
