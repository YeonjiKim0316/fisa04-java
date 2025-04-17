package computer;

public class CompterRun {
    public static void main(String[] args){
        NoteBook noteBook = new NoteBook();
        noteBook.run(); // 템플릿 메서드를 부모클래스에서 상속받아서 사용할 수 있습니다.
        System.out.println("----------------");
        DeskTop deskTop = new DeskTop();
        deskTop.run();


    }
}
