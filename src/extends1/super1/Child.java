package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    // 부모로부터의 기능을 가져옴
    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    /**
     * this._ : 자기자신의 기능
     * super._ : 부모의 기능
     * -> 자식에서 부터 탐색하는것이 아니라 부모의 영역으로가서 찾게 됨
     */
    public void call() {
        System.out.println("this value = " + this.value); //this 생략 가능
        System.out.println("super value = " + super.value);

        this.hello(); //this 생략 가능
        super.hello();
    }
}
