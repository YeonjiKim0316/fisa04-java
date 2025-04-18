package scheduleEx;

public class RoundRobin implements Schedule {
    @Override
    public void getNextCall() {
        System.out.println("- 1. 대기열에서 고객을 순서대로 넘깁니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("- 2. 상담전화를 전화를 마친 상담원에게 배분합니다.");
    }
}
