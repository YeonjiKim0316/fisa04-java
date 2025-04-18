package paymentEx;

public class NaverPayPayment extends Payment implements Refundable {

    // 클래스에서 모두 공유하는 공유변수
    static String paymentBy = "네이버페이";

    NaverPayPayment(double amount){
        super(amount);
    }

    @Override // 상속받을, 구현할 부모클래스에서 실제로 작성이 되어있는지 함수시그니처를 확인해주는 어노테이션
    void processPayment() {
        System.out.println(paymentBy + "로 " + getAmount() + "원을 결제합니다.");
    }

    @Override
    public void refund() {
        System.out.println(paymentBy+"로 결제한" + getAmount() + "원을 환불합니다.");
    }
}
