public interface Unit {
    // TODO: interface의 구성요소는 추상메서드와 상수만 가능
    public static final int X = 100;
    // TODO: 모든 멤버 변수는 public static final 이어야 하며 생략 가능
    int Y = 100;

    public abstract void move(int x, int y);
    // TODO: 모든 메서드는 public abstract 이어야 하며 생략 가능
    void stop();

}
