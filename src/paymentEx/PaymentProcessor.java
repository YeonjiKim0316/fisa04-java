package paymentEx;

public class PaymentProcessor {

    // Payment라는 부모클래스로 만들어진 객체를 모두 한번에 받아서 사용할 수 있도록 업캐스팅
    static void process(Payment payment){
        payment.displayAmount(); // 결제 금액 확인
        payment.processPayment(); // 결제 진행
    }


}
