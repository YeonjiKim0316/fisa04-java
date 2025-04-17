package computerInterface;

public class ComputerRun {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        noteBook.run();
//        noteBook.power = "변경";
        System.out.println(noteBook.power);
    }
}
