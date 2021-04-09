public class A {
    // TODO: A와 B가 직접적인 관계일 경우에는 A가 B대신에 다른 class를 사용하기 위해서는
    // TODO: methodA(C c)로 A의 변경이 불가피했음
    public void methodA(B b) {
        b.methodB();
    }
}
