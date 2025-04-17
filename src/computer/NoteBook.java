package computer;

public class NoteBook extends Computer {
    @Override
    void powerOn() {
        System.out.println("키보드 위의 전원을 누릅니다.");
    }

    @Override
    void powerOff(int offTime) {
        System.out.println(offTime+" 내로 종료됩니다.");
    }

}
