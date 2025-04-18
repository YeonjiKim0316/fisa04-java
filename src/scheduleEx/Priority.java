package scheduleEx;

public class Priority implements Schedule {
    @Override
    public void getNextCall() {
        System.out.println("- 1. 대기열에서 우선순위가 높은 고객을 먼저 줄세웁니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("- 2. 상담전화를 일 잘하는 상담원에게 먼저 배분합니다.");
    }
}
