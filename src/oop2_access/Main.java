package oop2_access;

// 접근제어자 public > protected > default > private
// | 접근 제어자 | 같은 클래스의 멤버 | 같은 패키지의 멤버 | 자식 클래스의 멤버 | 그 외의 영역 |
// | ---    | --- | --- | --- | --- |
// | public |   ○ |   ○ |   ○ |   ○ |
// | protected | ○ |  ○ |   ○ |   X |
// | default |  ○ |   ○ |   X |   X |
// | private |  ○ |   X |   X |   X |
public class Main {
    public static void main(String[] args) {
        MyPublic myPublic = new MyPublic();
        System.out.println(myPublic.msg);
        myPublic.print();

        MyPrivate myPrivate = new MyPrivate();
        System.out.println();  // private 변수, 메서드는 외부에서 접근 불가합니다.
        myPrivate.insideCheck(); // 은닉성 - 안에 뭐가 들어있는지 알 수 없어도 외부 접근이 가능한 메서드로 crud는 가능해진다.

        System.out.println("---------------------------------");
        MyProtected myProtected = new MyProtected();
        myProtected.print(); // protected method

        System.out.println("---------------------------------");
        MyDefault myDefault = new MyDefault();
        myDefault.print(); // default 제어자로 선언한 메서드는 자기 패키지 내에서 사용 가능
    }
}
