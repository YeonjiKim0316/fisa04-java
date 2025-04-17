package computerInterface;

// 인터페이스를 구현하려면 implements 키워드로 가져옵니다.
public class NoteBook implements Computer {
    @Override
    public void powerOn() {
        System.out.println("키보드 위의 전원 켭니다");
    }

    @Override
    public void powerOff(int offTime) {
        System.out.println(offTime + "후 꺼집니다");


    }
}
