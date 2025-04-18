package paymentEx;

// 추상클래스 - 추상메서드, 구상메서드, 생성자
//### **1. 추상 클래스 - `Payment`**
//
//        - 모든 결제 수단이 가져야 할 **공통 속성**과 **기능**을 정의합니다.
//        1. **필드**:
//        - `amount` (double): 결제 금액 (**접근 제어자** 사용) v
//2. **메서드**:
//        - **추상 메서드** `processPayment()` – 결제를 처리합니다.
//        - **일반 메서드** `displayAmount()` – 결제 금액을 출력합니다.
//3. **정적 필드**와 **정적 메서드**를 사용해 **전체 결제 건수**를 관리합니다.

public abstract class Payment {
    private double amount; // 현재 클래스 내에서만 접근 가능 - 0.0으로 초기화

    // 생성자
    public Payment(double amount) {
        this.amount = amount;
    }
    
    // 상속받은 자식클래스에서 서로 다른 방식으로 구현하되 꼭 있어야하는 메서드
    abstract void processPayment();

    // 원래는 private 변수라서 외부에서 볼 수 없는 amount를 콘솔에 출력
    public void displayAmount(){
        System.out.println(this.amount);
    }

    // 부모 클래스에서만 쓸 수 있는 private 변수를 다른 클래스에서 return 받아서 쓸 수 있는 메서드를 만듭니다.
    public double getAmount(){
        return this.amount;
    }
}
