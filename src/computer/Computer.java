package computer;

// 추상클래스 - 상속을 받아서 이용할 기능들을 점검(추상적으로)하기 위한 추상 메서드들과
// 어느 자식클래스에서건 꼭 있어야 하는 구체적 기능 또는 변수들을 적어줍니다.
// 자식클래스에서 override가 불가능하게 만들어야 하는 메서드에는 final 이라는 키워드 변경 불가하게 못박습니다.
public abstract class Computer {
    
    String power; // 인스턴스 변수
    
    // 생성자
    Computer() {
        this.power = "off";
    }

    // 구상메서드
    public void login() {
        System.out.println("로그인 완료");
    }

    // 추상메서드
    abstract void powerOn(); // 함수 시그니처만 작성
    abstract void powerOff(int offTime);

    // 특정 함수들의 순서를 고정해서 사용할 때 정의하는 메서드
    // 템플릿 메서드 (순서를 정의하는 메서드)
    // final -> 상속받아도 변경이 불가하도록 최종 도장을 찍어줍니다.
    final void run() {
        powerOn();
        login();
        System.out.println("작업 중....");
        powerOff(10);
    }
}
