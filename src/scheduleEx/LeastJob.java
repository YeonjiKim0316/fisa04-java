package scheduleEx;

public class LeastJob implements Schedule {
    @Override
    public void getNextCall() {
        System.out.println(" - 1. 대기열에서 고객을 순서대로 넘깁니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("- 2. 상담전화 대기열이 가장 짧은 상담원에게 배분합니다.");
    }
}
