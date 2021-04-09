public class C {
    // TODO: C와 D가 직접적인 관계가 아닐 경우에는 C가 D대신에 다른 class를 사용하기 위해서는
    // TODO: C의 methodC(I i)를 변경 하지 않아도 됨
    // TODO: 단지 interface I를 구현한 또 다른 클래스 E를 작성하기만 하면 됨
    public void methodC(I i) {
        i.methodI();
    }
}
