package oop;

public class Student {
    // field
    String name;
    int age;

    // 생성자(constructor)는 인스턴스를 만들 때 딱 한번 실행됩니다.
    // 클래스를 만들 때 생성자를 아무것도 작성하지 않으면 초기값 없이 인스턴스를 만드는 생성자를 자동으로 넣어줍니다.
    // this 를 생략하면 메서드 안에서 지역변수명과 겹치지 않는다면 this.를 컴파일러가 추가합니다.
    Student(){
        this("이름없음", -1); // this() 인스턴의 메모리주소를 찾아서 디폴트파라미터로 전달
    }

    // 클래스 이름과 같은 이름으로 작성합니다.
    // 자바 컴파일러는 메서드를 호출시 메서드 이름과 파라미터 리스트(함수 시그니처)로 함수를 구분합니다.
    // 메서드 이름은 같지만 파라미터 리스트가 다르도록 여러개를 작성해놓으면 서로 다른 시그니처로 구분해서 사용할 수 있게 합니다.
    // 오버로딩 (메서드를 만들 때 다른 파라미터를 사용하면 다른 방식으로 동작하도록 몇개든지 같은 함수명을 작성하는 방법)
    Student(String name2){
        this.name = name2; // this.name = name;
    }; // 이름을 받아서 인스턴스를 만들겠다

    Student(String name2, int age2){
        this.name = name2;
        age = age2; // 컴파일러가 this를 추가해준다.
    }; // 이름, 나이

    // method - return이 있는 함수 / return이 없는 함수  *  파라미터가 있는 함수 / 파라미터가 없는 함수
    String enter() {  // 리턴할자료형 메서드명(입력받을 파라미터) { 실행문 }
        return "입실했습니다";
    }

    void exit(int time) { // 특정메서드가 동작만 하고 return이 없다면 void로 채워줍니다.
        System.out.println(time+" 시에 퇴실했습니다.");
    }

    void exit(String place) { // 특정메서드가 동작만 하고 return이 없다면 void로 채워줍니다.
        System.out.println(place+"에서 퇴실했습니다.");
    }

    void exit(int time, String place) { // 특정메서드가 동작만 하고 return이 없다면 void로 채워줍니다.
        System.out.println(time+"시에 "+place+"에서 퇴실했습니다.");
    }

    String exit(int time, String place, String place2) { // 특정메서드가 동작만 하고 return이 없다면 void로 채워줍니다.
        return time+"시에 "+place+"에서 "+ place2+"로 퇴실했습니다.";
    }

    // introduce라는 리턴도 없고 입력파라미터도 없는 메서드를 만드셔서 kim / shin / lee에 name, age에 뭐가 들어있는지 확인해주세요.
    void introduce() {
        System.out.println(this.name + " / " + this.age);
    }

    //  이너클래스(inner class)
    // 외부 클래스와 관련된 특성들을 안에서 작성해놓고 사용합니다. (캡슐화)
    class Grade {
        // 필드(속성)
        int score;

        // 생성자
        Grade(int score) {
            this.score = score;
        }

        // 메서드
        String getGrade() {
            if (score >= 90) {
                return "A";
            } else if (score >= 80) {
                return "B";
            } else {
                return "C";
            }
        }
    }
}
